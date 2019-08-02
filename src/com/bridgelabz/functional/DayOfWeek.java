package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;


public class DayOfWeek {
	

	public static void main(String[] args) {
		int d = 0, m = 0, y = 0;
		
		int DayOfWeek=Utility.dayOfWeek(d, m, y);
		System.out.println("enter date in 'day month year':");
		d = Utility.integerInput();
		m = Utility.integerInput();
		y = Utility.integerInput();
		System.out.println("day is "+DayOfWeek);
	
		
	}


}