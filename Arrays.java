package com.qa.topics;

public class Arrays {
	public static void main(String[] args) {
	
	int[] ageArray = { 18, 26, 0, 100, 12, 6};
	String[] nameArray = {"John", "Emma", "Alex"};
	
	for (int i = 0; i < ageArray.length; i++) {
		System.out.println((ageArray[i]));
		}
	
	for (String name: nameArray) {
		System.out.println(name);
		}
	
	
	
	int [][] ageArray2 = { { 25, 30, 21 }, { 56, 67, 39 }, { 8, 1, 2 } };
	String [][] nameArray2 = new String [3][2];
	nameArray2[1][1] = "John";
	nameArray2[2][1] = "Jordan";
	
	
// For-each	
	for (int[] a : ageArray2) {
		for (int b : a) {
			System.out.println(b);
		}
	}}}
/*// For loop	
		for (int i = 0; i < ageArray2.length; i++) {
			for (int j = 0; j < ageArray2[i].length; j++) {
				System.out.println(ageArray2[i][j]);
			}
		}
		
	}
}*/