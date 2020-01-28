package _12Linkedlist._1Level;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.traverseDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());

		doubleLinkedList.deleteAtStart();
		doubleLinkedList.deleteAtEnd();
		doubleLinkedList.createDoubleLinkedListWithOneElement(50);
		doubleLinkedList.traverseDoubleLinkedList();
		doubleLinkedList.deleteAtStart();
		doubleLinkedList.traverseDoubleLinkedList();

		doubleLinkedList.insertAtStart(30);
		doubleLinkedList.traverseDoubleLinkedList();

		doubleLinkedList.insertAtEnd(60);
		doubleLinkedList.traverseDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());
		doubleLinkedList.insertAtEnd(70);
		doubleLinkedList.traverseDoubleLinkedList();

		doubleLinkedList.insertAtSpecifiedLocation(10, 0);
		doubleLinkedList.traverseDoubleLinkedList();
		doubleLinkedList.insertAtSpecifiedLocation(20, 1);
		doubleLinkedList.traverseDoubleLinkedList();
		doubleLinkedList.insertAtSpecifiedLocation(25, 2);
		doubleLinkedList.traverseDoubleLinkedList();
		doubleLinkedList.insertAtSpecifiedLocation(100, doubleLinkedList.getLength());
		doubleLinkedList.traverseDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());

		System.out.println("Element present at location: " + doubleLinkedList.searchElement(30));
		System.out.println("Element present at location: " + doubleLinkedList.searchElement(140));

		doubleLinkedList.traverseDoubleLinkedList();
		doubleLinkedList.deleteAtStart();
		doubleLinkedList.traverseDoubleLinkedList();
		doubleLinkedList.deleteAtEnd();
		doubleLinkedList.traverseDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());

		doubleLinkedList.deleteAtSpecifiedLocation(3);
		doubleLinkedList.traverseDoubleLinkedList();
		doubleLinkedList.reverseTraverseDoubleLinkedList();
		
		doubleLinkedList.deleteEntireLinkedList();
		doubleLinkedList.traverseDoubleLinkedList();
		

	}

}
