package com.app;
/*write a program to find the count of characters in a string?
 input:java developer
 output:13
 */
import java.util.Scanner;

public class Character_Count_In_A_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		charactercount(s);

	}

	private static void charactercount(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
