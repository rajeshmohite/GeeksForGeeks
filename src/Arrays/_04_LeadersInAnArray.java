/*
Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3
 */
package Arrays;

import java.util.Scanner;

public class _04_LeadersInAnArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t, n;
		t = scanner.nextInt();
		while (t-- > 0) {
			n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}

			leadersInAnArray(arr);
			System.out.println();
		}
		scanner.close();
	}

	private static void leadersInAnArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(arr[i] + " ");
		}
	}

}
