package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{ 

	
	/**
	 * main method to test the class
	 * 
	 * @param ars
	 */
	public static void main(String args[])
	{
	
			System.out.println("enter harmonic no to find");
			double n = Utility.doubleInput();
			double h=Utility.harmonic(n);
			
			System.out.println(h);
		
	}
}