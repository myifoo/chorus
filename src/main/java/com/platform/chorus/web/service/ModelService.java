package com.platform.chorus.web.service;

import com.platform.chorus.cim.model.CIModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.Collector;
import com.platform.chorus.db.tables.pojos.FieldModel;
import com.platform.chorus.web.exception.ImportDuplicateClassException;
import com.platform.chorus.web.exception.ImportDuplicateCollectorException;
import com.platform.chorus.web.model.SchemaImportModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Create by A.T on 2019/4/18
 */
@Service
public class ModelService {
    @Autowired
    CIModelService modelService;

    public boolean validate(SchemaImportModel schema) {
        Set<String> classFullNameSet = new HashSet<String>(){{
            add("string");
            add("integer");
            add("long");
            add("boolean");
            add("double");
            add("float");
        }};

        Set<String> duplicateClass = new HashSet<>();
        schema.getClasses().forEach(c-> {
            String fullName = c.getDomain() + "." + c.getName();
            if (classFullNameSet.contains(fullName)) {
                duplicateClass.add(fullName);
            } else {
                classFullNameSet.add(fullName);
            }
        });

        if (!duplicateClass.isEmpty()) {
            throw new ImportDuplicateClassException(" import duplicate class is not allowed : " + String.join(", ", duplicateClass));
        }

        Set<String> notFoundClassSet = new HashSet<>();

        Set<String> collectors = new HashSet<>();
        Set<String> duplicateCollector = new HashSet<>();

        schema.getCollectors().forEach(c->{
            if (collectors.contains(c.getName())) {
                duplicateCollector.add(c.getName());
            } else {
                collectors.add(c.getName());
            }

            if (!classFullNameSet.contains(c.getResult())) {
                notFoundClassSet.add(c.getResult());
            }
        });

        if (!duplicateCollector.isEmpty()) {
            throw new ImportDuplicateCollectorException(" import duplicate collector is not allowed : " + String.join(", ", duplicateClass));
        }

        schema.getFields().forEach(f->{
            if (!classFullNameSet.contains(f.getOwner())) {
                notFoundClassSet.add(f.getOwner());
            }

            if (!classFullNameSet.contains(f.getType())) {
                notFoundClassSet.add(f.getType());
            }
        });

        if (!notFoundClassSet.isEmpty()) {
            throw new ImportDuplicateClassException(" class not found error : " + String.join(", ", notFoundClassSet));
        }

        return true;
    }

    public List<Integer> createClass(List<ClassModel> models) {
        return modelService.createClass(models);
    }

    public Integer createClass(ClassModel model) {
        return modelService.createClass(model);
    }

    public List<Integer> createCollector(List<Collector> collectors) {
        return modelService.createCollector(collectors);
    }

    public List<ClassModel> getAllClass() {
        return modelService.getAllClass();
    }

    public List<String> getAllClassFullName() {
        return modelService.getAllClassFullName();
    }

    public String getClassHtml() {
        return modelService.getAllClassHtml();
    }

    public Integer createField(FieldModel model) {
        return modelService.createField(model);
    }

    public List<Integer> createField(List<FieldModel> models) {
        return modelService.createField(models);
    }

    public List<FieldModel> getAllField() {
        return modelService.getAllField();
    }

    public String getFieldHtml() {
        return modelService.getAllFieldHtml();
    }
}
