package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class TempratureConversion {
	public static void main(String[] args) {
		try
		{
		
			System.out.println("enter temp in c or f");
			int tem =Utility.integerInput();
			char t = Utility.charInput();
	
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') 
			{
				System.out.println("enter correct input");
				main(args);
				return;
			}
			tem = Utility.temperaturConversion(tem, t);
			System.out.println("coverted temp is " + tem);
		} 
		catch (Exception e)
		{
			System.out.println("temperature in format 4545 c");
		}

	}
}