/*
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
 */
package Strings;

import java.util.Scanner;

public class _02_ReverseWordsInAGivenString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		while (t-- > 0) {
			String str = scanner.nextLine();
			reverseWordsInAGivenString(str);
			System.out.println();
		}
		scanner.close();
	}

	private static void reverseWordsInAGivenString(String str) {
		String[] split = str.trim().split("\\.");

		for (int i = split.length - 1; i >= 0; i--) {
			if (i == 0)
				System.out.print(split[i]);
			else
				System.out.print(split[i] + ".");
		}
	}
}