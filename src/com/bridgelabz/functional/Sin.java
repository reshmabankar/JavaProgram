package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Sin {


	    public static void main(String[] args) { 
	    	double sum = 0;
	   System.out.println("Enter the angle x:");
	     double x=Utility.doubleInput();

	double sum1 = Utility.sin(sum, x);
	      

	        // convert x to an angle between -2 PI and 2 PI
	       
	        System.out.println(sum1);
	    }
	}



