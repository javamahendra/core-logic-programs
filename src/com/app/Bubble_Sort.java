package com.app;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		int n, i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
	}
		sort(a);
	}
	public static void sort(int a[]) {
		int n = a.length, i, j, temp;
		for (i = 0; i < n - 1; i++) {

			for (j = 0; j < n - i - 1; j++) {
				if (a[j + 1] < a[j]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}

			}

		}

		for (i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
	}
}