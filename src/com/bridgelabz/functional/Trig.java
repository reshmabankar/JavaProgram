package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Trig {
	public static void main(String args[])
	{

	
		 System.out.println("Enter the degree:"); 
		 double degrees=Utility.doubleInput();
		
		 double cosvalue=Utility.cosVal(degrees);
	
		 
	      System.out.println("cos(" + degrees + ") = " + cosvalue);
			
			 double sinvalue=Utility.sinVal(degrees);
			 
	      System.out.println("sin(" + degrees + ") = " + sinvalue);
	      
	      
    } 
} 


