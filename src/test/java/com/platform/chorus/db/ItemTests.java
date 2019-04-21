package com.platform.chorus.db;

import com.platform.chorus.cim.item.ItemService;
import com.platform.chorus.db.tables.pojos.ItemEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create by A.T on 2019/4/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemTests {

    @Autowired
    ItemService service;

    @Test
    public void addItemEntity() {
        ItemEntity car = new ItemEntity();
        car.setName("Red_Benz");
        car.setCreator("Tester");
        car.setType("chorus.Car");

        Integer carId = service.createItemEntity(car);

        ItemEntity tom = new ItemEntity();

        tom.setName("Tom_Smith");
        tom.setCreator("Tester");
        tom.setType("chorus.Pupil");
        tom.setContains(carId);

        service.createItemEntity(tom);

        ItemEntity jack = new ItemEntity();

        jack.setName("Jack_Smith");
        jack.setCreator("Tester");
        jack.setType("chorus.Pupil");
        jack.setContains(carId);

        service.createItemEntity(jack);
    }
}
