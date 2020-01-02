
package _3Linkedlist;

public class TestMyLinkedList {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.showLinkedList();
		myLinkedList.insertAtEnd(19);
		myLinkedList.showLinkedList();
		System.out.println();
		myLinkedList.insertAtEnd(20);
		myLinkedList.showLinkedList();
		myLinkedList.insertAtEnd(16);
		myLinkedList.showLinkedList();
		int length = myLinkedList.lengthOfLinkedList();
		System.out.println("length: " + length);
		System.out.println();

		// int deletedElement = myLinkedList.deleteFromMiddle(2);
		// System.out.println("Deleted element: "+deletedElement);
		// myLinkedList.showLinkedList();

		// int deletedElement = myLinkedList.deleteFromMiddle2(16);
		// System.out.println("Deleted element: " + deletedElement);
		// myLinkedList.showLinkedList();

	}

}
