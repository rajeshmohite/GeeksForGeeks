/*
Given an array of size N, rotate it by D elements. 

Input:
2
5
2
1 2 3 4 5 
10
3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6
 */
package Arrays;

import java.util.Scanner;

public class _03_RotateArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t, n, d;
		t = scanner.nextInt();
		while (t-- > 0) {
			n = scanner.nextInt();
			d = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}

			rotateArray(arr, d);
			System.out.println();
		}
		scanner.close();
	}

	private static void rotateArray(int[] arr, int d) {
		int mod = d % arr.length;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(i + mod) % arr.length] + " ");
		}
	}
}
