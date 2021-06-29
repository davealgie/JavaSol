package com.qa.topics;

public class StringMani {
	public static void main(String[] args) {
		
		String myStr = "I like strings";
		String myStr2 = new String("I like strings");  //These two have a different location in memory
		String myStr3 = "I like strings";
		
		int stringLength = myStr.length();
		System.out.println("String Length is " + stringLength);
		
		
		//System.out.println(myStr.equals(myStr2));
		//System.out.println(myStr==myStr2);
		
	}
}
