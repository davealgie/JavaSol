package com.qa.exercises;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
	    List<Person> people = new ArrayList<Person>();
	    people.add(new Person("Sam Samson", 20, "Mr"));
	    people.add(new Person("Sonya Smith", 42, "Miss"));
	    people.add(new Person("Gareth Butcher", 29, "Mr"));
	    people.add(new Person("Josephine Sutton", 33, "Mrs"));
	    for (Person p : people) {
	      p.printInfo();   //shows all people in the list.
	    }
	    
	    people.get(0).printInfo();  //shows person at index 0 in the list.
	}
	

}
