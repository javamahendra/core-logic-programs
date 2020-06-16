package com.app;
/*Write a java program to find wheather the given strings are anagrams or not?
 input:
 gar
 rag
 output:given strings are anagrams
 */
import java.util.Arrays;
import java.util.Scanner;

public class Strings_Anagram_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		FindAnagrams(str1, str2);

	}

	private static void FindAnagrams(String str1, String str2) {
		if (str1.length() != str2.length())
			System.out.println("given strings are not anagrams");
		else {
			char s[] = str1.toCharArray();
			char s1[] = str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s);
			if (Arrays.equals(s,s1))
				System.out.println("given strings are anagrams");
			else
				System.out.println("given strings are not anagrams");
		}
	}
}