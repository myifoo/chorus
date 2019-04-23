package com.platform.chorus.cim.model;

import com.platform.chorus.db.neo4j.GraphTemplate;
import com.platform.chorus.db.services.ClassModelService;
import com.platform.chorus.db.services.CollectorService;
import com.platform.chorus.db.services.FieldModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.Collector;
import com.platform.chorus.db.tables.pojos.FieldModel;
import org.apache.logging.log4j.util.Strings;
import org.neo4j.driver.v1.StatementResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by A.T on 2019/4/19
 */
@Component
public class CIModelServiceImpl implements CIModelService{
    final static Logger logger = LoggerFactory.getLogger(CIModelService.class);
    final static String[] PRIMITIVE_TYPES = {"string", "integer", "float", "boolean", "long", "double"};

    @Autowired
    private ClassModelService classService;

    @Autowired
    private FieldModelService fieldService;

    @Autowired
    private CollectorService collectorService;

    @Autowired
    private GraphTemplate template;

    interface Graph{
        void create();
        void delete();
    }

    class ClassGraph implements Graph{
        String domain;
        String name;
        String extend;

        ClassGraph(String domain, String name) {
            this.domain = domain;
            this.name = name;
        }

        ClassGraph(String domain, String name, String extend) {
            this.domain = domain;
            this.name = name;
            this.extend = extend;
        }

        @Override
        public void create() {
            template.createNode(getId(domain, name),
                    String.format("{ domain: '%s', name: '%s'}", domain, name));

            if (Strings.isNotEmpty(extend)) {
                template.createRelation(getId(domain, name),
                        getId(extend), EXTEND);
            }
        }

        @Override
        public void delete() {
            String nodeId = getId(domain, name);
            template.deleteRelation(nodeId);
            template.deleteNode(nodeId);
        }

        private String getId(String domain, String name) {
            return String.format("%s:%s:%s", "class", buildCommonId(domain), name);
        }

        private String getId(String classPath) {
            return String.format("%s:%s", "class", buildCommonId(classPath));
        }
    }

    class CollectorGraph implements Graph{
        String name;
        String result;

        CollectorGraph(String name) {
            this.name = name;
        }

        CollectorGraph(String name, String result) {
            this.name = name;
            this.result = result;
        }

        @Override
        public void create() {
            String collectorId = getId(name);

            template.createNode(collectorId, String.format("{ result: %s}", result));
            template.createRelation(collectorId, buildClassNodeId(result), COLLECT);
        }

        @Override
        public void delete() {
            String id = getId(name);
            template.deleteRelation(id);
            template.deleteNode(id);
        }

        private String getId(String name) {
            return String.format("%s:%s", "collector", name);
        }
    }

    class FieldGraph implements Graph{
        String owner;
        String name;
        String type;
        String label;

        FieldGraph(String owner, String name) {
            this.owner = owner;
            this.name = name;
        }

        FieldGraph(String owner, String name, String type, String label) {
            this.owner = owner;
            this.name = name;
            this.type = type;
            this.label = label;
        }

        @Override
        public void create() {
            template.createNode(getId(owner, name),
                    String.format("{ type: '%s', name: '%s', label: '%s'}", type, name, label));

            template.createRelation(
                    buildClassNodeId(owner),
                    getId(owner, name),
                    OWN);

            if (Arrays.stream(PRIMITIVE_TYPES).noneMatch(t -> t.equals(type))) {
                template.createRelation(
                        buildClassNodeId(owner),
                        buildClassNodeId(type),
                        REFERENCE);
            }
        }

        @Override
        public void delete() {
            String nodeId = getId(owner, name);
            template.deleteRelation(nodeId);
            template.deleteNode(nodeId);
        }

        private String getId(String owner, String name) {
            return String.format("%s:%s:%s", "field", buildCommonId(owner), name);
        }
    }


    @Override
    public List<ClassModel> getAllClass() {
        return classService.getAll();
    }

    @Override
    public List<FieldModel> getAllField() {
        return fieldService.getAll();
    }

    @Override
    public List<Collector> getAllCollector() {
        return collectorService.fetchAll();
    }

    @Override
    public String getAllClassHtml() {
        return classService.getHtml();
    }

    @Override
    public String getAllFieldHtml() {
        return fieldService.getHtml();
    }

    @Override
    public String getAllCollectorHtml() {
        return collectorService.getHtml();
    }

    @Override
    public List<String> getAllClassFullName() {
        return classService.getAllFullName();
    }

    public List<Integer> createClass(List<ClassModel> models) {
        List<Integer> ids;
        try {
            ids = classService.save(models);
        } catch (Exception e) {
            logger.error("createClass class model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return new ArrayList<>();
        }

        models.forEach(m->
            new ClassGraph(m.getDomain(), m.getName(), m.getExtend()).create()
        );
        return ids;
    }

    public Integer createClass(ClassModel model) {
        Integer id;
        try {
            id = classService.save(model);
        } catch (Exception e) {
            logger.error("createClass class model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return -1;
        }

        try {
            new ClassGraph(model.getDomain(), model.getName(), model.getExtend()).create();
        } catch (Exception e) {
            logger.error("createClass class graph node failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }
        return id;
    }

    @Override
    public void deleteClass(String domain, String name) {
        try {
            classService.delete(domain, name);
        } catch (Exception e) {
            logger.error("delete class model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return;
        }

        try {
            new ClassGraph(domain, name).delete();
        } catch (Exception e) {
            logger.error("delete class graph node failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    @Override
    public Integer createCollector(Collector collector) {
        collectorService.create(collector);
        new CollectorGraph(collector.getName(), collector.getResult()).create();

        return collector.getId();
    }

    @Override
    public List<Integer> createCollector(List<Collector> collectors) {
        collectorService.create(collectors);
        collectors.forEach(c->
            new CollectorGraph(c.getName(), c.getResult()).create()
        );

        return collectors.stream().map(Collector::getId).collect(Collectors.toList());
    }

    @Override
    public void deleteCollector(String name) {
        collectorService.delete(name);
        new CollectorGraph(name).delete();
    }

    public Integer createField(FieldModel model) {
        Integer fid;
        try {
            fid = fieldService.save(model);
        } catch (Exception e) {
            logger.error("createClass field model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return -1;
        }

        try {
            new FieldGraph(model.getOwner(), model.getName(), model.getType(), model.getLabel()).create();
        } catch (Exception e) {
            logger.error("createClass field graph node failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }
        return fid;
    }

    @Override
    public void deleteField(String owner, String name) {
        try {
            fieldService.delete(owner, name);
        } catch (Exception e) {
            logger.error("delete field failed: {}.{}", owner, name);
        }

        new FieldGraph(owner, name).delete();
    }

    @Override
    public List<Integer> createField(List<FieldModel> models) {
        List<Integer> ids;
        try {
            ids = fieldService.save(models);
        } catch (Exception e) {
            logger.error("createClass field model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return new ArrayList<>();
        }

        models.forEach(f->
                new FieldGraph(f.getOwner(), f.getName(), f.getType(), f.getLabel()).create()
        );
        return ids;
    }

    /**
     *  get all field of specific class, its full name is class domain plus class name;
     *
     * @param classFullName equals domain.name
     * @return FieldModel List
     */
    public List<FieldModel> getFields(String classFullName) {
        StatementResult result = template.query(String.format("match (a:%s)-[r:%s|%s *1..5]->(b) return b.domain, b.name", buildClassNodeId(classFullName), EXTEND, REFERENCE));

        List<String> classes = result.stream().map(r -> r.get(0).asString() + "." + r.get(1).asString()).collect(Collectors.toList());
        classes.add(classFullName);

        return fieldService.getByOwners(classes.toArray(new String[0]));
    }
}
