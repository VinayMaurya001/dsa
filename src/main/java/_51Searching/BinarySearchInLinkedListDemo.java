package _51Searching;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchInLinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		int searchedElement = 3;
		Collections.sort(list);
		System.out.println(list);
		searchElementInSortedLinkedList(list, searchedElement);
	}

	private static void searchElementInSortedLinkedList(List<Integer> list, int searchedElement) {
		list.contains(searchedElement);

	}

}
