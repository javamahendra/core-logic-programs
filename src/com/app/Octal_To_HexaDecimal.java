package com.app;

import java.util.Scanner;

public class Octal_To_HexaDecimal {
	public static void main(String[] args) {
		String o;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Octal Number:");
		o = sc.nextLine();
		octalToHex(o);
	}

	private static void octalToHex(String o) {
		int d = Integer.parseInt(o, 8);
		String h = Integer.toHexString(d);
		System.out.print("Hexadecimal Value of " + o + " is :\n");
		System.out.print(h);
	}
		
	}