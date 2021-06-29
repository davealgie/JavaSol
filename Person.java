package com.qa.exercises;


public class Person {

	// add fields for name age and title.
	String name;
	int age;
	String title;
	
	public Person(String name, int age, String title){
		
		//set fields
		this.title = title;
		this.age = age;
		this.name = name;
		
	}
	
	
	public Person(){
		
	}
	
	public void printInfo() {
		System.out.println(name + " " + age + " " + title);

	}
	
}
