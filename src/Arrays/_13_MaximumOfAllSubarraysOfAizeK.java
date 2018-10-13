/*
Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.
Input:
2
9 3
1 2 3 1 4 5 2 3 6
10 4
8 5 10 7 9 4 15 12 90 13

Output:
3 3 4 5 5 5 6
10 10 10 15 15 90 90
 */

package Arrays;

import java.util.Scanner;

public class _13_MaximumOfAllSubarraysOfAizeK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			maximumOfAllSubarraysOfAizeK(n, k, arr);
			System.out.println();
		}
		scanner.close();
	}

	private static void maximumOfAllSubarraysOfAizeK(int n, int k, int[] arr) {
		for (int i = 0; i <= n - k; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i; j < i + k; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			System.out.print(max + " ");
		}
	}

}
