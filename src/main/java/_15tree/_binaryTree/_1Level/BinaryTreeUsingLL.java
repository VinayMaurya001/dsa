package _15tree._binaryTree._1Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeUsingLL {

	private DNode root;

	public BinaryTreeUsingLL() {
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
		root = new DNode(null, 20, null);
		DNode node100 = new DNode(null, 100, null);
		DNode node3 = new DNode(null, 3, null);
		DNode node50 = new DNode(null, 50, null);
		DNode node15 = new DNode(null, 15, null);
		DNode node250 = new DNode(null, 250, null);
		DNode node35 = new DNode(null, 35, null);
		DNode node222 = new DNode(null, 222, null);
		DNode node333 = new DNode(null, 333, null);
		DNode node444 = new DNode(null, 444, null);
		DNode node555 = new DNode(null, 555, null);

		root.setPrev(node100);
		root.setNext(node3);

		node100.setPrev(node50);
		node100.setNext(node15);

		node3.setPrev(node250);
		node3.setNext(node35);

		node50.setPrev(node222);

		node50.setNext(node333);
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
			System.out.print(node.getData() + "\t");
		}
	}

	public void traverse() {
		if (root == null) {
			System.out.print(root + "\t");
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

	// perfect tree shhhape?????????
	public void traverseInPerfectShape() {
		int levels = this.getHeight(this.root);
		QueueUsingLL queue = new QueueUsingLL();
		queue.enQueue(root);
		while (!queue.isEmpty()) {
			for (int i = 1; i < levels; i++) {
				System.out.print("\t\t");
			}

			int size = queue.size();
			// System.out.println("size"+size);
			while (size-- > 0) {
				DNode node = queue.deQueue();
				if (node != null && node.getPrev() != null) {
					queue.enQueue(node.getPrev());
				}
				if (node != null && node.getNext() != null) {
					queue.enQueue(node.getNext());
				}
				System.out.print(node.getData() + "\t");
			}
			levels--;
			System.out.println("");
		}

	}

	public void traverseInPerfectShape2() {
		printNode(root);
	}

	public void printNode(DNode root) {
		int maxLevel = maxLevel(root);

		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	private static <T extends Comparable<?>> int maxLevel(DNode node) {
		if (node == null)
			return 0;

		return Math.max(maxLevel(node.getPrev()), maxLevel(node.getNext())) + 1;
	}

	private static <T> boolean isAllElementsNull(List<T> list) {
		for (Object object : list) {
			if (object != null)
				return false;
		}

		return true;
	}

	private static <T extends Comparable<?>> void printNodeInternal(List<DNode> nodes, int level, int maxLevel) {
		if (nodes.isEmpty() || isAllElementsNull(nodes))
			return;

		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		printWhitespaces(firstSpaces);

		List<DNode> newNodes = new ArrayList<DNode>();
		for (DNode node : nodes) {
			if (node != null) {
				System.out.print(node.getData());
				newNodes.add(node.getPrev());
				newNodes.add(node.getNext());
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print(" ");
			}
			printWhitespaces(betweenSpaces);
		}
		System.out.println("");
		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < nodes.size(); j++) {
				printWhitespaces(firstSpaces - i);
				if (nodes.get(j) == null) {
					printWhitespaces(endgeLines + endgeLines + i + 1);
					continue;
				}

				if (nodes.get(j).getPrev() != null)
					System.out.print("/");
				else
					printWhitespaces(1);

				printWhitespaces(i + i - 1);
				if (nodes.get(j).getNext() != null)
					System.out.print("\\");
				else
					printWhitespaces(1);
				printWhitespaces(endgeLines + endgeLines - i);
			}
			System.out.println("");
		}
		printNodeInternal(newNodes, level + 1, maxLevel);
	}

	private void searchValue(int data) {
		if (root == null) {
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
			if (node.getData() == data) {
				System.out.println("Data Found " + node.getData());
				return;
			}
		}
		System.out.println("Data not found.");
	}

	private void insertData(int data) {
		if (root == null) {
			root = new DNode(null, data, null);
			return;
		}
		QueueUsingLL queue = new QueueUsingLL();
		queue.enQueue(root);
		while (!queue.isEmpty()) {
			DNode node = queue.deQueue();
			
			if (node != null) {
				
				if (node.getPrev() != null) {
					queue.enQueue(node.getPrev());
				} else {
					node.setPrev(new DNode(null, data, null));
					break;
				}
				if (node.getNext() != null) {
					queue.enQueue(node.getNext());
				} else {
					node.setNext(new DNode(null, data, null));
					break;
				}
				// System.out.print(node.getData() + "\t");
			}

		}

	}

	// ???????????
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
		// System.out.println("deletedNode Data Found " + deletedNode);

		DNode deepestNode = null;
		// deepestNode = this.getDeepestNode();
		// System.out.println("deepestNode " + deepestNode);

		// int levels = this.getHeight(this.root);
		// System.out.println(levels);
		// deepestNode = this.getDeepestNode2(this.root, levels, this.root);
		// System.out.println("deepestNode2 " + deepestNode);

		// ?????
		deepestNode = this.getDeepestNode3(this.root);
		System.out.println("deepestNode3 " + deepestNode);

		// deepestNode = this.getDeepestNode4(this.root);
		// System.out.println("deepestNode4 " + deepestNode);

		// this.deleteDeepestNode();

	}

	private DNode getDeepestNode4(DNode root) {
		DNode deepestNode = null;
		int levels = this.getHeight(this.root);
		// Boolean isFoundDeepestNode = new Boolean("false");
		deepestNode = findDeepestNode4(root, levels, 0, false);
		return deepestNode;
	}

	boolean isFoundDeepestNodeFlag = false;

	private DNode findDeepestNode4(DNode root, int height, int currentLevel, Boolean isFoundDeepestNode) {
		DNode deepestNode = null;
		// System.out.println(root + " " + height + " " + currentLevel + "" +
		// isFoundDeepestNode);
		if (root == null)
			return null;
		if (height == currentLevel + 1 && isFoundDeepestNodeFlag == false) {
			// System.out.println("Yoo" + root + "\t");
			deepestNode = root;
			isFoundDeepestNodeFlag = true;
			return deepestNode;
		}
		if (!isFoundDeepestNodeFlag) {
			deepestNode = findDeepestNode4(root.getNext(), height, currentLevel + 1, isFoundDeepestNode);
		}
		if (!isFoundDeepestNodeFlag) {
			deepestNode = findDeepestNode4(root.getPrev(), height, currentLevel + 1, isFoundDeepestNode);
		}
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

	// level : Level of root
	static void findDeepestNode3(DNode root, Integer level, DNode deepestNode, Integer maxLevel) {
		System.out.println(root + " " + level + " " + deepestNode + " " + maxLevel);
		if (root != null) {
			if (level > maxLevel) {
				deepestNode = root;
				maxLevel = level;
				// System.out.println("maxLevel"+maxLevel);
			}
			++level;
			if (root.getPrev() != null) {
				findDeepestNode3(root.getPrev(), level, deepestNode, maxLevel);
			}
			if (root.getNext() != null) {
				findDeepestNode3(root.getNext(), level, deepestNode, maxLevel);
			}
		}
	}

	private DNode getDeepestNode3(DNode root) {
		DNode deepestNode = root;
		Integer maxLevel = -1;
		findDeepestNode3(root, 0, deepestNode, maxLevel);
		System.out.println(deepestNode + " | " + maxLevel);
		return deepestNode;
	}

	private DNode getDeepestNode2(DNode root, int levels, DNode currentDeepestNode) {
		DNode deepestNode = currentDeepestNode;
		// System.out.println("hi" + deepestNode);
		if (root == null) {
			return null;
		}
		if (levels == 1) {
			if (root != null) {
				deepestNode = root;
				// System.out.println("level1:" + deepestNode);
			}
		} else if (levels > 1) {
			if (root.getPrev() != null) {
				// System.out.println("1root.getPrev()" + root + deepestNode + levels);
				deepestNode = getDeepestNode2(root.getPrev(), levels - 1, deepestNode);
				// System.out.println("2root.getPrev()" + root + deepestNode + levels);
			}
			if (root.getNext() != null) {
				// System.out.println("3root.getNext()" + root + deepestNode + levels);
				deepestNode = getDeepestNode2(root.getNext(), levels - 1, deepestNode);
				// System.out.println("4root.getNext()" + root + deepestNode + levels);
			}

		}
		// System.out.println("bye" + deepestNode);
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

	private static void m1() {
		BinaryTreeUsingLL binaryTree = new BinaryTreeUsingLL();
		// binaryTree.insertData(111);
		// binaryTree.traverse();

		binaryTree.createDummyBinaryTree();
//		 binaryTree.preOrderTraversal(binaryTree.getRoot());
//		 System.out.println();
//		binaryTree.inOrderTraversal(binaryTree.getRoot());
//		 System.out.println();
//		 binaryTree.postOrderTraversal(binaryTree.getRoot());
//		 System.out.println();
		 binaryTree.levelOrderTraversal();
		 System.out.println();
		 binaryTree.traverse();
		// binaryTree.traverseInPerfectShape();
		// binaryTree.traverseInPerfectShape2();
		// System.out.println();

		// System.out.println("Height: " + binaryTree.getHeight(binaryTree.getRoot()));
		// binaryTree.searchValue(250);
		// System.out.println();

		 binaryTree.insertData(111);
		// System.out.println();
		// binaryTree.traverse();

		// binaryTree.insertData(333);
		// System.out.println();
		// binaryTree.traverse();

	//	binaryTree.traverseInPerfectShape2();
	//	binaryTree.deleteData(50);
		// binaryTree.traverseInPerfectShape2();
		// binaryTree.traverse();
		// System.out.println();

		// binaryTree.deleteTree();
		// binaryTree.traverse();
	}

}
