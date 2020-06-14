package com.app;

/* write a program to find the distinct element count in an array?
 input:
 10,20,30,20,30,10
 output:
 3
 */
public class Distinct_Element_Count {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 20, 30, 10 };
		int c = 0, n = a.length;
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (a[i] == a[j])
					break;
			if (i == j)
				c++;
		}
		System.out.println(c);
	}
}
