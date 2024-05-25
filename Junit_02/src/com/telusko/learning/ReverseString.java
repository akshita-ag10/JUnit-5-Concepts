package com.telusko.learning;

public class ReverseString {
	
	public String reverseString(String str) {
		
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		
		while(left < right) {
			//swap characters at left and right positions
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			//move the pointers towards each other
			left++;
			right--;
		}
		return new String (charArray);
	}

}
