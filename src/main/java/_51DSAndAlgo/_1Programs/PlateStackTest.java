package _51DSAndAlgo._1Programs;

import java.util.Scanner;

public class PlateStackTest {
	public static void main(String[] args) {
		int capacity = 10;
		int number = 0;
		NumberStack numberStack = NumberStack.createStack(capacity);
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Show Stack");
			System.out.println("4. Is Stack Empty");
			System.out.println("5. Is Stack Full");
			System.out.println("6. Exit");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please Enter a number: ");
				number = scanner.nextInt();
				numberStack.push(number);
				break;
			case 2:
				int popedNumber = numberStack.pop();
				System.out.println("Poped Number: " + popedNumber);
				break;
			case 3:
				System.out.println("List of Numbers in stack: ");
				numberStack.showStack();
				break;
			case 4:
				if (numberStack.isEmpty()) {
					System.out.println("Yes, stack is empty.");
				} else {
					System.out.println("No, stack is not empty.");
				}
				break;
			case 5:
				if (numberStack.isFull()) {
					System.out.println("Yes, stack is full.");
				} else {
					System.out.println("No, stack is not full.");
				}
				break;
			case 6:
				System.out.println("Exit");
				flag = false;
			default:
				System.out.println("Please enter a valid choice.");
			}
		}
		System.out.println("Thank you! Stack operations has been completed.");
		System.out.println("Now we will see other operations.");
		scanner.close();
	}
}

class NumberStack {
	private int top;
	private int capacity;
	private int[] numberArray;

	private NumberStack(int capacity) {
		this.top = -1;
		this.capacity = capacity;
		this.numberArray = new int[capacity];
	}

	public static NumberStack createStack(int capacity) {
		return new NumberStack(capacity);
	}

	public void showStack() {// 1
		for (int i = top; i >= 0; i--) {
			System.out.println(numberArray[i]);
		}
	}

	public void push(int number) {// 2
		if (this.isFull()) {
			System.out.println("Stack is full");
			return;
		}
		// top++;
		numberArray[++top] = number;
	}

	public int pop() {// 3
		int topNumber;
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		topNumber = numberArray[top--];
		// top = top - 1;
		return topNumber;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == capacity - 1) {
			return true;
		}
		return false;
	}

	public int getTop() {
		return top;
	}

	public int getCapacity() {
		return capacity;
	}

	public int[] getNumberArray() {
		return numberArray;
	}

}