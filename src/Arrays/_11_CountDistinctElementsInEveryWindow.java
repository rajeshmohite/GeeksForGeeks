/*
Given an array A[] of size n and an integer k, your task is to complete the function countDistinct which prints the count of distinct numbers in all windows of size k in the array A[].

Example

Input:  A[] = {1, 2, 1, 3, 4, 2, 3};
            k = 4
Output:
3 4 4 3
Explanation:
First window is {1, 2, 1, 3}, count of distinct numbers is 3
Second window is {2, 1, 3, 4} count of distinct numbers is 4
Third window is {1, 3, 4, 2} count of distinct numbers is 4
Fourth window is {3, 4, 2, 3} count of distinct numbers is 3

Input:
2
7 4
1 2 1 3 4 2 3
3 2
4 1 1
Output:
3 4 4 3
2 1

 */
package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _11_CountDistinctElementsInEveryWindow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			new _11_CountDistinctElementsInEveryWindow().countDistinct(arr, k, arr.length);
			System.out.println();
		}
		scanner.close();
	}

	void countDistinct(int[] arr, int k, int n) {
		for (int i = 0; i <= n - k; i++) {
			Set<Integer> set = new HashSet<Integer>();
			for (int j = i; j < i + k; j++) {
				set.add(arr[j]);
			}
			System.out.print(set.size() + " ");
		}
	}

}
