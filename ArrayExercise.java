package com.qa.topics;

public class ArrayExercise {

		public static void ArrayExercise1() {
		int [] basicArray;
		basicArray = new int [10];

		for (int i = 0; i < basicArray.length; i++) { 
		    basicArray[i] = i;
		    System.out.println((basicArray[i])); }

		for (int i = 0; i < basicArray.length; i++) {
			basicArray[i] = i;
			int newArray = basicArray[i] * 10;
			System.out.println(newArray);
			}
		}
}
		
	


