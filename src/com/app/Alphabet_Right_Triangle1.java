package com.app;
/*
 * wite a program tro print the given pattern?
input:
 5
output:
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
 */
import java.util.Scanner;

public class Alphabet_Right_Triangle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		alphabetTriangle(rows);
	}

	private static void alphabetTriangle(int rows) {
		int alphabet = 65;
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + i) + " ");
			}
			System.out.println();
		}
	}
}
