package com.app;
/*
 write a program to find wheather the given number is strong number or not?
 input:
 145
 output:
 145 is a strong number
 */
import java.util.Scanner;

public class Strong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findStrong(n);
	}

	private static void findStrong(int n) {
		int fact_n, lastdig, total = 0, temp_n = n;
		while (n > 0) {
			int i = 1;
			fact_n = 1;
			lastdig = n % 10;
			while (i <= lastdig) {
				fact_n = fact_n * i;
				i++;
			}
			total = total + fact_n;
			n = n / 10;
		}
		if (total == temp_n)
			System.out.println(temp_n + " is a strong number");
		else
			System.out.println(temp_n + " is not a strong number");
		System.out.println();

	}
}
