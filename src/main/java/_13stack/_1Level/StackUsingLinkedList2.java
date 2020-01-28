package _13stack._1Level;

import _12Linkedlist._1Level.Node;
import _12Linkedlist._1Level.SingleLinkedList;

public class StackUsingLinkedList2 {

	SingleLinkedList singleLinkedList = null;

	public StackUsingLinkedList2() {
		super();
		this.singleLinkedList = new SingleLinkedList();
	}

	public SingleLinkedList getSingleLinkedList() {
		return singleLinkedList;
	}

	public void setSingleLinkedList(SingleLinkedList singleLinkedList) {
		this.singleLinkedList = singleLinkedList;
	}

	Node top;

	public void createStackWithOneElement(int data) {
		singleLinkedList.createSingleLinkedListWithOneElement(data);
	}

	public void traverse() {
		if (this.singleLinkedList == null || singleLinkedList.getHead() == null) {
			System.out.println("Stack is Empty.");
		} else {
			singleLinkedList.traverseSingleLinkedList();
		}
	}

	public void push(int data) {
		singleLinkedList.insertAtStart(data);
	}

	public int pop() {
		if (this.singleLinkedList == null || singleLinkedList.getHead() == null) {
			System.out.println("Stack is Empty.");
		} else {
			int topData = singleLinkedList.getHead().getData();
			singleLinkedList.deleteAtStart();
			return topData;
		}
		return Integer.MIN_VALUE;
	}

	public int peek() {
		if (this.singleLinkedList == null || singleLinkedList.getHead() == null) {
			System.out.println("Stack is Empty.");
		} else {
			return singleLinkedList.getHead().getData();
		}
		return Integer.MIN_VALUE;
	}

	public boolean isEmpty() {
		return this.singleLinkedList == null || singleLinkedList.getHead() == null;
	}

	// StackUsingLinkedList will never be full.
	public boolean isFull() {
		return false;
	}

	public void deleteStack() {
		this.singleLinkedList = null;
	}

	// same is size
//	public int noOflements() {
//	}

	public int size() {
		int size = 0;
		if (singleLinkedList != null) {
			size = singleLinkedList.getLength();
		}
		return size;
	}


	public static void main(String[] args) {

		m2();
	}

	private static void m2() {
		StackUsingLinkedList2 stack = new StackUsingLinkedList2();
		//System.out.println(stack.isEmpty());
		stack.traverse();
		
		stack.createStackWithOneElement(10);
		System.out.println(stack.isEmpty());
		stack.traverse();

		stack.push(20);
		stack.traverse();

		stack.push(30);
		stack.traverse();

		System.out.println(stack.pop());
		stack.traverse();

		System.out.println(stack.peek());
		stack.traverse();

		System.out.println(stack.isEmpty());
		stack.traverse();

		System.out.println(stack.isFull());
		stack.traverse();

		System.out.println(stack.size());
		stack.traverse();

		stack.deleteStack();
		stack.traverse();
	}

	

}
