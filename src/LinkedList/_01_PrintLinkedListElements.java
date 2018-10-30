/*
You are given the pointer to the head node of a linked list. You have to print all of its elements in order in a single line.

Input
2
2
1 2
1
4

Output
1 2
4
 */
package LinkedList;

import java.util.Scanner;

public class _01_PrintLinkedListElements {

	Node head;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			_01_PrintLinkedListElements llist = new _01_PrintLinkedListElements();

			for (int i = 0; i < n; i++) {
				llist.insertAtEnd(new Node(scanner.nextInt()));
			}
			llist.printList(llist.head);
			System.out.println();
		}
		scanner.close();

	}

	public void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public void insertAtEnd(Node node) {
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

}
