package com.app;
/*write a program to find the count of digits of a given number
 input:146
 output:3
 */
public class Count_No_Of_Digits_In_A_Number {
	public static void main(String[] args)
	{
	 int n=201,count=0,r;
	    while(n>0)
	    {
	        r=n%10;
	        count++;
	        n=n/10;
	    }
	    System.out.println(count);
}
}
