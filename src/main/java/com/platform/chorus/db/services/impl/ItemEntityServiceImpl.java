package com.platform.chorus.db.services.impl;

import com.platform.chorus.db.services.ItemEntityService;
import com.platform.chorus.db.tables.daos.ItemEntityDao;
import com.platform.chorus.db.tables.pojos.ItemEntity;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by A.T on 2019/4/19
 */
@Repository
public class ItemEntityServiceImpl implements ItemEntityService {
    private ItemEntityDao dao;

    @Autowired
    DSLContext dsl;

    public ItemEntityServiceImpl(Configuration configuration) {
        this.dao = new ItemEntityDao(configuration);
    }

    @Override
    public Integer createItemEntity(ItemEntity entity) {
        dao.insert(entity);
        return entity.getId();
    }

    @Override
    public List<Integer> createItemEntity(List<ItemEntity> entities) {
        dao.insert(entities);
        return entities.stream().map(ItemEntity::getId).collect(Collectors.toList());
    }
}
