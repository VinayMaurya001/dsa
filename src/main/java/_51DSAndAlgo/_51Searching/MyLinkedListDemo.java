package _51DSAndAlgo._51Searching;

public class MyLinkedListDemo {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtEnd(10);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtEnd(20);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtEnd(30);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtStart(9);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtStart(8);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtStart(7);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtMiddle(12, 5);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtMiddle(17, 7);
		myLinkedList.display();
		System.out.println();
		myLinkedList.insertAtMiddle(35, 9);
		myLinkedList.display();

	}

}
