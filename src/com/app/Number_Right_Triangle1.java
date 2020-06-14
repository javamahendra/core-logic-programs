package com.app;
/*5
1
22
333
4444
55555
*/
import java.util.Scanner;

public class Number_Right_Triangle1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		numRightTriangle(rows);
		

	}

	private static void numRightTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
