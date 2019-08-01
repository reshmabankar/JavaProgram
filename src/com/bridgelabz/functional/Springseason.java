package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Springseason 
{
	public static void main (String[] args)
	{

        Scanner sc = new Scanner(System.in);
        int m,d;
        

        System.out.print("Please enter month and day: ");
        m = sc.nextInt();
        d= sc.nextInt();
        int springseason = Utility.springseason(d, m);
        sc.close();
	} 
	   
		
}

