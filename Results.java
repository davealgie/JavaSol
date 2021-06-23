package com.qa.helloworld;

public class Results {
	    // methods
	    public static String displayResults(int bio, int chem, int phys) {
	        String results = "SCORES\r\n";
	        results += "Biology: " + bio + "/150\r\n";
	        results += "Chemistry: " + chem + "/150\r\n";
	        results += "Physics: " + phys + "/150\r\n";
	        results += "Total: " + (bio+chem+phys) + "/450\r\n";
	        return results;
	    }
	    
	    public static double percentageResults(int bio, int chem, int phys) {
	        double percentage = ( 100 * ( bio + chem + phys ) ) / 450;
	        return percentage;
	    }
	    
	    public static String passMark(int bio, int chem, int phys) {
	    	String result;
	    	double percentage = ( 100 * ( bio + chem + phys ) ) / 450;
	    	if(percentage >= 60) {
	    		result= "Nice job you passed with ";
	    		return result + percentage;
	    		} else {
	    		result= "Unlucky you failed! ";
	    		return result + percentage;
	    		}
	      }
	    	

	    public static void main(String[] args) {
	        int biologyScore = 112;
	        int chemistryScore = 69;
	        int physicsScore = 100;
	        System.out.println(displayResults(biologyScore, chemistryScore, physicsScore));
	        System.out.println("PERCENTAGE\r\n" + percentageResults(biologyScore, chemistryScore, physicsScore) + "%");
	        System.out.println(passMark(biologyScore, chemistryScore, physicsScore) + "%");

	    
	    }
}