package com.app;

import java.util.Scanner;

public class Sort_Strings_In_Alphabetical_Order {
	public static void main(String[] args) {
		int count;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings:");
		count = sc.nextInt();
		String str[] = new String[count];
		// User is entering the strings and they are stored in an array
		System.out.println("Enter the Strings one by one:");
		for (int i = 0; i < count; i++) {
			str[i] = sc.nextLine();
		}
		sortingStrings(str, count);
	}

	private static void sortingStrings(String[] str, int count) {

		String temp;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		System.out.print("Strings in Sorted Order:");
		for (int i = 0; i <= count - 1; i++) {
			System.out.print(str[i] +" ");
		}
	}
}
