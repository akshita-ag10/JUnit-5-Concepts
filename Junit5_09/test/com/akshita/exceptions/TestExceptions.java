package com.akshita.exceptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExceptions {
	
	//if the test is giving exception , it should pass, otherwise the test should fail

	@Test
	void testSortingArray_Exception() {
		try {
			int[] unsorted = null;
			
			SortingArray sa = new SortingArray();
			int[] sorted = sa.sortingArray(unsorted); //if exception found in this line, control will jump to catch block and no further lines of try block will be executed 
			fail(); // if exception not found, then test should fail
					
			
			for(int a : sorted) {
				System.out.print(a + " ");
			}
			
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception Found");
		}
		
	}
	
	//THE ABOVE BEHAVIOUR IS WHAT WE WANT AND GET USING assertThrows METHOD, CHECK NEXT TEST CLASS

}
