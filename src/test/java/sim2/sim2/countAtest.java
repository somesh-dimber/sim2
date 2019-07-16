package sim2.sim2;

import static org.junit.Assert.*;

import org.junit.Test;

public class countAtest {

	@Test
	public void test() {
		System.out.println("countAtest");
		App test = new App();
		int output =test.countA("alphabet");
		assertEquals(3,output);
		
	}

}
