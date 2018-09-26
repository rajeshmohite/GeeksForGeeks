/*
Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.

Input
1
5
1 2 3 4 5
2

Output
3 4 5 1 2
 */
package Arrays;

import java.util.Scanner;

public class _02_RotatingAnArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t, n, d;
		t = scanner.nextInt();
		while (t-- > 0) {
			n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			d = scanner.nextInt();

			rotatingAnArray(arr, d);
			System.out.println();
		}
		scanner.close();
	}

	private static void rotatingAnArray(int[] arr, int d) {
		int mod = d % arr.length;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(i + mod) % arr.length] + " ");
		}
	}
}
