/*
Given an array of penalties P, an array of car numbers C, and also the date D. The task is to find the total fine which will be collected on the given date. Fine is collected from odd-numbered cars on even dates and vice versa.

Input:
2
4 12
2375 7682 2325 2352
250 500 350 200
3 8
2222 2223 2224
200 300 400

Output:
600
300
 */
package Arrays;

import java.util.Scanner;

public class _12_FindTheFine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int d = scanner.nextInt();
			int[] cars = new int[n];
			int[] penalties = new int[n];
			for (int i = 0; i < cars.length; i++) {
				cars[i] = scanner.nextInt();
			}
			for (int i = 0; i < penalties.length; i++) {
				penalties[i] = scanner.nextInt();
			}
			findTheFine(n, d, cars, penalties);
		}
		scanner.close();
	}

	private static void findTheFine(int n, int d, int[] cars, int[] penalties) {
		int fine = 0;
		if (d % 2 == 0) {
			for (int i = 0; i < cars.length; i++) {
				if (!(cars[i] % 2 == 0))
					fine = fine + penalties[i];
			}
		} else {
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] % 2 == 0)
					fine = fine + penalties[i];
			}
		}
		System.out.println(fine);
	}
}
