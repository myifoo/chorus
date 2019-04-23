package com.platform.chorus.db.services.impl;

import com.platform.chorus.db.services.ItemValueService;
import com.platform.chorus.db.tables.daos.ItemValueDao;
import com.platform.chorus.db.tables.pojos.ItemValue;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by A.T on 2019/4/19
 */
@Repository
public class ItemValueServiceImpl implements ItemValueService {
    private ItemValueDao dao;

    @Autowired
    DSLContext dsl;

    public ItemValueServiceImpl(Configuration configuration) {
        this.dao = new ItemValueDao(configuration);
    }

    @Override
    public ItemValue createItemValue(ItemValue value) {
        dao.insert(value);
        return value;
    }

    @Override
    public List<ItemValue> createItemValue(List<ItemValue> values) {
        dao.insert(values);
        return values;
    }
}
