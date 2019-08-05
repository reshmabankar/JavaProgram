package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	

	public static void main(String[] args) {
	
		System.out.println("Enter the numbar to find power of 2 (less than 32)");
		int power=Utility.integerInput();
		while (power > 31) {
			System.out.println("invalid input ");
			System.out.println("enter value less than 32");
		}
		Utility.printTable(power);
	
	}
}

	
