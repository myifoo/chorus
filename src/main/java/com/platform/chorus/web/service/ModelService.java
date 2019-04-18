package com.platform.chorus.web.service;

import com.platform.chorus.database.services.ClassModelService;
import com.platform.chorus.database.tables.pojos.ClassModel;
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

    public List<Integer> create(List<ClassModel> models) {
        return daoService.save(models);
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
}
