/******************************************************************************
 *  Purpose: In this Utility class there is a logic of Addition of two numbers.
 *
 *  @author  Bankar Reshma R
 *  @version 1.0
 *  @since   30-07-2019
 ******************************************************************************/



package com.bridgelabz.utility;

public class Utility {
	
	
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
 *  @since   31-07-2019
/****************************************************************************/		




public static int springseason(int d, int m)
{
	{
		{
		if(3 <= m && 20<=d || 6 >=m  && 20>=d )
		{
			{
				if(m==3)
				{
					System.out.println("March");
				}
				if(m==6)
				{
					System.out.println("June");
				}
				
			}
		
	
		System.out.println("True");
		
		}
		
		else
		{
			System.out.println("False");
		}
		}
	return 0;

}
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
 *  Purpose: In this Utility class there is a logic of Calculate distance of point (x,y) form the origin(0,0).
 *  @author  Bankar Reshma R
 *  @version 1.0
 * @param m 
 * @param d 
 *  @since   31-07-2019
/****************************************************************************/		



public static int SumOfDice(int die1, int die2) 
{
	int roll = die1 + die2;
	return roll;
}
}



		

 
