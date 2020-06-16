package com.app;
/*
Write a program to remove character at given position in a string?
input:
2
java developer
Output:
jaa developer
 */
public class Remove_Char_At_Specific_Position_Of_String {
	public static void main(String[] args) {
		String str = "java developer";
		String s = removeCharAt(str, 2);
		System.out.println(s);

	}

	private static String removeCharAt(String str, int i) {
		String r = str.substring(0, i) + str.substring(i + 1);

		return r;
	}
}
