package com.app;
/*
write a program to convert given hexadecimal number to octal number?
input:A
output:
12
*/
import java.util.Scanner;

public class Hexadecimal_To_Octal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		String n=sc.nextLine();
		hexToOct(n);
	}

	private static void hexToOct(String n) {
		int num = Integer.parseInt(n, 16);
		System.out.println(num);
		String octal = Integer.toOctalString(num);
		System.out.println(octal);
	}
}
