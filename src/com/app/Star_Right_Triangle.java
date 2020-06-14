package com.app;

import java.util.Scanner;

public class Star_Right_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		starTriangle(rows);

	}

	private static void starTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
