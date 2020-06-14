package com.app;
/*
 * write a program to find the frequency count of a given char in given string?
 input:java developer 
 e
 output:3
 */
import java.util.Scanner;

public class Frequency_Count_Of_Character_In_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch = sc.next().charAt(0);
		countOfCharacter(s, ch);

	}

	private static void countOfCharacter(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
			System.out.println(ch + ":" + count);
		

	}
}
