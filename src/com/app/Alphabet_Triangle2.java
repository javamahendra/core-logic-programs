package com.app;
/*
Write a program to print the given pattern?
input:
 5
output:
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 

 */
import java.util.Scanner;

public class Alphabet_Triangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		alphabetTriangle(rows);
	}

	private static void alphabetTriangle(int rows) {
		int alphabet = 65;
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
	}
}
