/*
Write a program to input a list of n integers in an array and arrange them in a way similar to the to-and-fro movement of a Pendulum.

The minimum element out of the list of integers, must come in center position of array. If there are even elements, then minimum element should be moved to (n-1)/2 index (considering that indexes start from 0)
The next number (next to minimum) in the ascending order, goes to the right, the next to next number goes to the left of minimum number and it continues like a Pendulum.

Input:
2
5
1 3 2 5 4
5
11 12 31 14 5

Output:
5 3 1 2 4
31 12 5 11 14
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _07_PrintAnArrayInPendulumArrangement {

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
			printArrayInPendulumArrangement(arr, n);
			System.out.println();
		}
		scanner.close();
	}

	private static void printArrayInPendulumArrangement(int[] arr, int n) {
		Arrays.sort(arr);
		int mid = (n - 1) / 2;
		int newArr[] = new int[n];
		newArr[mid] = arr[0];
		int i, j;
		for (i = 1, j = 1; i <= mid; i++) {
			newArr[mid + i] = arr[j++];
			newArr[mid - i] = arr[j++];
		}

		if (n % 2 == 0)
			newArr[mid + i] = arr[j];

		for (int k = 0; k < newArr.length; k++) {
			System.out.print(newArr[k] + " ");
		}
	}
}
