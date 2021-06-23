package com.qa.helloworld;

public class DivisonCalc {
	public static void main(String[] args) {
	    int firstInt = 10;
	    int secondInt = 5;
	    int addResult = addition(firstInt, secondInt);
	    System.out.println(firstInt + " + " + secondInt + " = " + addResult);
	    int multResult = multiplication(firstInt, secondInt);
	    System.out.println(firstInt + " * " + secondInt + " = " + multResult);
	    int subResult = subtraction(firstInt, secondInt);
	    System.out.println(firstInt + " - " + secondInt + " = " + subResult);
	    double divResult = division(firstInt, secondInt);
	    System.out.println(firstInt + " / " + secondInt + " = " + divResult);
	}
	// method to sum numbers taking in two integers
	public static int addition(int int1, int int2) {
	    return int1 + int2;
	}
	// method to multiply numbers taking in two numbers
	public static int multiplication(int num1, int num2) {
	    return num1 * num2;
	}
	// method to subtract
	public static int subtraction(int subFrom, int subThis) {
	    return subFrom - subThis;
	}
	// method to divide
	public static double division(double divFrom, double divBy) {
	    return divFrom / divBy;
	}
}
