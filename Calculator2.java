package com.qa.helloworld;

public class Calculator2 {

	public static void main(String[] args) {
		System.out.println(divide(6,10));  
	}
	public static String divide(double num1, double num2) {
        String result;
        if(num1 < num2) {
        result= "" + num1 / num2;   
        return result;
        } else {
            result= "The divison cannot be performed";
        return result;
	}

}
}

