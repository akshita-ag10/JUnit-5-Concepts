package com.akshita;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssert_True_False {

	@Test
	void test() {
		String str = "junit";
//		assertTrue(str.equals("JUNIT"));
		assertTrue(str.equals("junit"));
		assertTrue(5>2);
	}
	
	@Test
	void test2() {
		String str = "junit";
		assertFalse(false);
		assertFalse(str.length()<2);
	}

}
