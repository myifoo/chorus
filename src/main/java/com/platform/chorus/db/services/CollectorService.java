package com.platform.chorus.db.services;


import com.platform.chorus.db.tables.pojos.Collector;

import java.util.List;

/**
 * Create by A.T on 2019/4/21
 */
public interface CollectorService {
    Integer create(Collector collector);
    List<Integer> create(List<Collector> collectors);
    Collector fetch(Integer id);
    List<Collector> fetchAll();
    String getHtml();
    List<Collector> fetchByResult(String result);
    void delete(Integer id);
    void delete(String name);
}
