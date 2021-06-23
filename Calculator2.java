package com.qa.helloworld;

public class Calculator2 {

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(multiply(10, 2));
		System.out.println(subtract(10, 8));
		System.out.println(divide(100, 4));
	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
	
}
