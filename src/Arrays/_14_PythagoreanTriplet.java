/*
Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

Input:
1
5
3 2 4 6 5

Output:
Yes
 */
package Arrays;

import java.util.Scanner;

public class _14_PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			pythagoreanTriplet(n, arr);
		}
		scanner.close();
	}

	private static void pythagoreanTriplet(int n, int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length; j++) {
				double sq = Math.pow(arr[i], 2) + Math.pow(arr[j], 2);
				for (int k = 0; k < arr.length; k++) {
					if (sq == Math.pow(arr[k], 2)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
