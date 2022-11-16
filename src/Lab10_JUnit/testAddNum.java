package Lab10_JUnit;  

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNum {

	@Test
	public void test1() {
		JUnitTest obj1 = new JUnitTest();
		int a = 25;
		int b = 25;
		assertEquals(50, obj1.AddNumbers(a, b));
		}
	@Test
	public void test2() {
		JUnitTest obj1 = new JUnitTest();
		int a = 25;
		int b = 25;
		assertEquals(500, obj1.AddNumbers(a, b));
		}

}
