/*
Given an integer array and an element x. Find if the given element is present in array or not. If present, print index of its first occurrence, else print "-1" (without quotes).

Input:
1
4
1 2 3 4
3

Output:
2
 */
package Searching;

import java.util.Scanner;

public class _01_SearchAnElementInAnArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			int k = scanner.nextInt();
			System.out.println(searchAnElementInAnArray(arr, k));
		}
		scanner.close();
	}

	private static int searchAnElementInAnArray(int[] arr, int k) {
		boolean flag = false;
		int i = 0;
		for (; i < arr.length; i++) {
			if (arr[i] == k) {
				flag = true;
				break;
			}
		}
		if (flag)
			return i;
		else
			return -1;
	}
}
