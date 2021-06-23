package com.qa.helloworld;

public class Results {
	public static void main(String[] args) {
		
		int Marks = 150;
		
		String physics = "Physics";
		System.out.println(physics + " " + Marks);
		
		String chemistry = "Chemistry";
		System.out.println(chemistry + " " + Marks);
		
		String biology = "Biology";
		System.out.println(biology + " " + Marks);
		
		int sum = Marks * 3;
		System.out.println("Total Marks =" + " " + sum);
		
		int sum2 = sum * 100 / 450;
		System.out.println("The overall percentage =" + " " + sum2);
	}
}
