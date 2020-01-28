package _12Linkedlist._1Level;

public class CirculerSingleLinkedListDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		CircularSingleLinkedList singleLinkedList = new CircularSingleLinkedList();
		singleLinkedList.traverseCircularSingleLinkedList();
		System.out.println(singleLinkedList.getLength());
		
		singleLinkedList.deleteAtStart();
		singleLinkedList.deleteAtEnd();
		singleLinkedList.createCircularSingleLinkedListWithOneElement(50);
		singleLinkedList.traverseCircularSingleLinkedList();
		singleLinkedList.deleteAtStart();
		singleLinkedList.traverseCircularSingleLinkedList();

		
		singleLinkedList.insertAtStart(30);
		singleLinkedList.traverseCircularSingleLinkedList();
		
		singleLinkedList.insertAtEnd(60);
		
		singleLinkedList.traverseCircularSingleLinkedList();
		System.out.println(singleLinkedList.getLength());
		singleLinkedList.insertAtEnd(70);
		
		singleLinkedList.insertAtSpecifiedLocation(10, 0);
		singleLinkedList.traverseCircularSingleLinkedList();
		singleLinkedList.insertAtSpecifiedLocation(20, 1);
		singleLinkedList.traverseCircularSingleLinkedList();
		singleLinkedList.insertAtSpecifiedLocation(40, 3);
		singleLinkedList.traverseCircularSingleLinkedList();
		singleLinkedList.insertAtSpecifiedLocation(100, singleLinkedList.getLength());
		singleLinkedList.traverseCircularSingleLinkedList();
		System.out.println(singleLinkedList.getLength());
		
		System.out.println("Element present at location: "+singleLinkedList.searchElement(100));
		System.out.println("Element present at location: "+singleLinkedList.searchElement(140));
		
		singleLinkedList.traverseCircularSingleLinkedList();
		singleLinkedList.deleteAtStart();
		singleLinkedList.traverseCircularSingleLinkedList();
		singleLinkedList.deleteAtEnd();
		singleLinkedList.traverseCircularSingleLinkedList();
		System.out.println(singleLinkedList.getLength());
		
		singleLinkedList.deleteAtSpecifiedLocation(5);
		singleLinkedList.traverseCircularSingleLinkedList();
		
		singleLinkedList.deleteEntireLinkedList();
		singleLinkedList.traverseCircularSingleLinkedList();
		
	}

}
