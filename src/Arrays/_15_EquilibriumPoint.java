/*
Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array.
Equilibrium position in an array is a position such that the sum of elements below it is equal to the sum of elements after it.

Input:
2
1
1
5
1 3 5 2 2

Output:
1
3

Explanation:
Testcase 1: Since its the only element hence its the only equilibrium point.
Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).
 */
package Arrays;

import java.util.Scanner;

public class _15_EquilibriumPoint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(equilibriumPoint(n, arr));
		}
		scanner.close();
	}

	private static int equilibriumPoint(int n, int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int h = sum;
		int l = 0;

		for (int j = 0; j < arr.length; j++) {
			if (j > 0)
				l = l + arr[j - 1];

			h = h - arr[j];

			if (l == h)
				return j + 1;
		}
		return -1;
	}

}
