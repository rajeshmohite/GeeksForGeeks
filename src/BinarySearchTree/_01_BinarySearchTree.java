package BinarySearchTree;

public class _01_BinarySearchTree {

	Node root;

	public _01_BinarySearchTree() {
		this.root = null;
	}

	public static void main(String[] args) {
		_01_BinarySearchTree tree = new _01_BinarySearchTree();
/* Let us create following BST 
        50 
     /     \ 
    30      70 
   /  \    /  \ 
  20   40  60   80 
*/
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder traversal of the given tree");
		tree.inorder(tree.root);

		System.out.println("\nDelete 20");
		tree.deleteKey(20);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder(tree.root);

		System.out.println("\nDelete 30");
		tree.deleteKey(30);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder(tree.root);

		System.out.println("\nDelete 50");
		tree.deleteKey(50);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder(tree.root);

	}

	private void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;
	}

	private void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	// This method mainly calls deleteRec()
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node deleteRec(Node root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.key = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.key);
		}

		return root;
	}

	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

}
