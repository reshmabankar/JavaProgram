package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Springseason 
{
	public static void main (String[] args)
	{

        int month,day;
       
        System.out.print("Please enter day and month: ");
        day= Utility.integerInput();
        month = Utility.integerInput();
        int sprsea = Utility.springSeason(day, month);
        System.out.println(sprsea);
	} 
	   
		
}

