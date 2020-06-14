package com.app;
/*
write a program to convert binary number to decimal number?
input:
10011
output:
23
*/
import java.util.Scanner;

public class Binary_To_Octal {
	 public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter a binary number:");
         int n=s.nextInt();
         int[] octNum = new int[100];
         int r=0,i=0,a=0;
         String oct="";
         while(n!=0)
         {
             r=n%10;
            a+=r*Math.pow(2,i);
             n=n/10;
             i++;
         }
         System.out.println(a);
         i=1;
         while(a!=0)
         {
            octNum[i++]=a%8;
             a=a/8;
         }
         for(int j=i-1;j>0;j--)
         System.out.print(octNum[j]);
     }
}
