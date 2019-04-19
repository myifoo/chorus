package com.platform.chorus.web.service;

import com.platform.chorus.db.services.ClassModelService;
import com.platform.chorus.db.services.FieldModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.FieldModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by A.T on 2019/4/18
 */
@Service
public class ModelService {
    @Autowired
    ClassModelService daoService;

    @Autowired
    FieldModelService fieldDaoService;

    public List<Integer> create(List<ClassModel> models) {
        return daoService.save(models);
    }

    public Integer create(ClassModel model) {
        return daoService.save(model);
    }

    public List<ClassModel> getAllClass() {
        return daoService.getAll();
    }

    public List<String> getAllClassFullName() {
        return daoService.getAllFullName();
    }

    public String getClassHtml() {
        return daoService.getHtml();
    }

    public Integer createField(FieldModel model) {
        return fieldDaoService.save(model);
    }

    public List<FieldModel> getAllField() {
        return fieldDaoService.getAll();
    }

    public String getFieldHtml() {
        return fieldDaoService.getHtml();
    }
}
