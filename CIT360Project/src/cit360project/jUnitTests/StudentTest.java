
package jUnitTests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

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
		
		Assert.assertEquals("The constructor should have an empty student name ", "",student1.getName());
		student1.setName("Janes");
		Assert.assertNotEquals("", student1.getName());
		Assert.assertEquals("The name should be Jane ", "Jane",student1.getName());
	}
}