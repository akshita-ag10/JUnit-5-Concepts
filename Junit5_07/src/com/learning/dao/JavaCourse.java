package com.learning.dao;

public class JavaCourse implements Course{

	@Override
	public boolean coursePurchased() {
		System.out.println("Java Course Purchased");
		System.out.println("It is not actually connecting to db, hence false");
//		return true;
		return false;
	}

}
