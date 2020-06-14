package com.app;
/*
 5
12345
1234
123
12
1

 */
import java.util.Scanner;

public class Number_Right_Reverse_Triangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		numberTriangle(rows);

	}

	private static void numberTriangle(int rows) {
		for (int i = rows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

