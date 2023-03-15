package Paramtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Parameterized.class)
public class TestPrimeNumber {
	
	private final Integer InputNumber;
	private final boolean expectedResult;
	private PrimeNumber PrimeNumber;
	
@Before
public void initialize()
{
	PrimeNumber = new PrimeNumber();
}


public TestPrimeNumber(Integer inputNumber, boolean expectedResult) {
	
	this.InputNumber = inputNumber;
	this.expectedResult = expectedResult;
	
}


@Parameterized.Parameters
public static Collection primenumbers()
{
	return Arrays.asList(new Object[][] {
		{2,true},
		{6,false},
		{19,true},
		{22,false},
		{23,true},
		{24,false},
		{10,true}}
	);
}

	@Test
	public void testValidator() {
		//fail("Not yet implemented");
		System.out.println("Parameterized number is" + InputNumber);
		assertEquals(expectedResult,PrimeNumber.validate(InputNumber));
	}

}
