package com.app;

import java.util.Scanner;

public class Star_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		starSquare(rows);
	}

	private static void starSquare(int rows) {
		for (int i = rows; i > 0; i--) {
			for (int j = 1; j <=rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
