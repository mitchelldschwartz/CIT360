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