package com.qa.topics;

public class EnchancedForLoopsExercise {
	public static void main(String[] args) {
		
		String [] namesArray = {"Chris", "Tony", "Juan", "Dize","Dave"};
		
		for (String name: namesArray) {
			System.out.println(name);
	}
        int[] numArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for (int i : numArray) {
            System.out.println(i * i);
        }
        for (int i1 : numArray) {
            if (isEvenOrNot(i1)) {
                System.out.println("Even: " + i1 * i1);
            } else {
                System.out.println("Odd: " + i1 * i1 * i1);
            }
        }
        }
    
    public static boolean isEvenOrNot(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

