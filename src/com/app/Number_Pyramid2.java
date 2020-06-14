package com.app;
/*
 5
    0 
   0 1 
  0 1 2 
 0 1 2 3 
0 1 2 3 4 

 */
import java.util.Scanner;

public class Number_Pyramid2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
	    numberPyramid(rows);
	}

	private static void numberPyramid(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(j+" ");
			}

			System.out.println();
		}
}
}