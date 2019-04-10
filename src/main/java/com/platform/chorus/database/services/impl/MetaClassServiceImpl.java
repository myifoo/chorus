package com.platform.chorus.database.services.impl;

import static com.platform.chorus.database.tables.MetaClass.*;

import com.platform.chorus.database.services.MetaClassService;
import com.platform.chorus.database.tables.daos.MetaClassDao;
import com.platform.chorus.database.tables.pojos.MetaClass;
import com.platform.chorus.database.tables.records.MetaClassRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by A.T on 2019/4/10
 */
@Repository
public class MetaClassServiceImpl implements MetaClassService {
    private MetaClassDao dao;

    @Autowired
    DSLContext dsl;

    public MetaClassServiceImpl(Configuration configuration) {
        this.dao = new MetaClassDao(configuration);
    }

    @Override
    public Integer save(MetaClass metaClass) {
        Record record = dsl.insertInto(META_CLASS)
                .set(convertMetaClass(metaClass))
                .returning()
                .fetchOne();
        return record.getValue(META_CLASS.CID);
    }

    @Override
    public List<MetaClass> getAll() {
        return dao.findAll();
    }

    @Override
    public List<MetaClass> getPage(int offset, int limit) {
        return dsl.select()
                .from(META_CLASS)
                .limit(offset, limit)
                .fetch()
                .stream()
                .map(this::convertMetaClassRecord)
                .collect(Collectors.toList());
    }

    private MetaClass convertMetaClassRecord(Record r) {
        MetaClassRecord record = (MetaClassRecord)r;
        MetaClass metaClass = new MetaClass();
        metaClass.setCid(record.getCid());
        metaClass.setDescription(record.getDescription());
        metaClass.setExtends(record.getExtends());
        metaClass.setModifier(record.getModifier());
        metaClass.setName(record.getName());
        metaClass.setPackage(record.getPackage());
        metaClass.setScope(record.getScope());
        return metaClass;
    }

    private Record convertMetaClass(MetaClass metaClass) {
        MetaClassRecord record = new MetaClassRecord();

        record.setName(metaClass.getName());
        record.setPackage(metaClass.getPackage());
        record.setScope(metaClass.getScope());
        record.setCid(metaClass.getCid());
        record.setDescription(metaClass.getDescription());
        record.setExtends(metaClass.getExtends());
        record.setModifier(metaClass.getModifier());

        return record;
    }


}
