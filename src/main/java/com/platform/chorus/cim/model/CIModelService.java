package com.platform.chorus.cim.model;

import com.platform.chorus.cim.Service;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.Collector;
import com.platform.chorus.db.tables.pojos.FieldModel;

import java.util.List;

public interface CIModelService extends Service {
     List<ClassModel> getAllClass();
     List<FieldModel> getAllField();
     List<Collector> getAllCollector();

     String getAllClassHtml();
     String getAllFieldHtml();
     String getAllCollectorHtml();

     List<String> getAllClassFullName();

     List<Integer> createClass(List<ClassModel> models);
     Integer createClass(ClassModel model);
     void deleteClass(String domain, String name);

     Integer createCollector(Collector collector);
     List<Integer> createCollector(List<Collector> collectors);
     void deleteCollector(String name);

     Integer createField(FieldModel model);
     List<Integer> createField(List<FieldModel> models);
     void deleteField(String owner, String name);
     List<FieldModel> getFields(String classFullName);
}
