package com.platform.chorus.db.services.impl;

import com.platform.chorus.db.services.CollectorService;
import com.platform.chorus.db.tables.daos.CollectorDao;
import com.platform.chorus.db.tables.pojos.Collector;
import com.platform.chorus.db.tables.records.CollectorRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.platform.chorus.db.tables.Collector.COLLECTOR;

/**
 * Create by A.T on 2019/4/21
 */
public class CollectorServiceImpl implements CollectorService {
    final static private Logger logger = LoggerFactory.getLogger(CollectorService.class);

    private CollectorDao dao;

    @Autowired
    DSLContext dsl;

    public CollectorServiceImpl(Configuration configuration) {
        this.dao = new CollectorDao(configuration);
    }

    @Override
    public Integer create(Collector collector) {
        dao.insert(collector);
        return collector.getId();
    }

    @Override
    public Collector fetch(Integer id) {
        return dao.fetchOneById(id);
    }

    @Override
    public List<Collector> fetchAll() {
        return dao.findAll();
    }

    @Override
    public List<Collector> fetchByResult(String result) {
        return dsl.select().from(COLLECTOR)
                .where(COLLECTOR.RESULT.like(result))
                .fetch()
                .map(this::mapRecordToPojo);
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public void delete(String name) {
        dsl.delete(COLLECTOR)
                .where(COLLECTOR.NAME.eq(name))
                .execute();
    }

    private Collector mapRecordToPojo(Record record) {
        CollectorRecord r = (CollectorRecord)record;

        Collector collector = new Collector();
        collector.setId(r.getId());
        collector.setName(r.getName());
        collector.setArgument(r.getArgument());
        collector.setResult(r.getResult());
        collector.setDescription(r.getDescription());
        collector.setInjects(r.getInjects());

        return collector;
    }
}
