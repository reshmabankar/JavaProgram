package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Distance 
{
    public static void main(String[] args)
    {
    	 Scanner sc = new Scanner(System.in);
        // parse x- and y-coordinates from command-line arguments
    	 int x,y;
    	System.out.println("Enter the values of x and y");
    	x=sc.nextInt();
    	y=sc.nextInt();
       double dist	=Utility.distance(x, y);
       
     
		// compute distance to (0, 0)
       
    	System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    	System.out.println("Math power(x,y)="+Math.pow(x, y));
    	sc.close();
    }   
   
}

