package com.app;

import java.util.Scanner;

public class Star_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		starPyramid(rows);
	}

	private static void starPyramid(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
