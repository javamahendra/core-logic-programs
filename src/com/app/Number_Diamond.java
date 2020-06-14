package com.app;
/*write a program to print the following pattern?
    1
   212
  32123
 4321234
543212345
543212345
 4321234
  32123
   212
    1
 */
import java.util.Scanner;

public class Number_Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		numberDaimond(rows);
	}

	private static void numberDaimond(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		for (int i = rows; i >= 1; i--) {
			for (int j = 0; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}

			System.out.println();
		}

	}
}
