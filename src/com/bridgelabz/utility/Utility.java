/******************************************************************************
 *  Purpose: In this Utility class there is a logic of Addition of two numbers.
 *
 *  @author  Bankar Reshma R
 *  @version 1.0
 *  @since   30-07-2019
 ******************************************************************************/



package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int integerInput()
	{
		int integerValue = scanner.nextInt();
		return integerValue;
	}
	
			
	public static char charInput()
	{
		char charValue = scanner.next().charAt(0);
		return charValue;
	}
	
	
	
	public static String stringInput()
	{
		String stringValue = scanner.next();
		return stringValue;
	}
	public static String line()
	{
		String lineValue = scanner.nextLine();
		return lineValue;
	}
	public static double doubleInput()
	{
		Double doubleValue = scanner.nextDouble();
		return doubleValue;
	}
	
	
	
	
	
	
	
	
		public static int add(int num1,int num2) 
		{
			// TODO Auto-generated method stub

			int sum;
			
		    sum = num1 + num2;
		    
			return sum;
		}
		
		
/******************************************************************************
 *  Purpose: In this Utility class there is a logic of operation of three integer numbers.
 *
 *  @author  Bankar Reshma R
 *  @version 1.0
 *  @since   31-07-2019
 ******************************************************************************/


public static int operation(int a, int b, int c, int num, int value) 
	{
			// TODO Auto-generated method stub
			
		if(num==1)
		{
			
			value=a+b*c;
				
		}
			
			if(num==2)
		{
				
			value=a*b+c;
					
				
		}

			if(num==3)
		{
				
			value=c+a/b;
					
			
		}

			if(num==4)
		{
				
			value=a%b+c;
					
		}
			
			return value;
		}

/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of operation of reverse three names.
 *  @author  Bankar Reshma R
 *  @version 1.0
 *  @since   30-07-2019
/****************************************************************************/		


public static String reverseTheSentence(String inputString)
{
    String[] words = inputString.split("\\s");
     
    String outputString = "";
     
    for (int i = words.length-1; i >= 0; i--)
    {
        outputString = outputString + words[i] + " ";
    }
     
    return outputString;
}
		

/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of operation of three Double values.
 *  @author  Bankar Reshma R
 *  @version 1.0
 *  @since   31-07-2019
/****************************************************************************/		

public static double operation1(double a, double b, double c, double num, double value)
{
			{
				// TODO Auto-generated method stub
				
				if(num==1)
			{
				
				value=a+b*c;
						
			}
				
				if(num==2)
			{
					
				value=a*b+c;
						
					
			}

				if(num==3)
			{
					
				value=c+a/b;
				
					
			}

				if(num==4)
			{
					
				value=a%b+c;
						
			}
				
				return value;
			}

					
					
					
		  }



/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Leap Year.
 *  @author  Bankar Reshma R
 *  @version 1.0
 *  @since   31-07-2019
/****************************************************************************/		

				
public static int leapyear(int year)
{



if(year>=1582)
{
boolean leap;
if(year % 4 == 0)
{
    if( year % 100 == 0)
    {
        // year is divisible by 400, hence the year is a leap year
        if ( year % 400 == 0)
            leap = true;
        else
            leap = false;
    }
    else
        leap = true;
}
else
    leap = false;
if(leap)
    System.out.println(year + " is a leap year.");
else
    System.out.println(year + " is not a leap year.");
}
else
{
	System.out.println("Year is less than 1582!!!");
}
return 0;

}

			
/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Spring season.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 * @return 
 *  @since   31-07-2019
/****************************************************************************/		




public static int springSeason(int day, int month)

{
		if(3<=month && 6>=month)
			
				{
				
					System.out.println("True");
	
				}
			
		else
		{
			System.out.println("False");
		}
	
return 0;
		
}






/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of find the roots of Quadratic equation.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   31-07-2019
/****************************************************************************/		


public static int quadratic(double a, double b,double c)
{

double root1, root2;

double delta = b * b - 4 * a * c;

// condition for real and different roots
if(delta > 0) {
    root1 = (-b + Math.sqrt(delta)) / (2 * a);
    root2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.printf("root1 = %.2f and root2 = %.2f", root1 , root2);
}
// Condition for real and equal roots
else if(delta == 0) {
    root1 = root2 = -b / (2 * a);
    System.out.printf("root1 = root2 = %.2f;", root1);
}
// If roots are not real
else {
    double realPart = -b / (2 *a);
    double imaginaryPart = Math.sqrt(-delta) / (2 * a);
    System.out.printf("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
}
return 0;

}





/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Calculate distance of point (x,y) form the origin(0,0).
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   31-07-2019
/****************************************************************************/		


public static double distance(double x,double y) 

{

    
    double dist = Math.sqrt(x*x + y*y);

// output distance

	return dist;	
	
}


/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Calculate sum of two dice.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   1-08-2019
/****************************************************************************/		



public static int SumOfDice(int die1, int die2) 
{
	int roll = die1 + die2;
	return roll;
}



/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of calculate the average,min,max of any five numbers form 0-1.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   1-08-2019
/****************************************************************************/		



public static double stats( double average,int n,double x1,double x2,double x3,double x4,double x5) 
{
	

	average = (x1 + x2 + x3 + x4 + x5) / n;

	
	// TODO Auto-generated method stub
	return average;
}


/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of calculate chill base on temperature and air speed.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   1-08-2019
/****************************************************************************/		








public static double windChill(double chill1,double Temp,double speed) {
	
	chill1 = 35.74 + 0.6215*Temp + (0.4275*Temp - 35.75) * Math.pow(speed, 0.16);
	return chill1;
}


/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of print the day of week.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   2-08-2019
/****************************************************************************/		




 public static int dayOfWeek(int d, int m, int y) {
	int y0 = y - (14 - m) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = m + 12 * ((14 - m) / 12) - 2;
	int d0 = (d + x + (31 * m0) / 12) % 7;
	
	return d0;
}
 
 
 
 /*****************************************************************************
  *  Purpose: In this Utility class there is a logic of temperature conversion.
  *  @version 1.0
  * @param m 
  * @param d 
  *  @since   2-08-2019
 /****************************************************************************/		


 
 
 public static int temperaturConversion(int tem, char t) {
		int conver;
		if (t == 'c' || t == 'C') {
			conver = (tem * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			conver = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;

		}
		return conver;
	}


 /*****************************************************************************
  *  Purpose: In this Utility class there is a logic of calculate Monthly car loan amount.
  *  @author  Bankar Reshma R
  *  @version 1.0
  * @param m 
  * @param d 
  *  @since   2-08-2019
 /****************************************************************************/		



public static double monthlyPayment(double p, double y, double r) {
	double n = 12 * y;
	double r0 = r / (12 * 100);
	double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
	return payment;
}





public static double sinVal(double degrees)
{
	
	double radians = Math.toRadians(degrees);
	 double sinValue = Math.sin(radians);
	
	return sinValue;
}


	 public static double cosVal(double degrees)
	 {
	 	
	 			double radians = Math.toRadians(degrees);
	 	 double cosValue = Math.cos(radians);
	 	
	 	return cosValue;
	 
	 
}
	 /*****************************************************************************
	  *  Purpose: In this Utility class there is a logic of print the power of 2.
	  *  @author  Bankar Reshma R
	  *  @version 1.0
	  * @param m 
	  * @param d 
	  *  @since   3-08-2019
	 /****************************************************************************/		
	 
	 

	 public static int printTable(int power) {
			int val = 1;
			for (int i = 1; i <= power; i++) {
				val = val * 2;
				System.out.println(val);
			}
			return val;
		}

	 
	 
	 /*****************************************************************************
	  *  Purpose: In this Utility class there is a logic of harmonic number.
	  *  @author  Bankar Reshma R
	  *  @version 1.0
	  * @param m 
	  * @param d 
	  *  @since   3-08-2019
	 /****************************************************************************/		
		/**
		 * Function to calculate the nth harmonic no
		 * 
		 * @param n the value of harmonic no
		 * @return
		 */
	 public static double harmonic(double n) 
	 {
	 double h = 1;
	 for (double i = 2; i <= n; i++) 
	 {
		h = h + 1 / i;
	 }
	 return h;
	 }


	 /*****************************************************************************
	  *  Purpose: In this Utility class there is a logic of find suare root of non negative value using newton method.
	  *  @author  Bankar Reshma R
	  *  @version 1.0
	  * @param m 
	  * @param d 
	  *  @since   3-08-2019
	 /****************************************************************************/	

public static double sqrt(double t,int c){

double epsilon=1e-15;
t=c;
while(Math.abs(t-c/t)>epsilon*t) 
{
	t=(c/t+t)/2;
}
return t;
}




/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Gamling Simulator.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   3-08-2019
/****************************************************************************/	

/**
 * Function to simulate gamble
 * 
 * @param n      the value of no of times to bet
 * @param $stack the amount which you have
 * @param $goal  the value which to reach to win the gamble (not the bet)
 * @return 
 */
public static void gamble(int noOfTimes, int $Stack, int $Goal) {
	int bets = 0; // total number of bets made
	int wins = 0; // total number of games won

	// repeat number of times
	for (int i = 0; i < noOfTimes; i++) {
		int cash = $Stack;

		while (cash > 0 && cash < $Goal) {
			bets++;

			if (Math.random() < 0.5)
				cash++; // win $1
			else
				cash--; // lose $1
		}
		if (cash == $Goal)
			wins++; // to find no. of wins
	}

	// print results
	System.out.println();
	System.out.println(wins + " wins out of of " + noOfTimes);
	System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
	System.out.println("Percent of games lost = " + 100.0 * (noOfTimes - wins) / noOfTimes);
	System.out.println("Total bets in " + noOfTimes + " games = " + bets);

}



/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of prime Number between the range.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   3-08-2019
/****************************************************************************/	

public static void prime(int s1, int s2)
{
	int i,j,count = 0;

for(i = s1; i <= s2; i++)
{
	for( j = 2; j < i; j++)
	{
		if(i % j == 0)
		{
			count = 0;
			break;
		}
		else
		{
			count = 1;
		}
	}
	if(count == 1)
	{
		System.out.println(i);
	}
}
}




/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of FlipCoin.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   3-08-2019
/***************************************************************
************/	

public static int flipPerc(int times)
{
	double heads = 0;
	for (int i = 0; i < times; i++) 
	{
		if (Math.random() > 0.5)
		{
			heads++;
		}
	}
	System.out.println("heads percentage is " + (float) (heads / times) * 100);
	System.out.println("tails percentage is " + (float) (times - heads) / times * 100);

return 0;

}


/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Prime factor.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   3-08-2019
/***************************************************************
************/	





public static boolean isPrime(int n) {
	for (int i = 2; i <= n / 2; i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return true;
}

public static void primeFactors(int n) {
	for (int i = 2; i <= n; i++) {
		int t = n % i;
		if (t == 0) {
			if (isPrime(i))
				System.out.println(i + " ");
		}
	}
}


/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of print smallest and largest number.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   3-08-2019
/***************************************************************
************/	


public static void print2Smallest(int arr[]) 
{ 
    int first, second, arr_size = arr.length; 

    first = second = Integer.MAX_VALUE; 
    for (int i = 0; i < arr_size ; i ++) 
    { 
   
        if (arr[i] < first) 
        { 
            second = first; 
            first = arr[i]; 
        } 

        else if (arr[i] < second) 
            second = arr[i]; 
    } 
    
        System.out.println("Second Smallest element is: " + second); 
        
} 



public static void print2largest(int[] arr) 
{ 
    int first, second, arr_size = arr.length; 

    first = second = Integer.MIN_VALUE; 
    for (int i = 0; i < arr_size ; i ++) 
    { 
   
        if (arr[i] > first) 
        { 
            second = first; 
            first = arr[i]; 
        } 

        else if (arr[i] > second) 
            second = arr[i]; 
    } 
    
        System.out.println("Second largest element is: "+ second); 
        
}




/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of find out the repeated number.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   3-08-2019
/***************************************************************
************/	


public static void printRepeatno(int arr[])  
{ 
    int i, j; 
    System.out.println("Repeated Elements are :"); 
    int size = 100;
	for (i = 0; i < size; i++)  
    { 
        for (j = i + 1; j < size; j++)  
        { 
            if (arr[i] == arr[j])  
                System.out.print(arr[i] + " "); 
        } 
    } 
}

/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of generates the result of rolling a fair six­sided die
(an integer between 1 and 6)..
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   3-08-2019
/***************************************************************************/	

public static int roll(int roll)  
{

int SIDES = 6;

roll = (int) (Math.random() * SIDES) + 1;

return roll;

}

/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Taylor series expansions for sin.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since    5 -08-2019
/***************************************************************************/	

public static double sin(double sum,double x)  
{
x = x % (2 * Math.PI);

// compute the Taylor series approximation
double term = 1.0;      // ith term = x^i / i!
sum  = 0.0;      // sum of first i terms in taylor series

for (int i = 1; term != 0.0; i++) {
    term *= (x / i);
    if (i % 4 == 1) sum += term;
    if (i % 4 == 3) sum -= term;
}
return sum;
}


/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Taylor series expansions for cos.
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since    5 -08-2019
/***************************************************************************/	

public static double cos(double sum,double x)  
{
x = x % (2 * Math.PI);

// compute the Taylor series approximation
double term = 1.0;      // ith term = x^i / i!
sum  = 0.0;      // sum of first i terms in taylor series

for (int i = 1; term != 0.0; i++) {
    term *= (x / i);
    if (i % 2 == 0) sum += term;
    if (i % 1 == 0) sum -= term;
}
return sum;
}





public static int[] toBinary(int d) {

	String bin = "";
	while (d != 0) {
		bin = (d % 2) + bin;
		d /= 2;
	}
	while (bin.length() % 4 != 0) {
		bin = 0 + bin;
	}
	return stringToIntArray(bin);
}

/**
 * Function to convert string to int array helper function for swapnibble in
 * Binary.java class
 *
 * @param bin String of binary no
 * @return return integer array
 */
static int[] stringToIntArray(String bin) {
	int[] binary = new int[bin.length()];
	for (int i = 0; i < binary.length; i++) {
		binary[i] = bin.charAt(i) - 48;
	}
	return binary;
}

public static int toDecimal(int[] binary) {
	int dec = 0, j = 0;
	for (int i = binary.length - 1; i >= 0; i--) {
		if (binary[i] == 1) {
			dec = dec + (int) Math.pow(2, j);
		}
		j++;
	}
	return dec;
}


}


