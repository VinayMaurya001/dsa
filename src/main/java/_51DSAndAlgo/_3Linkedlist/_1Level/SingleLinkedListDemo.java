package _51DSAndAlgo._3Linkedlist._1Level;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.traverseSingleLinkedList();
		System.out.println(singleLinkedList.getLength());
		singleLinkedList.deleteAtStart();
		singleLinkedList.deleteAtEnd();
		singleLinkedList.createSingleLinkedListWithOneElement(50);
		singleLinkedList.traverseSingleLinkedList();
		singleLinkedList.deleteAtStart();
		singleLinkedList.traverseSingleLinkedList();
		
		singleLinkedList.insertAtStart(30);
		singleLinkedList.traverseSingleLinkedList();
		
		singleLinkedList.insertAtEnd(60);
		singleLinkedList.traverseSingleLinkedList();
		
		singleLinkedList.insertAtSpecifiedLocation(10, 0);
		singleLinkedList.traverseSingleLinkedList();
		singleLinkedList.insertAtSpecifiedLocation(40, 2);
		singleLinkedList.traverseSingleLinkedList();
		singleLinkedList.insertAtSpecifiedLocation(70, 4);
		singleLinkedList.traverseSingleLinkedList();
		singleLinkedList.insertAtSpecifiedLocation(100, singleLinkedList.getLength());
		singleLinkedList.traverseSingleLinkedList();
		System.out.println(singleLinkedList.getLength());
		
		System.out.println("Element present at location: "+singleLinkedList.searchElement(40));
		System.out.println("Element present at location: "+singleLinkedList.searchElement(140));
		
		singleLinkedList.traverseSingleLinkedList();
		singleLinkedList.deleteAtStart();
		singleLinkedList.traverseSingleLinkedList();
		singleLinkedList.deleteAtEnd();
		singleLinkedList.traverseSingleLinkedList();
		
		singleLinkedList.deleteAtSpecifiedLocation(2);
		singleLinkedList.traverseSingleLinkedList();
		
		singleLinkedList.deleteEntireLinkedList();
		singleLinkedList.traverseSingleLinkedList();
		
	}

}
