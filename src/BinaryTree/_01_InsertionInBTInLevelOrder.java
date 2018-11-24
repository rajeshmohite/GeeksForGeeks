/*
 * Given a binary tree and a key, insert the key into the binary tree at first position available in level order.
 */
package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class _01_InsertionInBTInLevelOrder {

	static Node root;

	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.println("Level Order traversal before insertion:");
		printLevelOrder(root);

		int key = 5;
		insert(root, key);

		System.out.println("\nLevel Order traversal after insertion:");
		printLevelOrder(root);
	}

	/* function to insert element in binary tree */
	private static void insert(Node temp, int data) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		// Do level order traversal until we find an empty place

		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new Node(data);
				break;
			} else {
				q.add(temp.left);
			}

			if (temp.right == null) {
				temp.right = new Node(data);
				break;
			} else
				q.add(temp.right);
		}
	}

	/* function to print level order traversal of tree */
	public static void printLevelOrder(Node root) {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	static int height(Node root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	/* Print nodes at the given level */
	static void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

}
