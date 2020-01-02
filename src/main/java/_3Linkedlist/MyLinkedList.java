package _3Linkedlist;

public class MyLinkedList {
	private Node head;

	public void insertAtEnd(int data) {
		if (this.head == null) {
			Node newNode = new Node();
			newNode.setData(data);
			newNode.setNext(null);
			this.head = newNode;
		} else {
			Node tempHead = this.head;
			while (tempHead.getNext() != null) {
				// System.out.println("inside " + tempHead.getData());
				tempHead = tempHead.getNext();
			}
			Node newNode = new Node();
			newNode.setData(data);
			newNode.setNext(null);
			tempHead.setNext(newNode);
		}
	}

	public void insertAtEnd2(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node tempHead = this.head;
			while (tempHead.getNext() != null) {
				// System.out.println("inside " + tempHead.getData());
				tempHead = tempHead.getNext();
			}
			tempHead.setNext(newNode);
		}
	}

	public void showLinkedList() {
		if (head == null) {
			System.out.println("Linked List is empty.");
			return;
		}
		Node tempHead = this.head;
		do {
			System.out.print(tempHead.getData() + "\t");
			tempHead = tempHead.getNext();
			if (tempHead == null || tempHead.getNext() == null) {
				if (tempHead != null) {
					System.out.println(tempHead.getData());
				}
				break;
			}
		} while (true);

	}

	public int lengthOfLinkedList() {
		int legth = 0;
		Node tempNode = this.head;
		for (; tempNode != null;) {
			tempNode = tempNode.getNext();
			legth++;
		}
		// System.out.println(count);
		return legth;
	}

	public int deleteFromMiddle(int index) {
		int deletedElement = 0;
		if (head == null) {
			deletedElement = -1;
			// return deletedElement;
		} else if (head.getNext() == null) {
			deletedElement = head.getData();
			head = null;
			// return deletedElement;
		} else {
			Node currentHead = this.head;
			Node previousHead = null;

			for (int i = 1; i < index - 1; i++) {
				currentHead = currentHead.getNext();
			}
			previousHead = currentHead;
			currentHead = currentHead.getNext();

			// previousHead = currentHead.getNext();
			previousHead.setNext(currentHead.getNext());

			deletedElement = currentHead.getData();
			currentHead.setNext(null);
		}
		return deletedElement;
	}

	public int deleteFromMiddle2(int data) {
		int index = 1;
		if (this.head == null) {
			index = -1;
		} else if (this.head.getNext() == null) {
			if (this.head.getData() == data) {
				this.head = null;
			} else {
				index = -1;
			}
		} else {
			Node previousNode = this.head;
			Node currentNode = previousNode.getNext();
			if (previousNode.getData() == data) {
				this.head = previousNode.getNext();
				previousNode.setNext(null);
			} else {
				for (; currentNode.getNext() != null;) {
					index++;
					if (data == currentNode.getData()) {
						break;
					}
					previousNode = previousNode.getNext();
					currentNode = currentNode.getNext();
				}
				if (currentNode.getData() == data) {
					index++;
					previousNode.setNext(currentNode.getNext());
					currentNode.setNext(null);
				} else {
					index = -1;
				}
			}
		}
		return index;
	}

	public void insertAtMiddle() {

	}

	public void insertAtStart(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		if (this.head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void deleteFromStart() {
		if (this.head != null) {
			Node tempHead = this.head;
			head = head.getNext();
			tempHead.setNext(null);
		}
	}

	public void deleteFromEnd() {
		if (head == null) {
			// System.out.println("Linked List is empty.");
			return;
		}
		Node previousNode = this.head;
		Node currentNode = previousNode.getNext();
		if (currentNode == null) {
			head = null;
			return;
		}
		while (currentNode.getNext() != null) {
			previousNode = previousNode.getNext();
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(null);
	}

	boolean isCircular() {
		boolean isCircular = false;

		return isCircular;
	}
}
