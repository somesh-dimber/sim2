package sim2.sim2;

import static org.junit.Assert.*;

import org.junit.Test;
//Test File
public class AppTest {
//Adding Comment
	@Test
	public void test() {
<<<<<<< HEAD
		System.out.println("Inside AppTest");
=======
		System.out.println("Square Test");
>>>>>>> feature1
		App test =new App();
		int output = test.square(5);
		assertEquals(25, output);
		
	}

}
