/*
Given an array of sorted integers. The task is to find the closest value to the given number in array. Array may contain duplicate values.

Note: If the difference is same for two values print the value which is greater than the given number.

Input:
2
4 4
1 3 6 7
7 4
1 2 3 5 6 8 9

Output:
3
5
 */
package Arrays;

import java.util.Scanner;

public class _08_FindTheClosestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t, n, k;
		t = scanner.nextInt();
		while (t-- > 0) {
			n = scanner.nextInt();
			k = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			findTheClosestNumber(arr, k);
		}
		scanner.close();
	}

	private static void findTheClosestNumber(int[] arr, int k) {
		int temp = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int diff = Math.abs(k - arr[i]);
			if (diff <= min) {
				min = diff;
				temp = arr[i];
			}
		}
		System.out.println(temp);
	}
}
