/*
Given a sorted array A[]  ( 0 based index ) and a key "k"  you need to complete the function bin_search to  determine the position of the key if the key is present in the array. If the key is not  present then you have to return -1. The arguments left and right denotes the left most index  and right most index of the array A[] .
There are multiple test cases. For each test case, this function will be called individually.

Input:
2
5
1 2 3 4 5 
4
5
11 22 33 44 55
445

Output:
3
-1
 */
package Searching;

import java.util.Scanner;

public class _02_BinarySearch {

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
			System.out.println(bin_search(arr, 0, n, k));
		}
		scanner.close();
	}

	static int bin_search(int arr[], int left, int right, int value) {
		if (left <= right) {

			int mid = (left + right) / 2;

			if (value == arr[mid]) {
				return mid;
			}

			if (value < arr[mid])
				return bin_search(arr, left, mid - 1, value);
			else
				return bin_search(arr, mid + 1, right, value);
		}
		return -1;
	}
}
