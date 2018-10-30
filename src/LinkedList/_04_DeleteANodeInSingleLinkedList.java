/*
Delete xth node from a single linked list. Your task is to complete the method deleteNode which takes two arguments:  the address of the head of the linked list and an integer x. The function returns the head of the  modified linked list.

Input:
2
3                       
1 3 4               
3                       
4
1 5 2 9                    
2

Output:
1 3           
1 2 9
 */
package LinkedList;

import java.util.Scanner;

public class _04_DeleteANodeInSingleLinkedList {

	Node head = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			_04_DeleteANodeInSingleLinkedList llist = new _04_DeleteANodeInSingleLinkedList();
			int a = scanner.nextInt();
			Node node = new Node(a);
			llist.insertAtEnd(node);
			for (int i = 1; i < n; i++) {
				int b = scanner.nextInt();
				llist.insertAtEnd(new Node(b));
			}
			int x = scanner.nextInt();
			Node nodeAfterDelete = deleteANodeInSingleLinkedList(llist.head, x);
			printList(nodeAfterDelete);
			System.out.println();
		}
		scanner.close();
	}

	public static Node deleteANodeInSingleLinkedList(Node head, int n) {
		Node ptr = head;
		if (n == 1) {
			head = ptr.next;
			ptr = null;
		} else {
			while (n > 2) {
				ptr = ptr.next;
				n--;
			}
			ptr.next = ptr.next.next;
		}
		return head;
	}

	static void printList(Node head) {
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
