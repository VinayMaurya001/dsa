package _12Linkedlist.practice;

public class TestLinkedList {

	public static void main(String[] args) {

		NewLinkedList newLinkedList = new NewLinkedList();
		newLinkedList.insertAtEnd(19);
		newLinkedList.insertAtEnd(20);
		newLinkedList.insertAtEnd(1);
		newLinkedList.insertAtEnd(2);
		newLinkedList.showNewLinkedList();

		// NewLinkedList newLinkedList2 = new NewLinkedList();
		newLinkedList.insertAtStart(33);
		newLinkedList.insertAtStart(3);
		newLinkedList.showNewLinkedList();

		NewLinkedList newLinkedList2 = new NewLinkedList();
		newLinkedList2.insertAtStart(4);
	//	newLinkedList2.insertAtStart(5);
//		newLinkedList2.insertAtStart(9);
//		newLinkedList2.insertAtStart(52);
//		newLinkedList2.insertAtStart(91);
//		newLinkedList2.insertAtStart(6);
//		
//		System.out.println();
//		newLinkedList2.showNewLinkedList();
//		newLinkedList2.deleteFromStart();
//		newLinkedList2.showNewLinkedList();
//		newLinkedList2.deleteFromStart();
//		newLinkedList2.showNewLinkedList();
//		newLinkedList2.deleteFromStart();
//		newLinkedList2.deleteFromStart();
//		
		
		System.out.println();
		newLinkedList2.showNewLinkedList();
		newLinkedList2.deleteFromEnd();
		newLinkedList2.showNewLinkedList();
		newLinkedList2.deleteFromEnd();
		newLinkedList2.showNewLinkedList();
		
		
	}
}
