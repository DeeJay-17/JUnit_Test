package Lab10_JUnit;  

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStr {

	@Test
	public void test1() {
		JUnitTest obj1 = new JUnitTest();
		String x = "Hello";
		String y = "World";
		assertEquals("HelloWorld", obj1.AddString(x, y));
		}
	@Test
	public void test2() {
		JUnitTest obj1 = new JUnitTest();
		String x = "Hello";
		String y = "World";
		assertEquals("HelloHello", obj1.AddString(x, y));
		}

}
