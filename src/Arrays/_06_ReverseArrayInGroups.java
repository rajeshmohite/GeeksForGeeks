/*
Given an array of positive integers. Reverse every sub-array of K group elements.

Input
1
5 3
1 2 3 4 5

Output
3 2 1 5 4
*/
package Arrays;

import java.util.Scanner;

public class _06_ReverseArrayInGroups {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			reverseArrayInGroups(arr, k);
			System.out.println();
		}
		scanner.close();
	}

	private static void reverseArrayInGroups(int[] arr, int k) {
		for (int i = 0; i < arr.length;) {
			for (int j = Math.min(arr.length - 1, i + k - 1); j >= i; j--) {
				System.out.print(arr[j] + " ");
			}
			i = i + k;
		}
	}
}
