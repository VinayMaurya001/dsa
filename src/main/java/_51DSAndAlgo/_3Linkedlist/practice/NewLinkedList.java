package _51DSAndAlgo._3Linkedlist.practice;

public class NewLinkedList {
	private ListNode head;

	public void showNewLinkedList() {
		if (head == null) {
			System.out.println("Linked List is empty.");
			return;
		}
		ListNode tempHead = this.head;
		while (tempHead.getNextNode() != null) {
			System.out.print(tempHead.getNodeData() + "\t");
			tempHead = tempHead.getNextNode();
		}
		System.out.println(tempHead.getNodeData());
	}

	public void insertAtEnd(int data) {
		ListNode newNode = new ListNode();
		newNode.setNodeData(data);
		newNode.setNextNode(null);
		if (this.head == null) {
			this.head = newNode;
		} else {
			ListNode tempHead = this.head;
			while (tempHead.getNextNode() != null) {
				// System.out.println("inside " + tempHead.getData());
				tempHead = tempHead.getNextNode();
			}
			tempHead.setNextNode(newNode);
		}
	}

	public void insertAtStart(int data) {
		ListNode newNode = new ListNode();
		newNode.setNodeData(data);
		newNode.setNextNode(null);
		if (this.head == null) {
			head = newNode;
		} else {
			newNode.setNextNode(head);
			head = newNode;
		}
	}

	public void deleteFromStart() {
		if (this.head != null) {
			ListNode tempHead = this.head;
			head = head.getNextNode();
			tempHead.setNextNode(null);
		}
	}

	public void deleteFromEnd() {
	}

}
