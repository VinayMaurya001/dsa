package _15tree._binaryTree._1Level;

import java.util.Arrays;

public class BinaryTreeUsingArray {

	private int[] arr;
	private int lastUsedIndex;

	public BinaryTreeUsingArray(int size) {
		super();
		arr = new int[size];
		lastUsedIndex = 0;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getLastUsedIndex() {
		return lastUsedIndex;
	}

	public void setLastUsedIndex(int lastUsedIndex) {
		this.lastUsedIndex = lastUsedIndex;
	}

	private void insertData(int data) {
		if (lastUsedIndex == arr.length - 1) {
			System.out.println("Binary Tree is full");
			return;
		}
		++lastUsedIndex;
		arr[lastUsedIndex] = data;
	}

	private void createDummyBinaryTree() {
		lastUsedIndex = 0;
		arr[++lastUsedIndex] = 20;
		arr[++lastUsedIndex] = 100;
		arr[++lastUsedIndex] = 3;
		arr[++lastUsedIndex] = 50;
		arr[++lastUsedIndex] = 15;
		arr[++lastUsedIndex] = 250;
		arr[++lastUsedIndex] = 35;
		arr[++lastUsedIndex] = 222;
	}

	// ?????
	private void traverse() {
		// System.out.println(Arrays.toString(arr));
		for (int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	private void searchValue(int data) {
		boolean isFound = false;
		int location = 1;
		for (int i = 1; i <= lastUsedIndex; i++) {
			if (arr[i] == data) {
				isFound = true;
				location = i;
				break;
			}
		}
		if (isFound)
			System.out.println(data + "found at location" + location);
		else
			System.out.println("Data not found");
	}

	private void inOrderTraversal(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		inOrderTraversal(index * 2);
		System.out.print(arr[index] + "\t");
		inOrderTraversal(index * 2 + 1);
	}

	private void preOrderTraversal(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + "\t");
		preOrderTraversal(index * 2);
		preOrderTraversal(index * 2 + 1);
	}

	private void postOrderTraversal(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		postOrderTraversal(index * 2);
		postOrderTraversal(index * 2 + 1);
		System.out.print(arr[index] + "\t");
	}

	private void levelOrderTraversal(int index) {
		for (int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

	private void deleteData(int data) {

		boolean isFound = false;
		int location = 1;
		for (int i = 1; i <= lastUsedIndex; i++) {
			if (arr[i] == data) {
				isFound = true;
				location = i;
				break;
			}
		}
		if (isFound) {
			arr[location] = arr[lastUsedIndex];
			lastUsedIndex--;
		} else {
			System.out.println("Data not found");
		}
	}

	private void deleteTree() {
		arr = null;	
	}

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		BinaryTreeUsingArray binaryTree = new BinaryTreeUsingArray(10);

		// binaryTree.insertData(111);
		// binaryTree.traverse();

		binaryTree.createDummyBinaryTree();
		binaryTree.traverse();

		// binaryTree.searchValue(250);

		// binaryTree.inOrderTraversal(1);
//		System.out.println();
//		binaryTree.preOrderTraversal(1);
//		System.out.println();
//		binaryTree.postOrderTraversal(1);
//		System.out.println();
//		binaryTree.levelOrderTraversal(1);
//		System.out.println();

		binaryTree.deleteData(3);
		binaryTree.traverse();

		// System.out.println("Height: " + binaryTree.getHeight(binaryTree.getRoot()));

		// binaryTree.insertData(333);
		// System.out.println();
		// binaryTree.traverse();

		binaryTree.deleteTree();
		binaryTree.traverse();

	}

}