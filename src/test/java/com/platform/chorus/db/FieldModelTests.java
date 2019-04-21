package com.platform.chorus.db;

import com.platform.chorus.cim.model.CIModelService;
import com.platform.chorus.db.services.FieldModelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FieldModelTests {

    @Autowired
    CIModelService service;

    @Test
    public void getByOwnerTest() {
        service.getFieldByOwner("chorus.Pupil").forEach(System.out::println);
    }


}
