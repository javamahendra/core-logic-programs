package com.app;
/*
write a program to convert binary number to decimal number?
input:
10011
output:
13
*/
import java.util.Scanner;

public class Binary_To_Hexa_Decimal {
	 public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         
         System.out.println("Enter a binary number:");
         int n=s.nextInt();
         
         int r=0,i=1,a=0;
         //int h[]=new int[100];
         while(n!=0)
         {
             r=n%10;
             a+=r*i;
             i=i*2;
             n=n/10;
            
         }
         System.out.println(a);
         int rem;
         String str2=""; 
         char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     
         while(a>0)
         {
           rem=a%16; 
           str2=hex[rem]+str2; 
           a=a/16;
         }
         System.out.println(str2);
     }

}
