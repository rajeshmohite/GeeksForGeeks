/*
Given an array, print reverse of it.

Input
1
4
1 2 3 4

Output:
4 3 2 1
 */
package Arrays;

import java.util.Scanner;

public class _05_ReverseAnArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while (t-- > 0) {
			int n = scanner.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			reverseAnArray(arr);
			System.out.println();
		}
		scanner.close();
	}

	private static void reverseAnArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
