package com.app;
/*
write a program to convert decimal number to binary number?
input:
9
output:
1001
*/
import java.util.Scanner;

public class Decimal_To_Binary {
	public static void main(String[] args)
	{
		int bin[]=new int[100],i=0;
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    while(n>0)
        {
            bin[i++]=n%2;
            n=n/2;
        }
	    for(int j= i-1;j >= 0;j--){    
	        System.out.print(bin[j]);    
	      }    
	    
	}
}
