package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	
	
	public static void main(String[] args) {
	
		System.out.println("enter  no of times  to flip the coin");
		int times = Utility.integerInput();
		Utility.flipPerc(times);
	
	}
}