package com.app;

import java.util.Scanner;

public class Star_Reverse_Mirror_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		starTriangle(rows);

	}

	private static void starTriangle(int rows) {
		for (int i = rows; i >0; i--) {
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
}
}