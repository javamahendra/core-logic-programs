package com.app;
/*
Write a program to print the given pattern?
input:5
output:
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 */
import java.util.Scanner;

public class Right_Pascal_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		rightPascal(rows);
	}

	private static void rightPascal(int rows) {
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}

	}

}
