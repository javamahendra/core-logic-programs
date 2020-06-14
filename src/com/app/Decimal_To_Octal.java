package com.app;
/*
write a program to convert decimal number to octal number?
input:
10
output:
12
*/
import java.util.Scanner;

public class Decimal_To_Octal {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
		//System.out.println(Integer.toOctalString(9));
		//System.out.println(Integer.toOctalString(5));*/
		int r;
		char o[]= {'0','1','2','3','4','5','6','7'};
		String s="";
		while(n>0) {
		r=n%8;
	    s=o[r]+s;
	    n=n/8;
		}
		System.out.println(s);
		
	}
}
