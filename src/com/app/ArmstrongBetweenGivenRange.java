package com.app;
/*
 Write a program to find the armstrong numbers between given range?
 input:200
 output:
 0 1 153 
 */
import java.util.Scanner;

public class ArmstrongBetweenGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findArmstrong(n);

	}

	private static void findArmstrong(int n) {
		for (int i = 0; i <= n; i++) {
			int a, rem, sum = 0;
			a = i;
			while (a > 0) {
				rem = a % 10;
				sum = sum + (rem * rem * rem);
				a = a / 10;
			}
			if (sum == i) {
				System.out.print(i+" ");
			}
		}

	}
}
