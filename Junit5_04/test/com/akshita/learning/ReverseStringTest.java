package com.akshita.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString rev = new ReverseString();

	@Test
	void testReverseString_OneWord() {
		
		assertEquals("avaJ", rev.reverseString("Java"));
		assertEquals("gnirpS", rev.reverseString("Spring"));
		
	}
	
	@Test
	void testReverseString_MultipleWords() {
		assertEquals("nuF si avaJ", rev.reverseString("Java is Fun"));
	}

}
