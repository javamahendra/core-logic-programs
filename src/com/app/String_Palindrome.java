package com.app;

import java.util.Scanner;

public class String_Palindrome {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      FindPalindrome(s);
	}

	private static void FindPalindrome(String s) {
		String r="";
		int length = s.length();
		for(int i=length-1;i>=0;i--)
			r=r+s.charAt(i);
		if(s.contentEquals(r))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
		
	}

