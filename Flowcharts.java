package com.qa.topics;

public class Flowcharts {
	public static void main(String[] args) {
			System.out.println(method1(8000, 2000, false));
	}

	public static String method1(int num1, int num2, boolean bool1) {
		String result;
		if (bool1) {
			result = "" + (num1 + num2);
			return result;
		} else {
			result = "" + num1 * num2;
			return result;
		}

	}

	public static void method2(int A) {
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");

				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}	
			
		} else {
			System.out.println("1");	
			if (A > 100) {
				System.out.println("3");
				
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					
					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				} 
				
			} else {
				System.out.println("2");
			} 
			
		} 
	}
}
