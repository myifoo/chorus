package com.platform.chorus.cim.model;

import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.FieldModel;

import java.util.List;

public interface CIModelService {
     List<Integer> create(List<ClassModel> models);
     Integer create(ClassModel model);
     void deleteClass(String pkg, String name);
     Integer createField(FieldModel model);
     List<Integer> createField(List<FieldModel> models);

}
