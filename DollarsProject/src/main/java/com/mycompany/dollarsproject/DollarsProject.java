/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dollarsproject;

/**
 *
 * @author SChang2026
 */

import java.util.Scanner;
public class DollarsProject {

    public static void main(String[] args) {
      
//Plan: create variables for each value, creat one variable that dictates change in the mathematical functions.
//Plan cont: Use double instead of int in order to use decimals in processes.
//Plan cont: Change double variables to int because you can't have 0.5 a dollar bill.
//Plan cont: Utilize division to seperate out each number value.
//Plan cont: import java.util.Scanner for user input.
        
       double thousandDollarChecks = 1000;
       double hundredDollars = 100;
       double tenDollars = 10;
       double fiveDollars = 5;
       double oneDollars = 1;
       double quarters = 0.25;
       double dimes = 0.10;
       double nickels = 0.05;
       double pennies = 0.01;
       double atmChange;
   
       
//function describes amount and change in each step (major help from professor)
//math round function because pennies are not read by java as being 0.01

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the amount of change: ");
       atmChange = scan.nextDouble();
       System.out.println("Amount Thousand Dollar Checks: " + (int)(atmChange/thousandDollarChecks));
       atmChange = atmChange - ((int)(atmChange/thousandDollarChecks) * 1000);
       System.out.println("Amount Hundreds: " + (int)(atmChange/hundredDollars));
       atmChange = atmChange - ((int)(atmChange/hundredDollars) * 100);
       System.out.println("Amount Tens: " + (int)(atmChange/tenDollars));
       atmChange = atmChange - ((int)(atmChange/tenDollars) * 10);
       System.out.println("Amount Fives: " + (int)(atmChange/fiveDollars));
       atmChange = atmChange - ((int)(atmChange/fiveDollars) * 5);
       System.out.println("Amount Ones: " + (int)(atmChange/oneDollars));
       atmChange = atmChange - ((int)(atmChange/oneDollars) * 1);
       System.out.println("Amount Quarters: " + (int)(atmChange/quarters));
       atmChange = atmChange - ((int)(atmChange/quarters) * 0.25);
       System.out.println("Amount Dimes: " + (int)(atmChange/dimes));
       atmChange = atmChange - ((int)(atmChange/dimes) * 0.10);
       System.out.println("Amount Nickels: " + (int)(atmChange/nickels));
       atmChange = atmChange - ((int)(atmChange/nickels) * 0.5);
       atmChange = atmChange + 0.0001;
       System.out.println("Amount Pennies: " + (int)(atmChange/pennies));
       
       
    
       
    }
}
