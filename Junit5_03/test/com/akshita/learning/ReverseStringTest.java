package com.akshita.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//JUnit 5 is also known as JUnit Jupiter b/c we use Jupiter api in it.
class ReverseStringTest {

	@Test
	void test() {
		ReverseString rev = new ReverseString();
		
		assertEquals("avaJ", rev.reverseString("Java"));
		assertEquals("gnirpS", rev.reverseString("Spring"));
	}

}
