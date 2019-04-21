package com.platform.chorus;

import com.platform.chorus.cim.model.CIModelService;
import com.platform.chorus.db.services.ClassModelService;
import com.platform.chorus.db.tables.pojos.ClassModel;
import com.platform.chorus.db.tables.pojos.FieldModel;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.driver.v1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.neo4j.driver.v1.Values.parameters;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChorusServerApplicationTests {

	@Autowired
	ClassModelService service;

	@Autowired
	Driver driver;

	@Autowired
	CIModelService ciModelService;

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
		model.setDomain("package");
		model.setName("name");
		model.setLabel("名称");

		System.out.print(String.format("model id = %s", service.save(model)));
	}

	@Test
	public void neo4jHelloTest() {
		try (Session session = driver.session()) {
			String greeting = session.writeTransaction((t)->t.run("CREATE (a:Greeting) " +
							"SET a.message=$message RETURN a.message + ' from node ' + id(a)",
					parameters("message", "hello neo4j")).single().get(0).asString());

			System.out.println(greeting);
		}
	}

	@Test
	public void createClassNodeTest() {
		ClassModel person = new ClassModel();
		ClassModel student = new ClassModel();
		ClassModel teacher = new ClassModel();
		ClassModel car = new ClassModel();

		person.setDomain("chorus");
		person.setName("Person");

		student.setDomain("chorus");
		student.setName("Student");
		student.setExtend("chorus.Person");

		teacher.setDomain("chorus");
		teacher.setName("Teacher");
		teacher.setExtend("chorus.Person");

		car.setDomain("chorus");
		car.setName("Car");

		ciModelService.create(person);
		ciModelService.create(student);
		ciModelService.create(teacher);
		ciModelService.create(car);
	}

	@Test
	public void createPupilStudentTest() {
		ClassModel pupil = new ClassModel();
		pupil.setDomain("chorus");
		pupil.setName("Pupil");
		pupil.setExtend("chorus.Student");

		ciModelService.create(pupil);

		FieldModel school = getField("string", "chorus.Pupil", "school", "学校名称");
		FieldModel hobby = getField("string", "chorus.Pupil", "hobby", "爱好");

		ciModelService.createField(Arrays.asList(school, hobby));
	}

	@Test
	public void createFieldNodeTest() {
		FieldModel name = getField("string", "chorus.Person", "name", "名称");
		FieldModel age = getField("integer", "chorus.Person", "age", "年龄");
		FieldModel car = getField("chorus.Car", "chorus.Person", "car", "私家车");
		FieldModel brand = getField("string", "chorus.Car", "brand", "品牌");

		ciModelService.createField(Arrays.asList(name, age, car, brand));
	}

	@Test
	public void deleteFieldNodeTest() {
		FieldModel name = getField("string", "chorus.Person", "name", "名称");
		FieldModel age = getField("integer", "chorus.Person", "age", "年龄");
		FieldModel car = getField("chorus.Car", "chorus.Person", "car", "私家车");
		FieldModel brand = getField("string", "chorus.Car", "brand", "品牌");

		ciModelService.deleteField(name.getOwner(), name.getName());
		ciModelService.deleteField(age.getOwner(), age.getName());
		ciModelService.deleteField(car.getOwner(), car.getName());
		ciModelService.deleteField(brand.getOwner(), brand.getName());
	}

	@Test
	public void deleteClassTest() {
		ciModelService.deleteClass("chorus", "Person");
		ciModelService.deleteClass("chorus", "Student");
		ciModelService.deleteClass("chorus", "Teacher");
		ciModelService.deleteClass("chorus", "Car");
	}

	private FieldModel getField(String type, String owner, String name, String label) {
		FieldModel field = new FieldModel();
		field.setName(name);
		field.setType(type);
		field.setOwner(owner);
		field.setLabel(label);
		return field;
	}
}
