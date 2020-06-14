package com.app;
/* write a program to search the given element?
 input:-2
 output:2
 */
import java.util.Scanner;

public class Linear_Search_In_Array {
	public static void main(String[] args) {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		linearSearch(array, target);
	}

	private static void linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				System.out.println(i);
				break;
			}
		}

	}
}
