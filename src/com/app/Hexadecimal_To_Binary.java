package com.app;
/*
 write a program to convert given hexadecimal number to binary number?
 input:A
 output:
 1010
 */
import java.util.Scanner;

public class Hexadecimal_To_Binary {

	public static void main(String[] args) {
		System.out.println("enter hexadecimal num: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		hexToBinary(n);
	}

	private static void hexToBinary(String n) {
		int num = Integer.parseInt(n, 16);
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary Value is : " + binary);
	}

}
