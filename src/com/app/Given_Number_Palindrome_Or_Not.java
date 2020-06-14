package com.app;

import java.util.Scanner;

public class Given_Number_Palindrome_Or_Not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findPalindrome(n);
	}

	private static void findPalindrome(int n) {
		int r, t = n;
		r = reverse(n);
		if (t == r)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

	private static int reverse(int n) {
		int r = 0;
		while (n > 0) {
			int a = n % 10;
			r = r * 10 + a;
			n = n / 10;
		}
		return r;
	}
}
