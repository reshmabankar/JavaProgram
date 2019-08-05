package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class PrimeNo
{
	public static void main(String args[])
	{
		// initialize and declare here.
		int s1, s2;
		
		System.out.print("Enter the lower limit : "); 
		s1 =Utility.integerInput();
		System.out.print("Enter the upper limit :"); 
		s2 = Utility.integerInput();
		System.out.println("Prime numbers between given range are :");
		Utility.prime(s1, s2);
		
		}
}
