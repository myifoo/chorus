package com.platform.chorus.cim.model;

import com.platform.chorus.db.neo4j.GraphTemplate;
import com.platform.chorus.db.services.ClassModelService;
import com.platform.chorus.db.services.FieldModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
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

@Component
public class CIModelServiceImpl implements CIModelService{
    final static Logger logger = LoggerFactory.getLogger(CIModelService.class);
    final static String[] PRIMITIVE_TYPES = {"string", "integer", "float", "boolean", "long", "double"};

    @Autowired
    private ClassModelService daoService;

    @Autowired
    private FieldModelService fieldDaoService;

    @Autowired
    private GraphTemplate template;

    public List<Integer> create(List<ClassModel> models) {
        List<Integer> ids;
        try {
            ids = daoService.save(models);
        } catch (Exception e) {
            logger.error("create class model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return new ArrayList<>();
        }

        models.forEach(this::createClassGraphNode);
        return ids;
    }

    public Integer create(ClassModel model) {
        Integer id;
        try {
            id = daoService.save(model);
        } catch (Exception e) {
            logger.error("create class model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return -1;
        }

        try {
            createClassGraphNode(model);
        } catch (Exception e) {
            logger.error("create class graph node failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }
        return id;
    }

    @Override
    public void deleteClass(String domain, String name) {
        try {
            daoService.delete(domain, name);
        } catch (Exception e) {
            logger.error("delete class model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return;
        }

        try {
            deleteClassGraphNode(domain, name);
        } catch (Exception e) {
            logger.error("delete class graph node failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    public Integer createField(FieldModel model) {
        Integer fid;
        try {
            fid = fieldDaoService.save(model);
        } catch (Exception e) {
            logger.error("create field model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return -1;
        }

        try {
            createFieldGraphNode(model);
        } catch (Exception e) {
            logger.error("create field graph node failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }
        return fid;
    }

    @Override
    public void deleteField(String owner, String name) {
        try {
            fieldDaoService.delete(owner, name);
        } catch (Exception e) {
            logger.error("delete field failed: {}.{}", owner, name);
        }

        deleteFieldGraphNode(owner, name);
    }

    @Override
    public List<Integer> createField(List<FieldModel> models) {
        List<Integer> ids;
        try {
            ids = fieldDaoService.save(models);
        } catch (Exception e) {
            logger.error("create field model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return new ArrayList<>();
        }

        models.forEach(this::createFieldGraphNode);
        return ids;
    }

    @Override
    public List<FieldModel> getFieldByOwner(String owner) {
        StatementResult result = template.query(String.format("match (a:%s)-[r:extend|reference *1..5]->(b) return b.domain, b.name", makeClassId(owner)));

        List<String> owners = result.stream().map(r -> r.get(0).asString() + "." + r.get(1).asString()).collect(Collectors.toList());
        owners.add(owner);

        return fieldDaoService.getByOwners(owners.toArray(new String[0]));
    }

    private void createClassGraphNode(ClassModel model) {
        template.createNode(makeClassId(model.getDomain(), model.getName()),
                String.format("{ domain: '%s', name: '%s'}", model.getDomain(), model.getName()));

        String parent = model.getExtend();
        if (Strings.isNotEmpty(parent)) {
            template.createRelation(makeClassId(model.getDomain(), model.getName()),
                    makeClassId(model.getExtend()), "extend");
        }
    }

    private void createFieldGraphNode(FieldModel model) {
        template.createNode(makeFieldId(model.getOwner(), model.getName()),
                String.format("{ type: '%s', name: '%s', label: '%s'}", model.getType(), model.getName(), model.getLabel()));

        template.createRelation(
                makeClassId(model.getOwner()),
                makeFieldId(model.getOwner(), model.getName()),
                "own");

        if (Arrays.stream(PRIMITIVE_TYPES).noneMatch(t -> t.equals(model.getType()))) {
            template.createRelation(
                    makeClassId(model.getOwner()),
                    makeClassId(model.getType()),
                    "reference");
        }
    }

    private void deleteClassGraphNode(String domain, String name) {
        template.deleteRelation(makeClassId(domain,name));
        template.deleteNode(makeClassId(domain,name));
    }

    private void deleteFieldGraphNode(String owner, String name) {
        template.deleteRelation(makeFieldId(owner, name));
        template.deleteNode(makeFieldId(owner, name));
    }

    private String toLabels(String path) {
        return String.join(":", path.split("\\."));
    }

    private String makeClassId(String domain, String name) {
        return "class:" + toLabels(domain) + ":" + name;
    }

    private String makeClassId(String classPath) {
        return "class:" + toLabels(classPath);
    }

    private String makeFieldId(String owner, String name) {
        return "field:" + toLabels(owner) + ":" + name;
    }

}
