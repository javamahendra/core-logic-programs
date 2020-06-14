package com.app;
/*
Write a program to print given pattern?
input:
 5
Output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

 */
import java.util.Scanner;

public class Number_Pattern_Triangle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		numberTriangle(rows);

	}

	private static void numberTriangle(int rows) {
		int i, j, k = 1;
		for (i = 1; i <= rows; i++) {
			for (j = 1; j < i + 1; j++) {
				System.out.print(k++ + " ");
			}

			System.out.println();
		}

	}
}
