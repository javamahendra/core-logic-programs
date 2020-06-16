package com.app;
/*
 Write a program to find all the substrings of a given string
input:
mahi
output:
m
ma
mah
mahi
a
ah
ahi
h
hi
i
 */
import java.util.Scanner;

public class Substrings_Of_Given_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		findSubStrings(s);

	}

	private static void findSubStrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

}
