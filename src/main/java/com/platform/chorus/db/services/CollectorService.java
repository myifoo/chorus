package com.platform.chorus.db.services;


import com.platform.chorus.db.tables.pojos.Collector;

import java.util.List;

/**
 * Create by A.T on 2019/4/21
 */
public interface CollectorService {
    Integer create(Collector collector);
    Collector fetch(Integer id);
    List<Collector> fetchAll();
    List<Collector> fetchByResult(String result);
    void delete(Integer id);
    void delete(String name);
}
