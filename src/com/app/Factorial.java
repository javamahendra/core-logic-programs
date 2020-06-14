package com.app;

/*
 Write a program to Find the factorial of a given number?
input:
5
Output:
Factorial of 5 is: 120
 */
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findFactorial(n);

	}

	private static void findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}
}
