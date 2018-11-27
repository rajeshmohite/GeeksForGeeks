package BinarySearchTree;

public class BST {

	Node root;

	public BST() {
		this.root = null;
	}

	public static void main(String[] args) {
		BST bst = new BST();
		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		int arr[] = { 50, 30, 70, 20, 40, 60, 80, 90, 3 };

		for (int i : arr) {
			bst.insert(i);
		}

		bst.inorder(bst.root);
		bst.delete(70);
		System.out.println();
		bst.inorder(bst.root);

	}

	private void delete(int key) {
		root = deleteRec(root, key);
	}

	private Node deleteRec(Node root, int key) {
		if (root == null) {
			return root;
		}

		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			root.key = minVal(root.right);
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}

	private int minVal(Node root) {
		int minVal = root.key;
		while (root.left != null) {
			minVal = root.left.key;
			root = root.left;
		}
		return minVal;
	}

	private void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	private void insert(int key) {
		root = insetRec(root, key);
	}

	private Node insetRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key)
			root.left = insetRec(root.left, key);
		else if (key > root.key)
			root.right = insetRec(root.right, key);
		return root;
	}

}
