package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class GamlingSimulator {

	public static void main(String[] args) {
		
		int trails, $stack, $goal;
		System.out.println("enter stack amount");
		$stack = Utility.integerInput();
		System.out.println("enter goal amount");
		$goal = Utility.integerInput();
		System.out.println("enter no of times to gamble");
		trails = Utility.integerInput();
	
		Utility.gamble(trails, $stack, $goal);

	}
}
