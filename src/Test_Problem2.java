import static org.junit.Assert.*;
import org.junit.Test;
import problem2.*;

public class Test_Problem2 {
	
	@Test
	public void testing_name_attribute() {
		Student s1 = new Student("Bob", "bob@uni.com");
		Student s2 = new Student("Carl", "carl@uni.com");
		assertEquals(false, s1.name == s2.name);
	}

	@Test
	public void testing_email_attribute() {
		Student s1 = new Student("Bob", "bob@uni.com");
		Student s2 = new Student("Carl", "carl@uni.com");
		assertEquals(false, s1.email == s2.email);
	}

	@Test
	public void testing_school_id_attribute() {
		Student s1 = new Student("Bob", "bob@uni.com");
		Student s2 = new Student("Carl", "carl@uni.com");
		s1.school_id = "123";
		s2.school_id = "456";
		assertEquals(true, s1.school_id == s2.school_id);
	}

	@Test
	public void testing_info_method() {
		Student s1 = new Student("Bob", "bob@uni.com");
		s1.info();
		assertEquals(true, true);
	}
}