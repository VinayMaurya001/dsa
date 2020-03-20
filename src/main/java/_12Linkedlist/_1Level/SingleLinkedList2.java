package _12Linkedlist._1Level;

import java.util.HashSet;

public class SingleLinkedList2 {

	private Node head = null;
	private Node tail = null;

	private int size;// denotes size of list

	public SingleLinkedList2() {
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static void main(String[] args) {
		SingleLinkedList2 singleLinkedList2 = new SingleLinkedList2();
		System.out.println(singleLinkedList2.getLength());
		singleLinkedList2.insertAtSpecifiedLocation(70, 3);
		singleLinkedList2.insertAtStart(80);
		singleLinkedList2.insertAtSpecifiedLocation(70, 3);
		singleLinkedList2.insertAtEnd(100);
		singleLinkedList2.insertAtStart(60);
		singleLinkedList2.insertAtStart(40);
		singleLinkedList2.traverseSingleLinkedList();
		singleLinkedList2.insertAtSpecifiedLocation(70, 3);
		singleLinkedList2.traverseSingleLinkedList();
		int length = singleLinkedList2.getLength();
		System.out.println(length);
		singleLinkedList2.traverseSingleLinkedList();

		singleLinkedList2.updateAtStart(20);
		singleLinkedList2.updateAtSpecifiedLocation(100, 3);
		singleLinkedList2.updateAtEnd(120);
		singleLinkedList2.traverseSingleLinkedList();

		singleLinkedList2.deleteAtStart();
		singleLinkedList2.traverseSingleLinkedList();
		singleLinkedList2.deleteAtSpecifiedLocation(4);
		// singleLinkedList2.deleteAtEnd();
		singleLinkedList2.traverseSingleLinkedList();
		boolean isFound = singleLinkedList2.searchDataInSingleLinkedList(100);
		System.out.println(isFound);
		System.out.println(singleLinkedList2.searchDataInSingleLinkedList2Recursive(singleLinkedList2.getHead(), 1009));
		System.out.println(singleLinkedList2.getLength());
		System.out.println(singleLinkedList2.getLengthRecursive(singleLinkedList2.getHead()));

		System.out.println(singleLinkedList2.getNthNodeFromEnd(15));
		System.out.println(singleLinkedList2.getNthNodeFromEnd2(15));
		System.out.println(singleLinkedList2.getNthNodeFromEnd3(15));

		singleLinkedList2.traverseSingleLinkedList();
		System.out.println(singleLinkedList2.getMiddleNode());
		singleLinkedList2.insertAtStart(10);
		singleLinkedList2.traverseSingleLinkedList();
		System.out.println(singleLinkedList2.getMiddleNode());

		singleLinkedList2.insertAtStart(10);
		singleLinkedList2.insertAtStart(10);
		System.out.println(singleLinkedList2.getCountOfGivenData(10));
		System.out.println(singleLinkedList2.getCountOfGivenDataRecursive(singleLinkedList2.getHead(), 10));

		Node node60 = singleLinkedList2.getHead().getNext();
		Node node100 = node60.getNext().getNext();
		node100.setNext(node60);
		System.out.println(singleLinkedList2.isLoopDetected());
		System.out.println(singleLinkedList2.isLoopDetected2());
		System.out.println(singleLinkedList2.isLoopDetected3());

	}

	/**
	 * Use Hashing: Traverse the list one by one and keep putting the node
	 * addresses in a Hash Table. At any point, if NULL is reached then return
	 * false and if next of current node points to any of the previously stored
	 * nodes in Hash then return true.
	 */
	private boolean isLoopDetected() {
		Node tempHead = this.head;
		HashSet<Node> hashSet = new HashSet<Node>();
		while (tempHead != null) {
			if (hashSet.contains(tempHead)) {
				return true;
			}
			hashSet.add(tempHead);
			tempHead = tempHead.getNext();
		}
		return false;
	}

	/*
	 * Floyd’s Cycle-Finding Algorithm: This is the fastest method: Traverse
	 * linked list using two pointers. Move one pointer(slow_p) by one and
	 * another pointer(fast_p) by two. If these pointers meet at the same node
	 * then there is a loop. If pointers do not meet then linked list doesn’t
	 * have a loop
	 * https://www.geeksforgeeks.org/how-does-floyds-slow-and-fast-pointers-
	 * approach-work/
	 */private boolean isLoopDetected2() {
		Node slowHead = this.head;
		Node fastHead = this.head;
		int count = 0;
		while (slowHead != null && fastHead != null && fastHead.getNext() != null) {
			slowHead = slowHead.getNext();
			fastHead = fastHead.getNext().getNext();
			if (slowHead == fastHead) {
				return true;
			}
			count++;
			if (count >= this.size) {
				System.out.println(count);
			}
		}

		return false;
	}

	/*
	 * Marking visited nodes without modifying the linked list data structure In
	 * this method, a temporary node is created. The next pointer of each node
	 * that is traversed is made to point to this temporary node. This way we
	 * are using the next pointer of a node as a flag to indicate whether the
	 * node has been traversed or not. Every node is checked to see if the next
	 * is pointing to a temporary node or not. In the case of the first node of
	 * the loop, the second time we traverse it this condition will be true,
	 * hence we find that loop exists. If we come across a node that points to
	 * null then loop doesn’t exist. The code runs in O(n) time complexity and
	 * uses constant memory space.
	 */private boolean isLoopDetected3() {
		// Create a temporary node
		Node temp = new Node();
		Node tempHead = this.head;
		while (tempHead != null) {
			// This condition is for the case when there is no loop
			if (tempHead.getNext() == null) {
				return false;
			}
			// Check if next is already pointing to temp
			if (tempHead.getNext() == temp) {
				return true;
			}
			// Store the pointer to the next node
			// in order to get to it in the next step
			Node tempHeadNext = tempHead.getNext();
			// Make next point to temp
			tempHead.setNext(temp);
			// Get to the next node in the list
			tempHead = tempHeadNext;
		}
		return false;
	}

	private int getCountOfGivenData(int data) {
		int count = 0;
		Node node = this.head;
		while (node != null) {
			if (data == node.getData()) {
				count++;
			}
			node = node.getNext();
		}
		return count;
	}

	private int getCountOfGivenDataRecursive(Node node, int data) {
		if (node == null) {
			return 0;
		}
		int matchedCount = 0;
		if (node.getData() == data) {
			matchedCount++;
		}
		return matchedCount + getCountOfGivenDataRecursive(node.getNext(), data);
	}

	/*
	 * Traverse linked list using two pointers. Move one pointer by one and
	 * other pointer by two. When the fast pointer reaches end slow pointer will
	 * reach middle of the linked list.
	 */
	private Node getMiddleNode() {
		if ((this.head == null)) {
			return null;
		}
		Node slowNode = this.head;
		Node fastNode = this.head;
		while (fastNode != null && fastNode.getNext() != null) {
			fastNode = fastNode.getNext().getNext();
			slowNode = slowNode.getNext();
		}
		return slowNode;
	}

	// Print the (len – n + 1)th node from the beginning of the Linked List.
	private Node getNthNodeFromEnd(Integer location) {
		if ((this.head == null) || (location == null)) {
			return null;
		}
		if (this.size < location) {
			return null;
		}
		Node node = this.head;
		for (int i = 1; i < this.size - location + 1; i++) {
			node = node.getNext();
			if (node == null) {
				return null;
			}
		}
		return node;
	}

	/*
	 * Maintain two pointers – reference pointer and main pointer. Initialize
	 * both reference and main pointers to head. First, move reference pointer
	 * to n nodes from head. Now move both pointers one by one until the
	 * reference pointer reaches the end. Now the main pointer will point to nth
	 * node from the end. Return the main pointer.
	 */
	private Node getNthNodeFromEnd2(Integer location) {
		if ((this.head == null) || (location == null)) {
			return null;
		}
		Node mainNode = this.head;
		Node tempNode = this.head;
		for (int i = 1; i <= location; i++) {
			tempNode = tempNode.getNext();
			if (tempNode == null) {
				if (i == location) {
					break;
				} else {
					return null;
				}
			}
		}
		for (; tempNode != null;) {
			tempNode = tempNode.getNext();
			mainNode = mainNode.getNext();
		}
		return mainNode;
	}

	private Node getNthNodeFromEnd3(Integer location) {
		if ((this.head == null) || (location == null)) {
			return null;
		}
		Node mainNode = this.head;
		Node tempNode = this.head;
		for (int i = 1; tempNode != null; i++) {
			if (i <= location) {
				tempNode = tempNode.getNext();
				IF_LABEL: if (tempNode == null) {
					if (i == location) {
						break IF_LABEL;
					} else {
						return null;
					}
				}
			} else {
				if (tempNode != null) {
					tempNode = tempNode.getNext();
					mainNode = mainNode.getNext();
				}
			}
		}
		return mainNode;
	}

	private boolean searchDataInSingleLinkedList(int data) {
		boolean isFound = false;
		Node tempHead = this.head;
		while (tempHead != null) {
			if (tempHead.getData() == data) {
				isFound = true;
			}
			tempHead = tempHead.getNext();
		}
		return isFound;
	}

	// Searches a node with given value
	boolean searchDataInSingleLinkedList2(int data) {
		if (existsLinkedList()) {
			Node tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				if (tempNode.getData() == data) {
					System.out.print("Found the node at location: " + i + "\n");
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.print("Node not found!! \n");
		return false;
	}

	boolean searchDataInSingleLinkedList2Recursive(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.getData() == data) {
			return true;
		}
		return searchDataInSingleLinkedList2Recursive(node.getNext(), data);
	}

	private void deleteAtSpecifiedLocation(int location) {
		if (!existsLinkedList()) {
			System.out.println("Linked list is empty");
		} else if (location < 0) {
			System.err.println("Invalid location");
		} else if (location == 0) {
			deleteAtStart();
		} else {
			Node tempHead = this.head;
			for (int i = 0; i < location - 1; i++) {
				tempHead = tempHead.getNext();
			}
			if (tempHead.getNext() == null) {
				System.out.println("Location must be smaller than or equal to length");
			} else {
				tempHead.setNext(tempHead.getNext().getNext());
				size = size - 1;
			}

		}
	}

	// Deletes a node having a given value
	public void deleteAtSpecifiedLocation2(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked
																	// List does
																	// not
																	// exists
			return;
		} else if (location == 0) { // we want to delete first element
			head = head.getNext();
			setSize(getSize() - 1);
			if (getSize() == 0) { // if there are no more nodes in this list
				tail = null;
			}
		} else if (location == getSize()) { // If location is not in range or
											// equal, then delete last node
			Node tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.getNext(); // temp node points to 2nd last
												// node
			}
			if (tempNode == head) { // if this is the only element in the list
				tail = head = null;
				setSize(getSize() - 1);
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize() - 1);

		} else { // if any inside node is to be deleted
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); // we need to traverse till we
												// find the location
			}
			tempNode.setNext(tempNode.getNext().getNext()); // delete the
															// required node
			setSize(getSize() - 1);
		} // end of else

	}

	private void deleteAtEnd() {
		if (!existsLinkedList()) {
			System.out.println("Linked list is empty");
		} else {
			Node tempHead = this.head;
			while (tempHead.getNext() != this.tail) {
				tempHead = tempHead.getNext();
			}
			this.tail = tempHead;
			tempHead.setNext(null);
			size = size - 1;

		}
	}

	private void deleteAtStart() {
		if (!existsLinkedList()) {
			System.out.println("Linked list is empty");
		} else {
			if (this.head.getNext() == null) {
				this.tail = null;
			}
			this.head = this.head.getNext();
			size = size - 1;
		}
	}

	private void updateAtSpecifiedLocation(int data, int location) {
		if (!existsLinkedList()) {
			System.out.println("Linked list is empty");
		} else if (location < 0) {
			System.out.println("Invalid location");
		} else {
			Node tempHead = this.head;
			for (int i = 0; i < location; i++) {
				tempHead = tempHead.getNext();
				if (tempHead == null) {
					System.out.println("Linkedlist is smaller than location");
					return;
				}
			}
			tempHead.setData(data);
		}
	}

	private void updateAtEnd(int data) {
		if (!existsLinkedList()) {
			System.out.println("Linked list is empty");
		} else {
			this.tail.setData(data);
		}
	}

	private void updateAtStart(int data) {
		if (!existsLinkedList()) {
			System.out.println("Linked list is empty");
		} else {
			this.head.setData(data);
		}
	}

	private int getLength() {
		int length = 0;
		Node tempHead = this.head;
		while (tempHead != null) {
			tempHead = tempHead.getNext();
			length++;
		}
		return length;
	}

	private int getLengthRecursive(Node head) {
		if (head == null) {
			return 0;
		}
		return 1 + getLengthRecursive(head.getNext());
	}

	public void insertAtSpecifiedLocation(int data, int location) {
		if (location < 0) {
			System.err.println("Location must be non-negative.");
		}
		if (location == 0) {
			this.insertAtStart(data);
		} else {
			int currentLocation = 0;
			Node newNode = new Node(data, null);
			Node tempNode = this.head;
			if (this.head == null) {
				System.err.println("Linked List is empty");
				return;
			}
			while (currentLocation < location - 1) {
				tempNode = tempNode.getNext();
				if (tempNode == null) {
					System.out.println("Linkedlist is smaller than location");
					return;
					// break;
				}
				currentLocation++;
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
			size = size + 1;
		}
	}

	public void insertAtSpecifiedLocation2(int data, int location) {
		Node node = new Node(data, null);
		if (!existsLinkedList()) { // Linked List does not exists
			System.out.println("The linked list does not exist!!");
			return;
		} else if (location == 0) {// insert at first position
			node.setNext(head);
			head = node;
		} else if (location > size) {// insert at last position
			System.out.println("Linkedlist is smaller than location");
			return;
		} else if (location == size) {// insert at last position
			// node.setNext(null);
			// tail.setNext(node);
			// tail = node;
			insertAtEnd(data);
		} else {// insert at specified location
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			} // tempNode currently references to node after which we should
				// insert new node
			Node nextNode = tempNode.getNext(); // this is the immediate next
												// node after new node
			tempNode.setNext(node);// update reference of tempNode to reference
									// to new node
			node.setNext(nextNode);// update newly added nodes' next.
		}
		setSize(getSize() + 1);
	}

	private void traverseSingleLinkedList() {
		if (!existsLinkedList()) {
			System.err.print("Linked List is empty");
		} else {
			Node tempNode = this.head;
			while (tempNode != null) {
				System.out.print(tempNode + "\t");
				tempNode = tempNode.getNext();
			}
		}
		System.out.println();
	}

	// Traverses Linked List
	void traverseSingleLinkedList2() {
		if (existsLinkedList()) {
			Node tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				System.out.print(tempNode.getData());
				if (i != getSize() - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("Linked List does not exists !");
		}
		System.out.println("\n");
	}

	private void insertAtStart(int data) {
		Node newNode = new Node(data, null);
		if (!existsLinkedList()) {
			this.tail = newNode;
		} else {
			newNode.setNext(this.head);
		}
		this.head = newNode;
		// System.out.println(head);
		size = size + 1;

	}

	private void insertAtEnd(int data) {
		Node newNode = new Node(data, null);
		if (!existsLinkedList()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		size = size + 1;
	}

	public boolean existsLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}

	public void deleteEntireLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		this.head = null;
		this.tail = null;
		System.out.println("Linked List deleted successfully !");

	}

}
