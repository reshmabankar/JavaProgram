package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String args[])
	{                                                                                                                                                                                                                                                                                                                                                                                                        
		 Scanner sc = new Scanner(System.in);
		 double a,b,c;
		  System.out.print("Enter the value of a,b,c: ");
	        a = sc.nextDouble();
	        b= sc.nextDouble();
	        c= sc.nextDouble();
	        int quadratic = Utility.quadratic(a,b,c);
	        System.out.println(quadratic);
	        sc.close();
	}
	        
	}


