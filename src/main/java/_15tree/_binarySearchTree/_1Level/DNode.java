package _15tree._binarySearchTree._1Level;

public class DNode {

	private DNode prev;
	private int data;
	private DNode next;

	public DNode() {
		super();
	}

	public DNode(DNode prev, int data, DNode next) {
		super();
		this.prev = prev;
		this.data = data;
		this.next = next;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[" + (prev != null ? prev.getData() + "<-" : null) + " " + data + " "
				+ (next != null ? "->" + next.getData() : null) + "]";
	}

}
