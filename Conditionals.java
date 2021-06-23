package com.qa.helloworld;

public class Conditionals {

	public static void main(String[] args) {
		numbersJava();
	}
	
	public static void canPawelJava() {
		
		boolean canPawelJava = false;
		if (canPawelJava) {
			System.out.println("Pawel Can");
		} else {
			System.out.println("Pawel Can't");
		}
	}
	
	public static void numbersJava() {
		int number = 21;
		
		if (number <= 20) {
			System.out.println("Number is less than or equal to 20");
		} else if (number < 40) {
			System.out.println("Number is between 20 and 40");
		} else {
			System.out.println("Number is greater than or equal to 40");
		}
	}
	public static void switchCase() {
		int num = 3;
		
		switch (num) {   // without a break; should one condition be true, all of them will be (according to the chosen int i.e.)
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");	
			break;
		case 3:
			System.out.println("Case 3");	
			break;
		case 4:
			System.out.println("Case 4");
			break;
		case 5:
			System.out.println("This is the default option");
			break;
		default:
		}
		
	}
	
}
