package com.platform.chorus.cim.model;

import com.platform.chorus.cim.exception.ModelSaveException;
import com.platform.chorus.db.neo4j.GraphTemplate;
import com.platform.chorus.db.services.ClassModelService;
import com.platform.chorus.db.services.FieldModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.FieldModel;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void deleteClass(String pkg, String name) {
        try {
            daoService.delete(pkg, name);
        } catch (Exception e) {
            logger.error("delete class model failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
            return;
        }

        try {
            deleteClassGraphNode(pkg, name);
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

    private void createClassGraphNode(ClassModel model) {
        String classPath = model.getPackage()+'.'+model.getName();
        template.run(getClassNodeClause(classPath, model.getPackage(), model.getName()));

        String parent = model.getExtend();
        if (Strings.isNotEmpty(parent)) {
            template.run(getCreateRelationClause(toClassLabels(classPath), toClassLabels(model.getExtend()), "extend"));
        }
    }

    private void createFieldGraphNode(FieldModel model) {
        template.run(String.format("CREATE (node:%s { type: '%s', name: %s, label: %s})",
                toFieldLabels(model.getOwner(), model.getName()), model.getClass_(), model.getName(), model.getLabel()));

        template.run(getCreateRelationClause(toClassLabels(model.getOwner()), toFieldLabels(model.getOwner(), model.getName()), "own"));

        if (Arrays.stream(PRIMITIVE_TYPES).noneMatch(t -> t.equals(model.getClass_()))) {
            template.run(getCreateRelationClause(toClassLabels(model.getOwner()), toClassLabels(model.getClass_()), "reference"));
        }
    }

    private void deleteClassGraphNode(String pkg, String name) {
        template.run(String.format("MATCH (a:%s:%s)-[r]-(n) delete r", toClassLabels(pkg), name));
        template.run(String.format("MATCH (node:%s:%s) delete (node)", toClassLabels(pkg), name));
    }

    private String getClassNodeClause(String path, String _package, String name) {
        return String.format("CREATE (node:%s {package:'%s', name:'%s' }) ", toClassLabels(path), _package, name);
    }

    private String getCreateRelationClause(String a, String b, String relation) {
        return String.format("MATCH (a:%s), (b:%s) CREATE (a)-[r:%s]->(b)", a, b, relation);
    }

    private String toLabels(String path) {
        return String.join(":", path.split("\\."));
    }

    private String toClassLabels(String path) {
        return "class:" + toLabels(path);
    }

    private String toFieldLabels(String path, String name) {
        return "field:" + toLabels(path)+":"+name;
    }

}
