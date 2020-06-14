package com.app;
/*
 5
 0 1 2 3 4 
  0 1 2 3 
   0 1 2 
    0 1 
     0 

 */
import java.util.Scanner;

public class Number_Pyramid_Reverse1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		reversePyramid(rows);

	}

	private static void reversePyramid(int rows) {
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= rows - 1 - i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
}
}