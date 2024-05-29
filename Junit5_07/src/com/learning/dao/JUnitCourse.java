package com.learning.dao;

public class JUnitCourse implements Course {

	@Override
	public boolean coursePurchased() {
		System.out.println("JUnit Course Purchased");
		return true;
	}

}
