package com.akshita.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTestNotEquals {
	
	//assertNotEquals method do just opposite of assertEquals
	
	Shapes shape = new Shapes();
	
	@Test
	void testComputeSquareArea() {		
		assertNotEquals(576009, shape.computeSquareArea(24));		
	}
	
	@Test
	void testComputeCircleArea() {
		assertNotEquals(78.5, shape.computeCircleArea(5), "Msg to dev when testcase fails");
	}
	
	@Test
	void testComputeCircleArea_Supplier() {
		assertNotEquals(789, shape.computeCircleArea(5), ()->"Message to dev when testcase fails");
	}

}
