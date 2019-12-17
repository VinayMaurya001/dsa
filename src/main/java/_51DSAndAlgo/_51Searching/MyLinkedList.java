package _51DSAndAlgo._51Searching;

public class MyLinkedList {
	private Node head;

	public void display() {
		if (head == null) {
			System.out.println("LinkedList is empty.");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.getData() + "\t");
				temp = temp.getNext();
			}
		}
	}

	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	public void insertAtMiddle(int data, int position) {
		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 1; i < position-1; i++) {
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		// System.out.println(temp.getData());

	}

}
