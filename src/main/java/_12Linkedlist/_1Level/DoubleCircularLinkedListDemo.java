package _12Linkedlist._1Level;

public class DoubleCircularLinkedListDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		DoubleCircularLinkedList doubleLinkedList = new DoubleCircularLinkedList();
		doubleLinkedList.traverseCircularDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());

		doubleLinkedList.deleteAtStart();
		doubleLinkedList.deleteAtEnd();
		doubleLinkedList.createCircularDoubleLinkedListWithOneElement(50);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.deleteAtStart();
		doubleLinkedList.traverseCircularDoubleLinkedList();

		doubleLinkedList.insertAtStart(30);
		doubleLinkedList.traverseCircularDoubleLinkedList();

		doubleLinkedList.insertAtEnd(60);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());
		doubleLinkedList.insertAtEnd(70);
		doubleLinkedList.traverseCircularDoubleLinkedList();

		doubleLinkedList.insertAtSpecifiedLocation(10, 0);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.insertAtSpecifiedLocation(20, 1);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.insertAtSpecifiedLocation(25, 2);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.insertAtSpecifiedLocation(100, doubleLinkedList.getLength());
		doubleLinkedList.traverseCircularDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());

		System.out.println("Element present at location: " + doubleLinkedList.searchElement(10));
		System.out.println("Element present at location: " + doubleLinkedList.searchElement(60));
		System.out.println("Element present at location: " + doubleLinkedList.searchElement(140));

		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.deleteAtStart();
		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.deleteAtEnd();
		doubleLinkedList.traverseCircularDoubleLinkedList();
		System.out.println(doubleLinkedList.getLength());

		doubleLinkedList.deleteAtSpecifiedLocation(doubleLinkedList.getLength()-1);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.deleteAtSpecifiedLocation(doubleLinkedList.getLength()-2);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.deleteAtSpecifiedLocation(1);
		doubleLinkedList.traverseCircularDoubleLinkedList();
		//doubleLinkedList.deleteAtSpecifiedLocation(0);
		//doubleLinkedList.traverseCircularDoubleLinkedList();
		doubleLinkedList.reverseTraverseCircularDoubleLinkedList();

		doubleLinkedList.deleteEntireLinkedList();
		doubleLinkedList.traverseCircularDoubleLinkedList();

	}

}
