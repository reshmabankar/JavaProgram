package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class CarLoan {
	public static void main(String[] args) {
		
		System.out.println("enter principal ,year and rate");
		double p = Utility.doubleInput();
		double y = Utility.doubleInput();
		double r = Utility.doubleInput();
		double mp=Utility.monthlyPayment(p, y, r);
		System.out.println("mothly payment is: "+mp);
	}
}

	
	