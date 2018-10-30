/*
Given a linked list of size N, your task is to complete the function isLengthEvenOrOdd() which check whether the length of linked list is even or odd.

Input:
2
3
9 4 3
6
12 52 10 47 95 0

Output:
Odd
Even
 */
package LinkedList;

import java.util.Scanner;

public class _03_LinkedListLengthEvenOrOdd {

	Node head = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			_03_LinkedListLengthEvenOrOdd llist = new _03_LinkedListLengthEvenOrOdd();
			int a = scanner.nextInt();
			Node node = new Node(a);
			llist.insertAtEnd(node);
			for (int i = 1; i < n; i++) {
				int b = scanner.nextInt();
				llist.insertAtEnd(new Node(b));
			}
			// printList(llist.head);
			// System.out.println();
			if (isLengthEvenorOdd(llist.head) == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
		scanner.close();
	}

	static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	private void insertAtEnd(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = node;
		}
	}

	public static int isLengthEvenorOdd(Node head1) {
		int len = 0;
		while (head1 != null) {
			len++;
			head1 = head1.next;
		}
		if (len % 2 == 0)
			return 0;
		else
			return 1;
	}
}
