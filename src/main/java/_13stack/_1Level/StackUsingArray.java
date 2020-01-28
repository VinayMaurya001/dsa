package _13stack._1Level;

import java.util.Arrays;

public class StackUsingArray {

	private int[] stack;
	private int top;

	public StackUsingArray(int size) {
		super();
		this.stack = new int[size];
		this.top = -1;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void traverse() {
		// System.out.println(Arrays.toString(stack));
		if (top == -1) {
			System.out.println("Stack is Empty.");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}

	public void push(int data) {
		if (stack.length - 1 == top) {
			System.out.println("Stack is Full.");
		} else {
			top++;
			stack[top] = data;
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is Empty.");
			return Integer.MIN_VALUE;
		} else {
			return stack[top--];
		}

	}

	public int peek() {
		if (top == -1) {
			System.out.print("Stack is Empty. ");
			return Integer.MIN_VALUE;
		} else {
			return stack[top];
		}

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (stack.length - 1 == top) {
			return true;
		} else {
			return false;
		}
	}

	public void deleteStack() {
		stack = null;
		top = -1;
	}

	public int noOflements() {
		int noOflements = 0;
		for (int i = 0; i <= top; i++) {
			noOflements++;
		}
		return noOflements;
	}

	public int size() {
		int size = 0;
		if (stack != null) {
			size = stack.length;
		}
		return size;
	}


	public static void main(String[] args) {

		m1();
	}

	private static void m1() {

		StackUsingArray stack = new StackUsingArray(10);
		stack.traverse();

		System.out.println("Size "+stack.getStack().length);
		System.out.println("Size "+stack.size());
		System.out.println("noOflements "+stack.noOflements());
		
		stack.push(10);
		stack.traverse();

		System.out.println("Size "+stack.getStack().length);
		System.out.println("Size "+stack.size());
		System.out.println("noOflements "+stack.noOflements());
		
		System.out.println(stack.pop());
		stack.traverse();

		System.out.println(stack.peek());
		stack.traverse();

		System.out.println(stack.isEmpty());
		stack.traverse();

		System.out.println(stack.isFull());
		stack.traverse();

		System.out.println("Size "+stack.getStack().length);
		System.out.println("Size "+stack.size());
		System.out.println("noOflements "+stack.noOflements());
		
		stack.deleteStack();
		stack.traverse();
		
		System.out.println("Size "+stack.size());
		System.out.println("noOflements "+stack.noOflements());

	}

}
