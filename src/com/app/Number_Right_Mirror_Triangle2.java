package com.app;
/*
 5
    1
   12
  123
 1234
12345

 */
import java.util.Scanner;

public class Number_Right_Mirror_Triangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		numberTriangle(rows);

	}

	private static void numberTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
}
}
