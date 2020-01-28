package _12Linkedlist._1Level;

public class DoubleLinkedList {
	private DNode head = null;
	private DNode tail = null;

	public DoubleLinkedList() {
		super();
	}

	public DNode getHead() {
		return head;
	}

	public void setHead(DNode head) {
		this.head = head;
	}

	public DNode getTail() {
		return tail;
	}

	public void setTail(DNode tail) {
		this.tail = tail;
	}

	public void traverseDoubleLinkedList() {
		if (head == null) {
			System.err.println("Linked List is Empty.");
		} else {
			DNode tempHead = this.head;
			for (; tempHead != null;) {
				System.out.print(tempHead + "\t");
				tempHead = tempHead.getNext();
			}
			System.out.println();
		}
	}

	public void reverseTraverseDoubleLinkedList() {
		if (head == null) {
			System.err.println("Linked List is Empty.");
		} else {
			DNode tempTail = this.tail;
			for (; tempTail != null;) {
				System.out.print(tempTail + "\t");
				tempTail = tempTail.getPrev();
			}
			System.out.println();
		}
	}

	public int getLength() {
		int length = 1;
		if (this.head == null) {
			return 0;
		}
		DNode tempHead = this.head;
		for (; tempHead != tail;) {
			tempHead = tempHead.getNext();
			length++;
		}
		return length;
	}

	public void deleteAtStart() {
		if (this.head == null) {
			System.out.println("Can't delete element because LinkedList is empty");
		} else if (this.head.getNext() == null) {
			System.out.println("Deleting single element " + head.getData() + " at start");
			this.head = null;
			this.tail = null;
		} else {
			System.out.println("Deleting single element " + head.getData() + " at start");
			DNode deletedNode = this.head;
			deletedNode.getNext().setPrev(null);
			this.head = deletedNode.getNext();
			deletedNode.setNext(null);
			deletedNode.setPrev(null);
		}

	}

	public void deleteAtEnd() {
		if (this.head == null) {
			System.out.println("Can't delete element because LinkedList is empty");
		} else if (this.head.getNext() == null) {
			System.out.println("Deleting single element " + tail.getData() + " at end");
			this.head = null;
			this.tail = null;
		} else {
			System.out.println("Deleting single element " + tail.getData() + " at end");
			DNode deletedNode = this.tail;
			this.tail = this.tail.getPrev();
			this.tail.setNext(null);
			deletedNode.setNext(null);
			deletedNode.setPrev(null);
		}
	}

	public void createDoubleLinkedListWithOneElement(int data) {
		DNode newNode = new DNode(null, data, null);
		this.head = newNode;
		this.tail = newNode;
	}

	public void insertAtStart(int data) {
		DNode newNode = new DNode(null, data, null);
		System.out.println("Inserting element " + data + " at start");
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.setNext(this.head);
			this.head.setPrev(newNode);
			this.head = newNode;
		}
	}

	public void insertAtEnd(int data) {
		System.out.println("Inserting element " + data + " at end");
		DNode newNode = new DNode(null, data, null);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.setPrev(this.tail);
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public int searchElement(int data) {
		int location = 0;
		DNode tempHead = head;
		for (; tempHead != null;) {
			if (tempHead.getData() == data) {
				return location;
			}
			location++;
			tempHead = tempHead.getNext();
		}
		return -1;
	}

	public void insertAtSpecifiedLocation(int data, int location) {
		if (location == 0) {
			insertAtStart(data);
		} else if (location == this.getLength()) {
			insertAtEnd(data);
		} else {
			System.out.println("Inserting element " + data + " at location " + location);
			DNode newNode = new DNode(null, data, null);
			DNode tempHead = this.head;
			for (int i = 1; i <= location - 1; i++) {
				tempHead = tempHead.getNext();
			}
			tempHead.getNext().setPrev(newNode);
			newNode.setNext(tempHead.getNext());
			newNode.setPrev(tempHead);
			tempHead.setNext(newNode);
		}
	}

	public void deleteAtSpecifiedLocation(int location) {
		if (this.head == null) {
			System.out.println("Can't delete element because LinkedList is empty");
		}
		if (location < 0) {
			System.out.println("Invalid location of element");
		} else if (location == 0) {
			deleteAtStart();
		} else if (location >= this.getLength() - 1) {
			deleteAtEnd();
		} else {
			System.out.println("Deleting element at location " + location);
			DNode temp = this.head;
			for (int i = 1; i <= location - 1; i++) {
				temp = temp.getNext();
			}
			DNode deletedNode = temp.getNext();
			deletedNode.getNext().setPrev(temp);
			temp.setNext(deletedNode.getNext());
			deletedNode.setNext(null);
			deletedNode.setPrev(null);
		}
	}

	public void deleteEntireLinkedList() {
		DNode tempHead = this.head;
		for (; tempHead != null;) {
			tempHead.setPrev(null);
			tempHead = tempHead.getNext();
		}
		this.head = null;
		this.tail = null;
	}

}
