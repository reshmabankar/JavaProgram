package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {
    public static void main(String[] args) {
        double Temp,speed,chill1 = 0,chill;
        System.out.println("Enter the temperature value:");
        Temp=Utility.doubleInput();
        System.out.println("Enter the speed:");
        speed=Utility.doubleInput();
      
        System.out.println("Temperature = " + Temp);
        System.out.println("Wind speed  = " + speed);
        chill=Utility.windChill(chill1, Temp, speed);
        System.out.println("Wind chill  = " + chill);
    }

}

