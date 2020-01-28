package _12Linkedlist._1Level;

public class CircularSingleLinkedList {
	private Node head = null;
	private Node tail = null;

	public CircularSingleLinkedList() {
		super();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void createCircularSingleLinkedListWithOneElement(int data) {
		Node newNode = new Node(data, null);
		this.head = newNode;
		this.tail = newNode;
		newNode.setNext(newNode);
	}

	public void insertAtStart(int data) {
		Node newNode = new Node(data, null);
		if (this.head == null) {
			this.tail = newNode;
			newNode.setNext(newNode);
		} else {
			newNode.setNext(this.head);
			this.tail.setNext(newNode);
		}
		this.head = newNode;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data, null);
		if (this.tail == null || this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			newNode.setNext(this.head);
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
			newNode.setNext(this.head);
		}
	}

	public void insertAtSpecifiedLocation(int data, int location) {
		if (location == 0) {
			insertAtStart(data);
		} else if (location == this.getLength()) {
			insertAtEnd(data);
		} else {
			Node newNode = new Node(data, null);
			Node tempHead = this.head;
			for (int i = 1; i <= location - 1; i++) {
				tempHead = tempHead.getNext();
			}
			newNode.setNext(tempHead.getNext());
			tempHead.setNext(newNode);
		}
	}

	public void traverseCircularSingleLinkedList() {
		if (head == null) {
			System.err.println("Linked List is Empty.");
		} else {
			System.out.print("H" + head.getData() + "\t");
			Node tempHead = this.head;
			do {
				System.out.print(tempHead.getData() + "\t");
				tempHead = tempHead.getNext();
			} while (tempHead != tail);
			System.out.print("T" + tail.getData() + "\t");
			System.out.print("T" + tail.getNext().getData() + "\t");
			System.out.println();
		}
	}

	public int getLength() {
		int length = 1;
		if (this.head == null) {
			return 0;
		}
		Node tempHead = this.head;
		for (; tempHead != tail;) {
			tempHead = tempHead.getNext();
			length++;
		}
		return length;
	}

	public int searchElement(int data) {
		int location = 0;
		Node tempHead = head;
		for (; tempHead != tail;) {
			if (tempHead.getData() == data) {
				return location;
			}
			location++;
			tempHead = tempHead.getNext();
		}
		if (tail.getData() == data) {
			return location;
		}
		return -1;
	}

	public void deleteAtStart() {
		if (this.head == null) {
			System.out.println("Can't delete element because LinkedList is empty");
		} else if (this.head.getNext() == this.head) {
			System.out.println("Deleting only single element " + head.getData() + " at start");
			this.head = null;
			this.tail = null;
			// this.head.setNext(null);
		} else {
			System.out.println("Deleting single element " + head.getData() + " at start");
			Node tempHead = this.head.getNext();
			this.head.setNext(null);
			this.head = tempHead;
			this.tail.setNext(tempHead);
		}
	}

	public void deleteAtEnd() {
		if (this.head == null) {
			System.out.println("Can't delete element because LinkedList is empty");
		} else if (this.head.getNext() == this.head) {
			System.out.println("Deleting single element " + tail.getData() + " at end");
			this.head = null;
			this.tail = null;
		} else {
			System.out.println("Deleting single element " + tail.getData() + " at end");
			Node tempHead = this.head;
			for (; tempHead.getNext() != this.tail;) {
				tempHead = tempHead.getNext();
			}
			this.tail.setNext(null);
			tempHead.setNext(this.head);
			this.tail = tempHead;
		}
	}

	public void deleteAtSpecifiedLocation(int location) {
		if (this.head == null) {
			System.out.println("Can't delete element because LinkedList is empty");
		}
		if (location < 0) {
			System.out.println("Invalid location of element");
		} else if (location == 1) {
			deleteAtStart();
		} else if (location == this.getLength()) {
			deleteAtEnd();
		} else {
			Node temp = this.head;
			for (int i = 1; i < location-1; i++) {
				temp = temp.getNext();
			}
			Node deletedNode = temp.getNext();
			temp.setNext(deletedNode.getNext());
			deletedNode.setNext(null);
		}
	}

	//Node 1 will delete after then only node 2 will be deleted & so on...
	public void deleteEntireLinkedList() {
		this.head = null;
		this.tail = null;
		this.tail.setNext(null);
		
	}

}
