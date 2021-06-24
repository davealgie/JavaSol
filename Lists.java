package com.qa.helloworld;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Lists {
	public static void main(String[] args) { 
		List<String> names = new ArrayList<>();
		
		names.add("Zayn");
		names.add("James");
		names.add("Turbo");
		names.add("Juan");
		names.add("Dize");
		names.add("John");
		
		System.out.println(names);
//		System.out.println(names.get(4));
		
		
//		names.set(1,  "Aswene");
//		names.remove(4);
		
//		System.out.println(names);
		Collections.sort(names);         //alphabetical order
//		System.out.println(names);
//		System.out.println(names.size()); //prints out the size of the list
		
		for (String name : names) {
			System.out.println(name);        //enchanted for-loop to print each name
		} 
		
		
		List<Integer> faveNums = new ArrayList<>();
		
		faveNums.add(60);
		faveNums.add(16);
		faveNums.add(29);
		
		Collections.sort(faveNums);
		
		for(int nums: faveNums) {
			System.out.println(nums);
		}
		
		System.out.println(faveNums.get(0));
			
		
}
}