package com.qa.helloworld;

public class Flowcharts {
	public static void main(String[] args) { 
		System.out.println(method1(3, 3, false));
	}
	public static String method1 (int num1, int num2, boolean bool1) {
	    String result;
		if(bool1) {
			 result = "" + (num1 + num2);
			 return result;
		 } else
		   { result = "" + num1 * num2;
			 return result;
		 }

	}

}
