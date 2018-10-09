/*
Given an array A of positive integers of size N, where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are M students, the task is to distribute chocolate packets such that :
1. Each student gets one packet.
2. The difference between the number of chocolates given to the students having packet with maximum chocolates and student having packet with minimum chocolates is minimum.

Input:
2
8
3 4 1 9 56 7 9 12
5
7
7 3 2 4 9 12 56
3

Output:
6
2
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _10_ChocolateDistributionProblem {

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
			chocolateDistributionProblem(arr, k);
		}
		scanner.close();
	}

	private static void chocolateDistributionProblem(int[] arr, int k) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= arr.length - k; i++) {
			int diff = Math.abs(arr[i] - arr[i + k - 1]);
			if (diff < min) {
				min = diff;
			}
		}
		System.out.println(min);
	}

}
