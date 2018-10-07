/*
Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

Input:
2
7
1 2 3 5 4 7 10
7
0 4 5 3 7 2 1

Output:
7 5 3 1 2 4 10
7 5 3 1 0 2 4
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _09_SortInSpecificOrder {

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
			sortInSpecificOrder(arr);
			System.out.println();
		}
		scanner.close();
	}

	private static void sortInSpecificOrder(int[] arr) {
		Arrays.sort(arr);
		int f = 0, l = arr.length - 1;
		int[] newArr = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] % 2 == 0) {
				newArr[l] = arr[i];
				l--;
			} else {
				newArr[f] = arr[i];
				f++;
			}
		}
		for (int j = 0; j < newArr.length; j++) {
			System.out.print(newArr[j] + " ");
		}
	}
}
