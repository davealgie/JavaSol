package com.qa.helloworld;

public class TotalResults {
	
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
    
	  public static String bioMark(int biologyScore) {
	    String result;
	    if(biologyScore >= 60) {
	    	result= "Nice job you passed Biology with ";
	    	return result + biologyScore;
	    	} else {
	    	result= "Unlucky you failed Biology ";
	    	return result;
    	}
	  }
	  public static String chemMark(int chemistryScore) {
		    String result;
		    if(chemistryScore >= 60) {
		    	result= "Nice job you passed Chemistry with ";
		    	return result + chemistryScore;
		    	} else {
		    	result= "Unlucky you failed Chemistry ";
		    	return result;
		    	}
	  }
	  public static String physMark(int physicsScore) {
		    String result;
		    
		    if(physicsScore >= 60) {
		    	result= "Nice job you passed Physics with ";
		    	return result + physicsScore;
		    	} else {
		    	result= "Unlucky you failed Physics ";
		    	return result;
		    	}
	
	  } // Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.
	  
	  public static String totalFailed(int biologyScore,int chemistryScore, int physicsScore) {
	  			String result = null;
				return result;
	  			

	  }


	public static void main(String[] args) {
        int biologyScore = 70;
        int chemistryScore = 100;
        int physicsScore = 140;
        System.out.println(displayResults(biologyScore, chemistryScore, physicsScore));
        System.out.println(passMark(biologyScore, chemistryScore, physicsScore) + "%");
        System.out.println(bioMark(biologyScore) + " \r\n" + chemMark(chemistryScore) + "  \r\n" + physMark(physicsScore));
    }
    
}
