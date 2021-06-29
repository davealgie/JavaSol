package com.qa.exercises;

public class User {

	private String forename;
	private String surname;
	private String email;
	private int age;
	private int telephoneNo;
//	private  middleNames;

	public String getForename() {
		return this.forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTelephoneNo() {
		return this.telephoneNo;
	}

	public void setTelephoneNo(int telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String toString() {
		return "Person [name= " + forename + " " + surname + ", age= " + age + ", email= " + email + " "  + "TelephoneNo= " + telephoneNo + "]";
	}
}