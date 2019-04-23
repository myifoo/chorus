package com.platform.chorus.web.model;

import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.Collector;
import com.platform.chorus.db.tables.pojos.FieldModel;

import java.util.List;

/**
 * Create by A.T on 2019/4/23
 */
public class SchemaImportModel {
    private List<ClassModel> classes;
    private List<Collector> collectors;
    private List<FieldModel> fields;

    public List<ClassModel> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassModel> classes) {
        this.classes = classes;
    }

    public List<Collector> getCollectors() {
        return collectors;
    }

    public void setCollectors(List<Collector> collectors) {
        this.collectors = collectors;
    }

    public List<FieldModel> getFields() {
        return fields;
    }

    public void setFields(List<FieldModel> fields) {
        this.fields = fields;
    }
}
