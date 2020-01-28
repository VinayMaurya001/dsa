package _15tree._binaryTree._1Level;



public class QueueUsingLL {

	private Node front;
	private Node rear;

	public QueueUsingLL() {
		super();
	}

	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}

	public void traverse() {
		if (front == null) {
			System.err.println("Linked List is Empty.");
		} else {
			Node tempHead = this.front;
			for (; tempHead != null;) {
				System.out.print(tempHead + "\t");
				tempHead = tempHead.getNext();
			}
			System.out.println();
		}
	}

	public int size() {
		int length = 0;
		Node tempHead = front;
		for (; tempHead != null;) {
			tempHead = tempHead.getNext();
			length++;
		}
		return length;
	}

	// same as size
	public int noOflements() {
		return size();
	}

	public void enQueue(DNode data) {
		Node newNode = new Node(data);
		if (this.rear == null) {
			this.front = newNode;
			this.rear = newNode;
		} else {
			this.rear.setNext(newNode);
			this.rear = newNode;
		}
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		if (front == null) {
			//System.out.println("Queue is empty.");
			return true;
		}
		return false;
	}

	public DNode deQueue() {
		DNode deQueueElement = front.getData();
		//System.out.println(this.front.getNext());
		if (this.front == null) {
			//System.out.println("Can't delete element because LinkedList is empty");
		} else if (this.front.getNext() == null) {
			//System.out.println("Deleting only single element " + front + " at start");
			this.front = null;
			this.rear = null;
		} else {
			//System.out.println("Deleting single element " + front + " at start");
			Node tempHead = this.front;
			tempHead = this.front.getNext();
			this.front.setNext(null);
			this.front = tempHead;
		}
		return deQueueElement;
	}

	public DNode peek() {
		if (front == null) {
			System.out.println("Queue is empty.");
			return null;
		}
		return front.getData();
	}

	public void deleteQueue() {
		System.out.println("Deleting queue.");
		front = null;
		rear = null;
	}

}