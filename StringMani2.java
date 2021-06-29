package com.qa.topics;

public class StringMani2 {
	public static void main(String[] args) {
		String str1 = "ThIsIsSoMeTeXt";
		String str2 = "thisissometext";
		
		
		System.out.println(str1.toLowerCase());
		
		
		System.out.println(str1.toUpperCase());
		
		
		System.out.println(str1.charAt(3));
		
		
		System.out.println(str1.indexOf("I"));
		
		
		System.out.println(str1.startsWith("t"));
		
		
		System.out.println(str1.endsWith("t"));
		
		
		System.out.println(str1.contains("So"));
		
		
		System.out.println(str1.substring(1, 3));
		
		
		System.out.println(str1.equals(str2));
		
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		System.out.println(str1.replace("SoMe","REALLYFU"));
		
	}
}
