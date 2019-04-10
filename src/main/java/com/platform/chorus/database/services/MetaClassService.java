package com.platform.chorus.database.services;

import com.platform.chorus.database.tables.pojos.MetaClass;

import java.util.List;

public interface MetaClassService {
    Integer save(MetaClass metaClass);
    List<MetaClass> getAll();
    List<MetaClass> getPage(int offset, int limit);
}
