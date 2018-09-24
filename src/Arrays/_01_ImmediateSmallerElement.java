/*
Given an integer array, for each element in the array check whether there exist a smaller element on the next immediate position of the array.
If it exist print the smaller element. If there is no smaller element on the immediate next to the element then print -1.

Input
2
5
4 2 1 5 3
6
5 6 2 3 1 7

Output
2 1 -1 3 -1
-1 2 -1 1 -1 -1
 */
package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_ImmediateSmallerElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t, n;
		t = scanner.nextInt();
		for (int j = 0; j < t; j++) {
			ArrayList<Integer> list = new ArrayList<>();
			n = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				list.add(scanner.nextInt());
			}
			immediateSmallerElement(list);
		}
		scanner.close();
	}

	private static void immediateSmallerElement(ArrayList<Integer> list) {
		for (int k = 0; k < list.size(); k++) {
			if (k != list.size() - 1 && list.get(k) > list.get(k + 1))
				System.out.print(list.get(k + 1) + " ");
			else
				System.out.print("-1 ");
		}
	}
}
