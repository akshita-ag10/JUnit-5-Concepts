package com.akshita.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes shape = new Shapes();

	@Test
	void testComputeSqaureArea() {
		assertEquals( 576 ,shape.computeSquareArea(24) );
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5),"Area of Circle calculated WRONG");
		//in the above way, this msg is evaluated whether the test case is a success or faliure 
		//and displayed only when the test is failed
	}
	
	@Test
	void testComputeCircleArea_Supplier() {
		//This is by using Supplier Interface (Java's Functional Interface)
		//you can implement it your own we, but since it is functional interface, 
		//we are implementing it using lambda expression "-> : lambda operator"
		
		assertEquals(78.5, shape.computeCircleArea(5), ()->"Area of circle calculated wrong");
		//msg is evaluated and displayed only if test fails, no msg evaluation is test passes
		//More efficient method
	}

}
