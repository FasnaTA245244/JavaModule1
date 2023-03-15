package FirstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSub {
	Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all test cases");
	}

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
		System.out.println("Before each Test");
	
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void testsub() {
		int inputBase = 10;
	    int exp = 4;
		int expectedValue = 6;
		int actualValue = calc.sub(inputBase, exp);
	    assertEquals(expectedValue,actualValue);
		//fail("Not yet implemented");
	}

}
