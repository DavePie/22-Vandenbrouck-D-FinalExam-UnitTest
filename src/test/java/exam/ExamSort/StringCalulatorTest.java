package exam.ExamSort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalulatorTest {

	@Test
	public void ignoreOneLargeNumber() {
		assertEquals(0, StringCalculator.add("1000"));
	}

	@Test
	public void ignoreManylargeNumbers() {
		assertEquals(8, StringCalculator.add("2000,1000,7,1000,22222,43443,1"));
	}

	@Test
	public void ignoreVerylargeNumber() {
		assertEquals(50, StringCalculator.add("1000000000000000000000000, 50"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void negativeThrowExceptionMultiple() {
		StringCalculator.add("0,0,0,-1");
	}

	@Test(expected = IllegalArgumentException.class)
	public void negativeThrowExceptionMiddle() {
		StringCalculator.add("0,3,4,-3,0");
	}

	@Test(expected = IllegalArgumentException.class)
	public void negativeThrowExceptionSingle() {
		StringCalculator.add("-1");
	}

	@Test(expected = IllegalArgumentException.class)
	public void negativeThrowExceptionLarge() {
		StringCalculator.add("-10000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void negativeThrowExceptionVeryLarge() {
		StringCalculator.add("      -10000000000000000000000000000000000       , 10");
	}
}
