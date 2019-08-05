package com.bridgelabz.functional;



import com.bridgelabz.utility.Utility;

public class DayOfWeek {
  public static void main(String[] args) {
	
		
    

    boolean keepGoing = true;

    while(keepGoing) {
      System.out.println("Month");
      int m = Utility.integerInput();
        if (m < 1 || m > 12) {
          System.out.println("Months are between 1 and 12");
          continue;
        }

      System.out.println("Day");
      int d = Utility.integerInput();
        if (d < 1 || d > 31) {
           System.out.println("Days are between 1 and 31");
           continue;
        }
        

      System.out.println("Year");
      int y =Utility.integerInput();
        if (y < -10000 || y > 10000) {
           System.out.println("Years are between -10000 and 10000");
           continue;
        }


        if (y%400 == 0) 
            System.out.printf("%d is a leap year.\n", y);
          else if (y%100 == 0) 
            System.out.printf("%d isn't a leap year.\n", y);
          else if (y%4 == 0)  
           System.out.printf("%d is a leap year.\n", y);
          else
           System.out.printf("%d isn't a leap year.\n", y);  

    int d0=  Utility.dayOfWeek(d, m, y);
	System.out.println("The day of the week is " + d0);
   }
    


 }
  }


