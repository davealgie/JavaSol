package com.qa.topics;

public class StringManiExercises {
	public static void main(String[] args) {
		
		String str1 = "today it was sunny";
	//	String str2 = "yesterday is was raining";

	//	String mySubString1 = str1.substring(0, 8);
	//	String mySubString2 = str2.substring(12, 24);
		
	//	System.out.println(str1 + str2);
		
	//	System.out.println(str1.toUpperCase() + str2.toUpperCase());
		
	//	System.out.println(mySubString1 + mySubString2);
	//	int stringLength = str1.length();
	//	System.out.println("String Length is " + stringLength);
	//	System.out.println(str1.equals(str2));
		
		boolString("string hello my name", "my");
		
		
		
		System.out.println(vertString(str1));
		System.out.println(countWords(str1));    
		System.out.println(revString(str1));
	
		
	}
	
	public static int countWords(String str) {
		int count = 0;
		for (int e = 0; e < str.length(); e++) {
			if(str.charAt(e) != ' ') {
				count++;
				while(str.charAt(e) != ' ' && e < str.length()-1) {
					e++;
					
				}
				System.out.println(count);
			}
		}
		return count;
	}
	
	public static String revString(String str) {
		String revString = new String();
		
		for(int i=str.length()-1; i>=0; i--) {
			revString = revString + str.charAt(i);
		}
		
		return revString;
	}
	
	public static String vertString(String str){

	    if(str != null && !"".equals(str)){
	        int strLen = str.length();
	        for (int i=0; i<strLen; i++){
	            System.out.println(str.charAt(i));
	        }
	    }
		return str;
	}
	
    public static boolean boolString(String message, String find) {
        boolean myBool = false;
        for (int i = 0; i < message.length(); i++) {
            if (find.substring(0, 1).equals(message.substring(i, i + 1))) {
                for (int j = 0; j < find.length(); j++) {
                    if (find.substring(j, j + 1).equals(message.substring(j + i, j + i + 1))) {
                        myBool = true;
                    } else {
                        myBool = false;
                    }
                }
            }
        }
        System.out.println("Substring present? " + myBool);
        return myBool;
    }
}
