package com.akshita.exceptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertThrows {

	@Test
	void testSortingArray_AssertThrows() {
		SortingArray sa = new SortingArray();

//		int[] arr = {6, 8, 0, 1, 5, 2};
		int[] arr = null;
		
		assertThrows(NullPointerException.class, ()-> sa.sortingArray(arr));
		//expected is Null pointer exception, actual is what is getting out of that function
		// if matches, test passes i.e if method throws the exception, test will pass
	}

}
