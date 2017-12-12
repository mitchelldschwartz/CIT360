package cit360.spring2017.model.test;

import org.junit.Assert;
import org.junit.Test;

import cit360.spring2017.model.Student;

public class StudentTest {

	@Test
	public void testGetNameEqual() {
		Student student1 = new Student();
		student1.setName("Someone");
		
		Assert.assertEquals("Someone", student1.getName());
	}
	
	@Test
	public void testGetNameEmpty() {
		Student student1 = new Student();
		
		Assert.assertEquals("",student1.getName());
	}
}