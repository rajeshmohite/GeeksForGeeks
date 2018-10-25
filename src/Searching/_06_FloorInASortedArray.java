/*
Given a sorted array having no duplicates, arr[] and a value, x, find floor of x in given array. Floor of x is the largest element in arr[] such that the element is smaller than or equal to x. If floor exists, then return index of it, else return -1.

Examples:

Input : arr[] = {1, 2, 8, 10, 11, 12, 19}, x = 5
Output : 1 
1 is index of 2. 2 is the largest element in arr[]
smaller than 5.

Input : arr[] = {1, 2, 8, 10, 11, 12, 19}, x = 20
Output : 6
19 is the largest element in arr[] smaller than 20.

Input : arr[] = {1, 2, 8, 10, 11, 12, 19}, x = 0
Output : -1
Since floor doesn't exist, output is -1.

Input:
3
7 0
1 2 8 10 11 12 19
7 5
1 2 8 10 11 12 19
7 10
1 2 8 10 11 12 19

Output:
-1
1
3
 */
package Searching;

import java.util.Scanner;

public class _06_FloorInASortedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			floorInASortedArray(arr, x);
		}
		scanner.close();
	}

	private static void floorInASortedArray(int[] arr, int x) {
		int max = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] <= x) && (max < arr[i])) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(index);
	}
}
