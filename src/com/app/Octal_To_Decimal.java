package com.app;

import java.util.Scanner;

public class Octal_To_Decimal {
	 public static void main(String args[]){   
		 Scanner sc=new Scanner(System.in);
		 int i=sc.nextInt();
			System.out.println(octalToDecimal(i));       
	 }

	private static int octalToDecimal(int i) {
		int num = 0;    
		int p=0;      
		while(true){    
		   if(i == 0){    
			break;    
		   } else {    
			int temp = i%10;    
			num += temp*Math.pow(8, p);    
			i = i/10;    
			p++;    
		   }    
		}    
		return num;    
	   }    
	}
