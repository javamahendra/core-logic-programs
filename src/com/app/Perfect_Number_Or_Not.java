package com.app;
/* Write a program to find the given number is perfect or not?
 input:6
 output:6 is a perfect number
 */
import java.util.Scanner;

public class Perfect_Number_Or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findPerfect(n);
	}

	private static void findPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n)
			System.out.println(n + " is a perfect number");
		else
			System.out.println(n + " is not a perfect number");
	}

}
