package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

import java.util.Scanner;
 
public class Reverse 
{
    
     
    private static String outputString;

	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The three names :");
         
        String inputString = sc.nextLine();
        
         
 
        
        outputString=Utility.reverseTheSentence(inputString);
        
        System.out.println("Input String : "+inputString);
         
        System.out.println("Output String : "+"Hii"+" "+outputString);
         
        sc.close();
    }

	
}

