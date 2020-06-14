package com.app;
/*
Write a program to print the given pattern?
input:
5
output:
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F 

 */
import java.util.Scanner;

public class Alphabet_Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		alphabetPyramid(rows);
	}

	private static void alphabetPyramid(int rows) {
		for (int i = 0; i <= rows; i++) {
			int alphabet = 65;
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print((char) (alphabet + i) + " ");
			}
			System.out.println();
		}

	}
}