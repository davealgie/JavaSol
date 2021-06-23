package com.qa.helloworld;

public class HelloWorld {
	
	 public static void main(String[] args) {
	     helloWorld();
	     helloFriends();
	     System.out.println(add(5, 5));
	}
	 
// This method should add two integers and return their sum.
	private static int add(int num1, int num2) {
		
		return num1+num2;
		
	}

	private static void helloWorld () {
		System.out.println("Hello World!");
	}

	private static void helloFriends () {
		System.out.println("Hello Friends!");
	}
}

