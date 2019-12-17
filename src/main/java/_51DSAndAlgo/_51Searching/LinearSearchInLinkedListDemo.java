package _51DSAndAlgo._51Searching;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinearSearchInLinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		System.out.println("List: " + list);
		searchElementInUnsortedLinkedList(list);
		searchElementInSortedLinkedList(list);

	}

	private static void searchElementInUnsortedLinkedList(List<Integer> list) {
		int searchedElement = 5;
		int index = -1;
		String status = "not found";
		if (list.contains(searchedElement)) {
			index = list.indexOf(searchedElement);
			status = "found";
		}
		System.out.println("Searched element: " + searchedElement + " " + status + " hence index: " + index);
	}

	private static void searchElementInSortedLinkedList(List<Integer> sortedList) {
		Collections.sort(sortedList);
		int searchedElement = 5;
		int index = -1;
		String status = "not found";
		if (sortedList.contains(searchedElement)) {
			index = sortedList.indexOf(searchedElement);
			status = "found";
		}
		System.out.println("Searched element: " + searchedElement + " " + status + " hence index: " + index);
	}

}
