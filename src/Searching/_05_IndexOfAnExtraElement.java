/*
Given two sorted arrays. There is only 1 difference between the arrays. First array has one element extra added in between. Find the index of the extra element.

Input:
2
7
2 4 6 8 9 10 12
2 4 6 8 10 12
6
3 5 7 9 11 13
3 5 7 11 13

Output:
4
3
*/
package Searching;

import java.util.Scanner;

public class _05_IndexOfAnExtraElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n - 1];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < n - 1; i++) {
				b[i] = scanner.nextInt();
			}
			System.out.println(findExtra(a, b, n));
		}
		scanner.close();
	}

	private static int findExtra(int[] a, int[] b, int n) {
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = false;
					break;
				}
			}
			if (!flag)
				continue;
			else
				return i;
		}
		return -1;
	}
}
