package com.qa.helloworld;

public class Results1 {
	public static void main(String[] args) {
	
		String chemistry = "Chemistry";
		System.out.println(chemistry + " " + (marks(0)));
		String physics = "Physics";
		System.out.println(physics + " " + (marks(0)));
		String biology = "Biology";
		System.out.println(biology + " " + (marks(0)));
		
		System.out.println("Total Marks =" + " " + (total(0)));
		
		System.out.println("The overall percentage =" + " " + (overall(0)));
		
		
	}
	public static int marks(int num) {
		return num = 150;
	}
	public static int overall(int num) {
		return num = 450 * 100 / 450;
	}
	public static int total(int num) {
		return num = 450;
}
}
