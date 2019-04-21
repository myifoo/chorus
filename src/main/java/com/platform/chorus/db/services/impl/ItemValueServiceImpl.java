package com.platform.chorus.db.services.impl;

import com.platform.chorus.db.services.ItemValueService;
import com.platform.chorus.db.tables.pojos.ItemValue;
import com.platform.chorus.db.tables.daos.ItemValueDao;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
