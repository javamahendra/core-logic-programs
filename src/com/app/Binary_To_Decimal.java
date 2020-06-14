package com.app;
/*
 write a program to convert binary number to decimal number?
 input:
 10011
 output:
 19
 */
import java.util.Scanner;

public class Binary_To_Decimal {
	 public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter a binary number:");
         int n=s.nextInt();
         int r,i=0,a=0;
         while(n>0)
         {
             r=(n%10);
             a+=r*Math.pow(2,i);
             n=n/10;
             i++;
         }
         
         System.out.println(a);
     }
}
