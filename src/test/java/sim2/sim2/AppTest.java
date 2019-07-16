package sim2.sim2;

import static org.junit.Assert.*;

import org.junit.Test;
//Test File
public class AppTest {

	@Test
	public void test() {
		System.out.println("Inside AppTest");
		App test =new App();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
