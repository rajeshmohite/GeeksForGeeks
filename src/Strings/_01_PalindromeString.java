/*
Given a string S, check if it is palindrome or not.

Input:
1
4
abba

Output:
Yes
 */
package Strings;

import java.util.Scanner;

public class _01_PalindromeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			scanner.nextLine();
			String str = scanner.nextLine();
			System.out.println(isPalindromeString(str, n));
		}
		scanner.close();
	}

	private static String isPalindromeString(String str, int n) {
		char[] array = str.toCharArray();
		boolean flag = true;

		for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
			if (array[i] == array[j])
				continue;
			else {
				flag = false;
				break;
			}
		}

		if (flag)
			return "Yes";
		else
			return "No";
	}

}