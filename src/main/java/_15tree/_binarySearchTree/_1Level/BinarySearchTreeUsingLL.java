package _15tree._binarySearchTree._1Level;

public class BinarySearchTreeUsingLL {

	private DNode root;

	public BinarySearchTreeUsingLL() {
		super();
	}

	public DNode getRoot() {
		return root;
	}

	public void setRoot(DNode root) {
		this.root = root;
	}

	// 20
	// 100 3
	// 50 15 250 35
	// 222
	public void createDummyBinaryTree() {
		root = new DNode(null, 100, null);
		DNode node80 = new DNode(null, 80, null);
		DNode node200 = new DNode(null, 200, null);
		DNode node70 = new DNode(null, 70, null);
		DNode node90 = new DNode(null, 90, null);
		DNode node150 = new DNode(null, 150, null);
		DNode node300 = new DNode(null, 300, null);
		DNode node50 = new DNode(null, 50, null);

		DNode node250 = new DNode(null, 250, null);
		DNode node400 = new DNode(null, 400, null);
		DNode node40 = new DNode(null, 40, null);
		DNode node60 = new DNode(null, 60, null);

		root.setPrev(node80);
		root.setNext(node200);

		node80.setPrev(node70);
		node80.setNext(node90);

		node200.setPrev(node150);
		node200.setNext(node300);

		node70.setPrev(node50);

		node300.setPrev(node250);
		node300.setNext(node400);

		node50.setPrev(node40);
		node50.setNext(node60);

	}

	public void preOrderTraversal(DNode root) {
		if (root == null) {
			// System.out.print(root+"\t");
			return;
		}
		System.out.print(root + "\t");
		preOrderTraversal(root.getPrev());
		preOrderTraversal(root.getNext());
	}

	public void inOrderTraversal(DNode root) {
		if (root == null) {
			// System.out.print(root+"\t");
			return;
		}
		inOrderTraversal(root.getPrev());
		System.out.print(root + "\t");
		inOrderTraversal(root.getNext());
	}

	public void postOrderTraversal(DNode root) {
		if (root == null) {
			// System.out.print(root+"\t");
			return;
		}
		postOrderTraversal(root.getPrev());
		postOrderTraversal(root.getNext());
		System.out.print(root + "\t");
	}

	// 20,100,3,50, 15, 250, 35,222
	public void levelOrderTraversal() {
		if (root == null) {
			// System.out.print(root+"\t");
			return;
		}
		QueueUsingLL queue = new QueueUsingLL();
		queue.enQueue(root);
		while (!queue.isEmpty()) {
			DNode node = queue.deQueue();
			if (node != null && node.getPrev() != null)
				queue.enQueue(node.getPrev());
			if (node != null && node.getNext() != null)
				queue.enQueue(node.getNext());
			// queue.deQueue();
			System.out.print(node.getData() + "\t");
		}
	}

	// perfect tree shhhape?????????
	public void traverse() {
		if (root == null) {
			System.out.println("BST is empty.");
			//System.out.print(root + "\t");
			return;
		}
		QueueUsingLL queue = new QueueUsingLL();
		queue.enQueue(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				DNode node = queue.deQueue();
				if (node != null && node.getPrev() != null)
					queue.enQueue(node.getPrev());
				if (node != null && node.getNext() != null)
					queue.enQueue(node.getNext());
				// queue.deQueue();
				System.out.print(node.getData() + "\t");
			}
			System.out.println("");
		}

	}

	private void searchValue(DNode root, int data) {
		if (root == null) {
			return;
		}
		if (root.getData() == data) {
			System.out.println("Data Found " + root);
			return;
		} else if (root.getData() > data) {

			searchValue(root.getPrev(), data);
		} else if (root.getData() < data) {

			searchValue(root.getNext(), data);
		}
		// System.out.println("Data not found.");
	}

	private DNode insertData(DNode currentNode, int data) {
		if (currentNode == null) {
			currentNode = new DNode(null, data, null);
		} else if (data <= currentNode.getData()) {
			currentNode.setPrev(insertData(currentNode.getPrev(), data));
		} else // if(data > currentNode.getData())
		{
			currentNode.setNext(insertData(currentNode.getNext(), data));
		}
		return currentNode;
	}

	private void deleteData(int data) {
		if (root == null) {
			System.out.println("Tree is null.");
			return;
		}
		DNode deletedNode = this.getDeletedNode(data);
		if (deletedNode == null) {
			System.out.println("Data Not Found.");
			return;
		}
		System.out.println("Data Found " + deletedNode);

		DNode deepestNode = this.getDeepestNode();
		System.out.println("deepestNode " + deepestNode);
		int levels = this.getHeight(this.root);
		deepestNode = this.getDeepestNode2(this.root, levels, this.root);
		System.out.println("deepestNode2 " + deepestNode);

		// ?????
		// deepestNode = this.getDeepestNode3(this.root);
		// System.out.println("deepestNode3 " + deepestNode);

		deepestNode = this.getDeepestNode4(this.root);
		System.out.println("deepestNode4 " + deepestNode);

		// this.deleteDeepestNode();

	}

	private DNode getDeepestNode4(DNode root) {
		DNode deepestNode = null;
		int levels = this.getHeight(this.root);
		System.out.println(levels);
		this.traverse();
		Boolean isFoundDeepestNode = new Boolean("false");
		deepestNode = find4(root, levels, 0, false);
		return deepestNode;
	}

	boolean isFoundDeepestNodeFlag = false;

	private DNode find4(DNode root, int height, int currentLevel, Boolean isFoundDeepestNode) {
		DNode deepestNode = null;
		System.out.println(root + " " + height + " " + currentLevel + "" + isFoundDeepestNode);
		if (root == null)
			return null;
		if (height == currentLevel + 1 && isFoundDeepestNodeFlag == false) {
			System.out.println("Yoo" + root + "\t");
			deepestNode = root;
			isFoundDeepestNodeFlag = true;
			return deepestNode;
		}
		deepestNode = find4(root.getNext(), height, currentLevel + 1, isFoundDeepestNode);
		deepestNode = find4(root.getPrev(), height, currentLevel + 1, isFoundDeepestNode);
		return deepestNode;
	}

	// ??????
	private void deleteDeepestNode() {
		DNode deepestNode = null;
		QueueUsingLL queue = new QueueUsingLL();
		queue.enQueue(root);
		while (!queue.isEmpty()) {
			DNode node = queue.deQueue();
			deepestNode = node;
			System.out.println(deepestNode);
			if (node != null) {
				if (node.getPrev() == null || node.getNext() == null) {
					break;
				}
				if (node.getPrev() != null)
					queue.enQueue(node.getPrev());
				if (node.getNext() != null)
					queue.enQueue(node.getNext());
			}
		}
	}

	// maxLevel : keeps track of maximum level seen so far.
	// res : Value of deepest node so far.
	// level : Level of root
	static void find(DNode root, Integer level, DNode deepestNode, Integer maxLevel) {
		System.out.println(root + " " + level + " " + deepestNode + " " + maxLevel);
		if (root != null) {
			find(root.getPrev(), ++level, deepestNode, maxLevel);
			if (level > maxLevel) {
				deepestNode = root;
				maxLevel = level;
				System.out.println(maxLevel);
			}
			if (root.getNext() != null)
				find(root.getNext(), level, deepestNode, maxLevel);
		}
	}

	private DNode getDeepestNode3(DNode root) {
		// Initialze result and max level
		DNode deepestNode = root;
		Integer maxLevel = -1;
		// Updates value "res" and "maxLevel"
		// Note that res and maxLen are passed
		// by reference.
		find(root, 0, deepestNode, maxLevel);
		System.out.println(deepestNode + " | " + maxLevel);
		return deepestNode;

	}

	private DNode getDeepestNode2(DNode root, int levels, DNode currentDeepestNode) {
		DNode deepestNode = currentDeepestNode;
		if (root == null) {
			return null;
		}
		if (levels == 1) {
			if (root != null) {
				deepestNode = root;
			}
		} else if (levels > 1) {
			if (root.getPrev() != null)
				deepestNode = getDeepestNode2(root.getPrev(), levels - 1, deepestNode);
			if (root.getNext() != null)
				deepestNode = getDeepestNode2(root.getNext(), levels - 1, deepestNode);
		}
		return deepestNode;
	}

	private DNode getDeepestNode() {
		DNode deepestNode = null;
		QueueUsingLL queue = new QueueUsingLL();
		queue.enQueue(root);
		while (!queue.isEmpty()) {
			DNode node = queue.deQueue();
			// System.out.println(node);
			if (node != null) {
				if (node.getPrev() != null)
					queue.enQueue(node.getPrev());
				if (node.getNext() != null)
					queue.enQueue(node.getNext());
			}
			deepestNode = node;
		}
		return deepestNode;
	}

	public DNode getDeletedNode(int data) {
		QueueUsingLL queue = new QueueUsingLL();
		queue.enQueue(root);
		DNode deletedNode = null;
		while (!queue.isEmpty()) {
			DNode node = queue.deQueue();
			if (node != null && node.getPrev() != null)
				queue.enQueue(node.getPrev());
			if (node != null && node.getNext() != null)
				queue.enQueue(node.getNext());
			if (node.getData() == data) {
				// System.out.println("Data Found " + node.getData());
				deletedNode = node;
				break;
			}
		}
		return deletedNode;
	}

	private void deleteTree() {
		root = null;
	}

	public int getHeight(DNode root) {
		if (root == null)
			return 0;
		int leftHt = getHeight(root.getPrev());
		int rightHt = getHeight(root.getNext());
		return Math.max(leftHt, rightHt) + 1;
	}

	public static void main(String[] args) {

		m1();
	}

	/**
	 * 
	 */
	private static void m1() {
		BinarySearchTreeUsingLL binaryTree = new BinarySearchTreeUsingLL();

		// binaryTree.insertData(111);
		binaryTree.traverse();
		System.out.println();
		binaryTree.createDummyBinaryTree();
		binaryTree.traverse();

		binaryTree.searchValue(binaryTree.getRoot(), 250);
		System.out.println();

		binaryTree.preOrderTraversal(binaryTree.getRoot());
		System.out.println();
		binaryTree.inOrderTraversal(binaryTree.getRoot());
		System.out.println();
		binaryTree.postOrderTraversal(binaryTree.getRoot());
		System.out.println();
		binaryTree.levelOrderTraversal();
		System.out.println();

		System.out.println("Height: " + binaryTree.getHeight(binaryTree.getRoot()));

		binaryTree.traverse();
		binaryTree.insertData(binaryTree.getRoot(), 85);
		System.out.println();
		binaryTree.traverse();

		binaryTree.insertData(binaryTree.getRoot(), 333);
		System.out.println();
		binaryTree.traverse();

		binaryTree.deleteData(50);
		binaryTree.traverse();
		System.out.println();

		binaryTree.deleteTree();
		binaryTree.traverse();
	}

}
