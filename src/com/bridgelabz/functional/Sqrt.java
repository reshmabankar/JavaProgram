package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class Sqrt{
	public static void main(String args[]) 
	{
		double t = 0;
		System.out.println("Enter the non-negative number:");
		double	c	=Utility.integerInput();
	
		double 	t1=Utility.sqrt(t, (int) c);
		System.out.println(t1	);
	}
}
