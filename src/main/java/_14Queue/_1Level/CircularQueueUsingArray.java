package _14Queue._1Level;

import java.util.Arrays;

public class CircularQueueUsingArray {

	private int[] queue;
	private int front;
	private int rear;

	public CircularQueueUsingArray(int size) {
		super();
		this.queue = new int[size];
		this.front = -1;
		this.rear = -1;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int size() {
		if (queue == null) {
			return -1;
		} else {
			return queue.length;
		}
	}

	public void traverse() {
		if (isEmpty()) {
			return;
		}
		if (front <= rear) {
			for (int i = front; i <= rear; i++) {
				if (queue != null) {
					System.out.println("F" + front + "[" + queue[i] + "]R" + rear);
				}
			}
		} else {
			for (int i = front; i <= queue.length - 1; i++) {
				if (queue != null) {
					System.out.println("F" + front + "[" + queue[i] + "]R" + rear);
				}
			}
			for (int i = 0; i <= rear; i++) {
				if (queue != null) {
					System.out.println("F" + front + "[" + queue[i] + "]R" + rear);
				}
			}
		}

	}

	public int noOflements() {
		int noOflements = 0;
		if (front == -1 || queue == null) {
			return noOflements;
		}
		for (int i = front; i <= queue.length - 1; i++) {
			noOflements++;
		}
		for (int i = 0; i <= rear; i++) {
			noOflements++;
		}
		return noOflements;
	}

	public void enQueue(int data) {
		System.out.println("Enqueing:" + data);
		if (isFull()) {
			System.out.println("Queue is full.");
		} else {
			if (rear == queue.length - 1) {
				rear = 0;
			} else {
				rear++;
			}
			if (front == -1) {
				front = 0;
			}
			queue[rear] = data;
		}
	}

	public boolean isFull() {
		if (rear == queue.length - 1 || rear == front + 1 || front == rear + 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (queue == null || front == -1 || front > rear) {
			System.out.println("Queue is empty.");
			return true;
		}
		return false;
	}

	public int deQueue() {
		System.out.print("Dequeing...  ");
		if (isEmpty()) {
			front = -1;
			rear = -1;
			return -1;
		} else {
			int deQueueElement = queue[front];
			if (front == rear) {// there is only one element in queue
				front = -1;
				rear = -1;
			} else if (front == queue.length - 1) {
				front = 0;
			} else {
				front++;
			}
			return deQueueElement;
		}
	}

	public int peek() {
		System.out.print("Returning peek.... ");
		if (isEmpty()) {
			front = -1;
			rear = -1;
			return -1;
		} else {
			return queue[front];
		}
	}

	public void deleteQueue() {
		System.out.println("Deleting queue.");
		queue = null;
	}


	public static void main(String[] args) {

		m1();
	}

	private static void m1() {

		CircularQueueUsingArray queue = new CircularQueueUsingArray(4);
		System.out.println("F" + queue.getFront() + Arrays.toString(queue.getQueue()) + "R" + queue.getRear());
//		queue.traverse();

		System.out.println("Size " + queue.getQueue().length);
		System.out.println("Size " + queue.size());
//		System.out.println("noOflements " + queue.noOflements());

		queue.enQueue(10);
		System.out.println("F" + queue.getFront() + Arrays.toString(queue.getQueue()) + "R" + queue.getRear());
		queue.traverse();

		System.out.println(queue.deQueue());
		System.out.println("F" + queue.getFront() + Arrays.toString(queue.getQueue()) + "R" + queue.getRear());
		queue.traverse();

		System.out.println("Peek: "+queue.peek());
		queue.traverse();

		queue.enQueue(10);
		System.out.println("F" + queue.getFront() + Arrays.toString(queue.getQueue()) + "R" + queue.getRear());
		queue.traverse();
		System.out.println(queue.peek());
		queue.traverse();

		System.out.println(queue.isEmpty());
		queue.traverse();

		System.out.println(queue.isFull());
		queue.traverse();

		System.out.println("Size " + queue.getQueue().length);
		System.out.println("Size " + queue.size());
		System.out.println("noOflements " + queue.noOflements());

	//	queue.deleteQueue();
		queue.traverse();

		System.out.println("Size " + queue.size());
		System.out.println("noOflements " + queue.noOflements());
	}

}