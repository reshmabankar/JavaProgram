package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear
{
	    public static void main(String[] args) 
	    {
	    int year;
	    {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the year greater than 1582:");
	        year = sc.nextInt();
	        
	        year=Utility.leapyear(year);
	      
	        
	        sc.close();
	    }
	    
	    }

}


