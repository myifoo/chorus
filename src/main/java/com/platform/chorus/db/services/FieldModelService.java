package com.platform.chorus.db.services;

import com.platform.chorus.db.tables.pojos.FieldModel;

import java.util.List;

/**
 * Create by A.T on 2019/4/19
 */
public interface FieldModelService {
    Integer save(FieldModel model);
    List<Integer> save(List<FieldModel> models);
    List<FieldModel> getAll();
    List<FieldModel> getByOwner(String owner);
    List<FieldModel> getByOwners(String... owners);
    String getHtml();
    void delete(String owner, String name);
}
