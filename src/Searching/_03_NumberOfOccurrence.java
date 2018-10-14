/*
Given a sorted array A of size N and a number X, you need to find the number of occurrences of X in A.
Input:
2
7 2
1 1 2 2 2 2 3
7 4
1 1 2 2 2 2 3
Output:
4
-1
*/
package Searching;

import java.util.Scanner;

public class _03_NumberOfOccurrence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			int x = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(numberOfOccurrence(arr, x));
		}
		scanner.close();
	}

	private static int numberOfOccurrence(int[] arr, int x) {
		int count = 0;
		for (int i : arr) {
			if (i == x)
				count++;
		}
		if (count == 0)
			return -1;
		else
			return count;
	}

}
