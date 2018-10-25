/*
Given a string s, remove all consonants and prints the string s that contains vowels only.
Input: The first line of input contains integer T denoting the number of test cases. For each test case, we input a string.
Output: For each test case, we get a string containing only vowels. If the string doesn't contain any vowels, then print "No Vowel"

Examples:

Input: geEks
Output: eE

Input: what are you doing
Output: a ae ou oi
 */

package Searching;

import java.util.Scanner;

public class _07_RemoveConsonantsFromAString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine(); // to read \n char
		while (t-- > 0) {
			String str = scanner.nextLine();
			removeConsonantsFromAString(str);
		}
		scanner.close();
	}

	private static void removeConsonantsFromAString(String str) {
		StringBuilder strbuilder = new StringBuilder();
		for (int i = 0; i < str.toCharArray().length; i++) {
			char c = str.toCharArray()[i];
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U' || c == ' ') {
				strbuilder.append(c);
			}
		}
		if (strbuilder.length() != 0)
			System.out.println(strbuilder);
		else
			System.out.println("No Vowel");
	}

}