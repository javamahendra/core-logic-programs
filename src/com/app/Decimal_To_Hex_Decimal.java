package com.app;
/*
write a program to convert decimal number to hexadecimal number?
input:
10
output:
A
*/
import java.util.Scanner;

public class Decimal_To_Hex_Decimal {
	public static void main(String[] args) {
	int rem;
	 String str2="";
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     while(n>0)
     {
       rem=n%16; 
       str2 = hex[rem]+str2; 
       n=n/16;
     }
     System.out.println(str2);
}
}
