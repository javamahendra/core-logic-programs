package com.app;
/*
write a program to convert given hexadecimal number to decimal number?
input:A
output:
10
*/
import java.util.Scanner;

public class Hexadecimal_To_Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		String n = sc.nextLine();
		hexToDeci(n);
	}

	private static void hexToDeci(String n) {
		int num = Integer.parseInt(n, 16);
		System.out.println(num);

	}
}
