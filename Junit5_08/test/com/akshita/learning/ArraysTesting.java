package com.akshita.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void test() {
		int[] actual = {4, 8, 6, 2};
		int[] expected = {2, 4, 6, 8};
		
		Arrays.sort(actual);
		
		assertArrayEquals(expected, actual);
		
		assertEquals(expected, actual); 		
		//will fail the test, because comparing the actual objects 
		//that the ref variables are pointing to in the heap memory
	}

}
