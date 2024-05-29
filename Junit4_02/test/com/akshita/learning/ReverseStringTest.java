package com.akshita.learning;

import static org.junit.Assert.*;

import org.junit.Test;

import com.akshita.learning.ReverseString;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString reverse = new ReverseString();
		
		assertEquals("avaJ", reverse.reverseString("Java"));
	}

}
