package com.qa.exercises;

import java.util.ArrayList;
import java.util.List;

public class Runner1 {
	public static void main(String[] args) {
		
		List<User> people = new ArrayList<User>();
		
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		
		u1.setForename("Dave");
		u1.setSurname("Stupid");
		u1.setEmail("d.g@gmail.com");
		u1.setAge(12);
		u1.setTelephoneNo(412875154);
		
		u2.setForename("George");
		u2.setSurname("Idiot");
		u2.setEmail("g.i@gmail.com");
		u2.setAge(12);
		u2.setTelephoneNo(687419132);
		
		u3.setForename("Fat");
		u3.setSurname("Boi");
		u3.setEmail("f.b@gmail.com");
		u3.setAge(12);
		u3.setTelephoneNo(549816581);
		
		people.add(u1);
		people.add(u2);
		people.add(u3);
		
		for (User p : people) {
			p.toString();
			System.out.println(p);
		}
		
	}
}
