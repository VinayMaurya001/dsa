package _51DSAndAlgo._3Linkedlist;

public class NodeTest1 {
	public static void main(String[] args) {
		Node head = new Node(0);
		Node listNode1 = new Node(1);
		Node listNode2 = new Node(2);
		Node listNode3 = new Node(3);
		Node listNode4 = new Node(4);
		Node listNode5 = new Node(5);

		head.setNext(listNode1);
		listNode1.setNext(listNode2);
		listNode2.setNext(listNode3);
		listNode3.setNext(listNode4);
		listNode4.setNext(listNode5);
		listNode5.setNext(null);

		System.out.println("Linked list");
		int numberOfNode = lengthOfLinkedList(head);
		System.out.println("Length of linked list 1: " + numberOfNode);
		System.out.println(head);

		int numberOfNode3 = lengthOfLinkedList2(head);
		System.out.println("Length of linked list 2: " + numberOfNode3);
		System.out.println(head);

		Node head2 = listNode1;
		int numberOfNode4 = lengthOfLinkedList3(head2);
		System.out.println("Length of linked list 3: " + numberOfNode4);
		System.out.println(head);
	}

	private static int lengthOfLinkedList3(Node head2) {
		int length = 0;
		Node temp = head2;
		for (; temp != null;) {
			length++;
			temp = temp.getNext();
		}
		return length;
	}

	private static int lengthOfLinkedList2(Node head) {
		int length = 0;
		Node temp = new Node(0);
		temp.setNext(head.getNext());
		for (; temp.getNext() != null;) {
			length++;
			temp.setNext(temp.getNext().getNext());
		}
		return length;
	}

	private static int lengthOfLinkedList(Node head) {
		int length = 0;
		Node temp = new Node(0);
		temp = head.getNext();
		for (; temp != null;) {
			length++;
			temp = temp.getNext();
		}
		return length;
	}
}
