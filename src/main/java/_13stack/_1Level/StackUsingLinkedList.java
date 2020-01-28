package _13stack._1Level;

import _12Linkedlist._1Level.Node;

public class StackUsingLinkedList {

	private Node top = null;

	public StackUsingLinkedList() {
		super();
	}

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public void createStackWithOneElement(int data) {
		Node newNode = new Node(data, null);
		this.top = newNode;
	}

	public void traverse() {
		if (this.top == null) {
			System.out.println("Stack is Empty.");
		} else {
			Node tempTop = this.top;
			for (; tempTop != null;) {
				System.out.print(tempTop + " ");
				tempTop = tempTop.getNext();
			}
			System.out.println();
		}
	}

	public void push(int data) {
		Node newNode = new Node(data, null);
		newNode.setNext(this.top);
		this.top = newNode;
	}

	public int pop() {
		if (this.top == null) {
			System.out.println("Stack is Empty.");
		} else {
			Node deletedNode = this.top;
			this.top = deletedNode.getNext();
			deletedNode.setNext(null);
			return deletedNode.getData();
		}
		return Integer.MIN_VALUE;
	}

	public int peek() {
		if (this.top == null) {
			System.out.println("Stack is Empty.");
		} else {

			return this.top.getData();
		}
		return Integer.MIN_VALUE;
	}

	public boolean isEmpty() {
		return this.top == null;
	}

	// StackUsingLinkedList will never be full.
	public boolean isFull() {
		return false;
	}

	public void deleteStack() {
		this.top = null;
	}

	//same is size
//	public int noOflements() {
//	}

	public int size() {
		int size = 0;
		Node tempTop = this.top;
		for (; tempTop != null;) {
			size++;
			tempTop = tempTop.getNext();
		}
		return size;
	}


	public static void main(String[] args) {

		 m1();
		
	}

	

	private static void m1() {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		System.out.println(stack.isEmpty());
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
