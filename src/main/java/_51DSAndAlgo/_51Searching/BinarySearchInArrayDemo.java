package _51DSAndAlgo._51Searching;

import java.util.Arrays;

public class BinarySearchInArrayDemo {
	public static void main(String args[]) {
		int[] unsortedArray = { 1, 2, 5, 4, 3 };
		int firstIndex = 0;
		int lastIndex = unsortedArray.length - 1;
		int searchedElement = 2;
		Arrays.sort(unsortedArray);
		searchElementInSortedArray(unsortedArray, firstIndex, lastIndex, searchedElement);
		searchElementInSortedArrayRecurively(unsortedArray, firstIndex, lastIndex, searchedElement);
	}

	private static void searchElementInSortedArrayRecurively(int[] unsortedArray, int firstIndex, int lastIndex,
			int searchedElement) {
		
		

	}

	private static void searchElementInSortedArray(int[] sortedArray, int firstIndex, int lastIndex,
			int searchedElement) {
		int index = -1;
		String status = "not found";
		int mid = (firstIndex + lastIndex) / 2;
		while (firstIndex <= lastIndex) {
			if (sortedArray[mid] == searchedElement) {
				index = mid;
				status = "found";
				break;
			} else if (sortedArray[mid] < searchedElement) {
				firstIndex = mid + 1;
				System.out.println("first index: " + firstIndex);
			} else {
				lastIndex = mid - 1;
				System.out.println("last index: " + lastIndex);
			}
			mid = (firstIndex + lastIndex) / 2;
		}
		if (firstIndex > lastIndex) {
			System.out.println("Element is not found.");
		} else {
			System.out.println("Searched element: " + searchedElement + " " + status + " at index: " + index);
		}
	}

}
