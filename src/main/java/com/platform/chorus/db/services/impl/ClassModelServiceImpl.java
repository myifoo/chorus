package com.platform.chorus.db.services.impl;

import static com.platform.chorus.db.tables.ClassModel.*;
import static org.jooq.impl.DSL.concat;

import com.platform.chorus.db.services.ClassModelService;
import com.platform.chorus.db.tables.daos.ClassModelDao;
import com.platform.chorus.db.tables.pojos.ClassModel;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by A.T on 2019/4/10
 */
@Repository
public class ClassModelServiceImpl implements ClassModelService {
    private ClassModelDao dao;

    @Autowired
    DSLContext dsl;

    public ClassModelServiceImpl(Configuration configuration) {
        this.dao = new ClassModelDao(configuration);
    }

    @Override
    public Integer save(ClassModel model) {
        dao.insert(model);
        return model.getId();
    }

    @Override
    public List<Integer> save(List<ClassModel> models) {
        dao.insert(models);
        return models.stream().map(ClassModel::getId).collect(Collectors.toList());
    }

    @Override
    public List<ClassModel> getAll() {
        return dao.findAll();
    }

    @Override
    public String getHtml() {
        return dsl.select().from(CLASS_MODEL).fetch().formatHTML();
    }

    @Override
    public List<ClassModel> getPage(int offset, int limit) {
        return null;
    }

    @Override
    public List<String> getAllFullName() {
        //dsl.select(CLASS_MODEL.PACKAGE.concat(".").concat(CLASS_MODEL.NAME)).from(CLASS_MODEL).fetch(); // Very very slow
        return dsl.resultQuery("select concat(package,'.',name) from public.class_model")
                .fetch()
                .getValues(0, String.class); // more faster
    }



}
