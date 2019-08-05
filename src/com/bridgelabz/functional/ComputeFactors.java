package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class ComputeFactors {


		public static void main(String[] args) {
			
			System.out.println("enter no to find prime factors");
			int n = Utility.integerInput();
			System.out.println("prime factors are ");
			Utility.primeFactors(n);
			
		

		}
}
	
