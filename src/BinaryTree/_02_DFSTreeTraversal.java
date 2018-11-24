package BinaryTree;

public class _02_DFSTreeTraversal {
	Node root;

	public _02_DFSTreeTraversal() {
		super();
		this.root = null;
	}

	public static void main(String[] args) {
		_02_DFSTreeTraversal tree = new _02_DFSTreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder(tree.root);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder(tree.root);

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder(tree.root);

	}

	private void printPostorder(Node root) {
		if (root == null)
			return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data + " ");
	}

	private void printInorder(Node root) {
		if (root == null)
			return;
		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	}

	private void printPreorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		printPreorder(root.left);
		printPreorder(root.right);
	}

}
