package com.akshita.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrialTest {

	@Test
	void test() {
		assertEquals(6,6);
	}
	
	@Test
	void testComputeSquareArea() {
		Shapes shape = new Shapes();
		assertEquals(576, shape.computeSquareArea(24));
	}

}
