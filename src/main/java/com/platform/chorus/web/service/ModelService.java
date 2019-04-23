package com.platform.chorus.web.service;

import com.platform.chorus.cim.model.CIModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.Collector;
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
    CIModelService modelService;

    public List<Integer> create(List<ClassModel> models) {
        return modelService.createClass(models);
    }

    public Integer create(ClassModel model) {
        return modelService.createClass(model);
    }

    public List<Integer> createCollectors(List<Collector> collectors) {
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
