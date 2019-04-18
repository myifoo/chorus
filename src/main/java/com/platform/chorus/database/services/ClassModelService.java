package com.platform.chorus.database.services;


import com.platform.chorus.database.tables.pojos.ClassModel;

import java.util.List;

public interface ClassModelService {
    Integer save(ClassModel model);
    List<Integer> save(List<ClassModel> models);
    List<ClassModel> getAll();
    String getHtml();
    List<ClassModel> getPage(int offset, int limit);
    List<String> getAllFullName();
}
