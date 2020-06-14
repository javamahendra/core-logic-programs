package com.app;
/*
 5
1 
2 2 
3 3 3 
4 4 4 4 
4 4 4 4 
3 3 3 
2 2 
1 


 */
import java.util.Scanner;

public class Number_Pascal_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		rightPascal(rows);
	}

	private static void rightPascal(int rows) {
		for (int i = 1; i <= rows - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}

	}
}
