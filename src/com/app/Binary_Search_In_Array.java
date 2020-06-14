package com.app;
/* 
 write a binary search program to search wheather the given number present in array or not?
 input:
 6
 output:
 8
 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_In_Array {

	public static void main(String[] args) {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arrays.sort(array);
		System.out.println("Sorted array");
		for (int a : array)
			System.out.print(a + " ");
		System.out.println();
		binarySearch(array, n);
	}

	private static void binarySearch(int[] array, int n) {
		int index = Arrays.binarySearch(array, n);
		System.out.println("Found " + index);

	}

}
