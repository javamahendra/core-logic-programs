package com.app;
/*
 Write a program to print star diamond pattern
 input:5
 output:
 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
import java.util.Scanner;

public class Star_Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		starDiamond(rows);

	}

	private static void starDiamond(int rows) {
		int space = rows - 1;
		for (int j = 1; j <= rows; j++) {
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (int i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (int j = 1; j <= rows - 1; j++) {
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (int i = 1; i <= 2 * (rows - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
