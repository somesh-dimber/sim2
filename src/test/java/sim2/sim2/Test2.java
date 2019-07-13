package sim2.sim2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

public class Test2 {

	@Test
	public void simpleTestPass()
	{
		int a=1;
		int b=2;
		int c=a+b;
		assertTrue(c==3);
	}
	
	@Test
	public void simpleTestFail()
	{
		int a=1;
		int b=2;
		int c=a+b;
		assertTrue(c==4);
	}
	
}
