package sim2.sim2;

import static org.junit.Assert.*;

import org.junit.Test;

public class countAtest {

	@Test
	public void test() {
		App test = new App();
		int output =test.countA("alphabet");
		assertEquals(2,output);
		System.out.println("countAtest");
	}

}
