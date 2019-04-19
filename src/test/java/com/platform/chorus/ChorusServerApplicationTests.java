package com.platform.chorus;

import com.platform.chorus.db.services.ClassModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChorusServerApplicationTests {

	@Autowired
	ClassModelService service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void modelDaoTest() {
		service.getAllFullName();
	}

	@Test
	public void createModelTest() {
		ClassModel model = new ClassModel();

		model.setDescription("description");
		model.setPackage("package");
		model.setName("name");
		model.setLabel("名称");

		System.out.print(String.format("model id = %s", service.save(model)));
	}


}
