package _51DSAndAlgo._51Searching;

import java.util.Set;
import java.util.TreeSet;

public class LinearSearchInTreeDemo {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(3);
		searchElementInTreeSet(treeSet);
	}

	private static void searchElementInTreeSet(Set<Integer> treeSet) {
		int searchedElement = 6;
		int index = 0;
		String status = "";
		if (treeSet.contains(searchedElement)) {
			index = ((TreeSet<Integer>) treeSet).headSet(searchedElement).size();
			status = "found";
		} else {
			index = -1;
			status = "not found";
		}
		System.out.println("Searched element: " + searchedElement + " " + status + " hence index: " + index);
	}

}
