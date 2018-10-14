/*
Given an array A of size N, print second largest element from an array.

Input
2
5
89 24 75 11 23
6
56 42 21 23 65 20

Output
75
56
*/
package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _04_SecondLargest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(secondLargest(arr));
		}
		scanner.close();
	}

	private static int secondLargest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 2];
	}
}
