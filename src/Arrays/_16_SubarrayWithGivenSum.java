/*
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number.

Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation : 
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
 */
package Arrays;

import java.util.Scanner;

public class _16_SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int sum = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			// System.out.println(subarrayWithGivenSum(n, arr, sum));
			subarrayWithGivenSum(n, arr, sum);
		}
		scanner.close();
	}

	private static void subarrayWithGivenSum(int n, int[] arr, int sum) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			int t = arr[i];
			if (t == sum){
				flag=true;
				System.out.println((i + 1) + " " + (i + 1));
			}
			for (int j = i + 1; j < arr.length; j++) {
				t = t + arr[j];
				if (t == sum) {
					System.out.println((i + 1) + " " + (j + 1));
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}
		if (!flag)
			System.out.println(-1);
	}

}
