package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class CalcTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Calc c = new Calc();
		int actual = c.divide(10, 2);
		int expected= 5;
		assertEquals(expected, actual);
	}

}
