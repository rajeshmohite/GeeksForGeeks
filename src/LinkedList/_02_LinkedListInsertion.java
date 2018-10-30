/*
Given a key (or data) to be inserted, your task is to complete the function insertAtBeginning() which inserts the data in front of the linked list and insertAtEnd() which appends the data at the end of the linked list.


Input:
The functions takes two arguments as Input, the reference pointer to the head of the linked list and the data variable (of type integer) that hold the data to be inserted in the list.
With each input there will be an extra boolean variable that chooses from where to insert the data.
0 - Insert at Beginning
1 - Insert at End

Input:
3
5
9 0 5 1 6 1 2 0 5 0
3
5 1 6 1 9 1
4
15 0 36 0 95 0 14 0

Output:
5 2 9 5 6
5 6 9
14 95 36 15
 */
package LinkedList;

import java.util.Scanner;

public class _02_LinkedListInsertion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			Node head = null;
			for (int i = 0; i < n; i++) {
				int data = scanner.nextInt();
				int cond = scanner.nextInt();
				if (cond == 0)
					head = insertAtBeginning(head, data);
				else
					head = insertAtEnd(head, data);
			}
			printList(head);
			System.out.println();
		}
		scanner.close();
	}

	public static Node insertAtBeginning(Node head1, int a1) {
		Node newNode = new Node(a1);
		if (head1 != null) {
			newNode.next = head1;
			head1 = newNode;
		} else {
			head1 = newNode;
		}
		return head1;
	}

	public static Node insertAtEnd(Node head1, int a1) {
		Node newNode = new Node(a1);
		if (head1 != null) {
			Node ptr = head1;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = newNode;
		} else {
			head1 = newNode;
		}
		return head1;
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
