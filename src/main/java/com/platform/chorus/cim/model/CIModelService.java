package com.platform.chorus.cim.model;

import com.platform.chorus.cim.Service;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.FieldModel;

import java.util.List;

public interface CIModelService extends Service {
     List<Integer> create(List<ClassModel> models);
     Integer create(ClassModel model);
     void deleteClass(String domain, String name);
     Integer createField(FieldModel model);
     List<Integer> createField(List<FieldModel> models);
     void deleteField(String owner, String name);
     List<FieldModel> getFieldByOwner(String owner);
}
