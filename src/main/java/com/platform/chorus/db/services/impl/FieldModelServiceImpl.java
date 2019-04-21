package com.platform.chorus.db.services.impl;

import com.platform.chorus.db.services.FieldModelService;
import com.platform.chorus.db.tables.daos.FieldModelDao;
import com.platform.chorus.db.tables.pojos.FieldModel;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.platform.chorus.db.Tables.FIELD_MODEL;

/**
 * Create by A.T on 2019/4/19
 */
@Repository
public class FieldModelServiceImpl implements FieldModelService {
    private FieldModelDao dao;

    @Autowired
    DSLContext dsl;

    public FieldModelServiceImpl(Configuration configuration) {
        this.dao = new FieldModelDao(configuration);
    }

    @Override
    public Integer save(FieldModel model) {
        dao.insert(model);
        return model.getId();
    }

    @Override
    public List<Integer> save(List<FieldModel> models) {
        dao.insert(models);
        return models.stream().map(FieldModel::getId).collect(Collectors.toList());
    }

    @Override
    public List<FieldModel> getAll() {
        return dao.findAll();
    }

    @Override
    public List<FieldModel> getByOwner(String owner) {
        return dao.fetchByOwner(owner);
    }

    @Override
    public List<FieldModel> getByOwners(String... owners) {
        return dao.fetchByOwner(owners);
    }

    @Override
    public String getHtml() {
        return dsl.select().from(FIELD_MODEL).fetch().formatHTML();
    }

    @Override
    public void delete(String owner, String name) {
        dsl.delete(FIELD_MODEL)
                .where(FIELD_MODEL.OWNER.eq(owner))
                .and(FIELD_MODEL.NAME.eq(name))
                .execute();
    }
}
