package com.akshita;

import com.akshita.service.PurchaseCourse;
import com.learning.dao.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PurchaseCourseTest {

	@Test
	void testProceedWithCourse() {
		
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JUnitCourse());
//		assertTrue(status);
		assertFalse(status, ()->"It is failing b/c unit results in true");
				//we generelly don't use msg feature in assertTure or assertFalse,
				//b/c we can easily see which unit is failing or passing the test by 
				//clicking on the ran test
	}

}
