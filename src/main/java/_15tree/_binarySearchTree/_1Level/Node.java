package _15tree._binarySearchTree._1Level;

public class Node {
	private DNode data;
	private Node next;

	public Node() {
		super();
	}

	public Node(DNode data) {
		super();
		this.data = data;
	}

	public DNode getData() {
		return data;
	}

	public void setData(DNode data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[" + (data == null ? data : data.getData()) + " " + (next != null ? "->" + next.getData() : null) + "]";
	}
}
