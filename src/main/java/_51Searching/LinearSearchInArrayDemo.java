package _51Searching;

import java.util.Arrays;

public class LinearSearchInArrayDemo {

	public static void main(String[] args) {
		int[] array = { 1, 12, 5,14, 3 };
		int searchedElement = 10;
		searchElementInUnsortedArray(array, searchedElement);
		searchElementInUnsortedArrayRecursively(array, searchedElement);
		Arrays.sort(array);
		searchElementInSortedArray(array, searchedElement);
		searchElementInSortedArrayRecursively(array, searchedElement);
	}

	private static void searchElementInSortedArrayRecursively(int[] array, int searchedElement) {

		
	}

	private static void searchElementInUnsortedArrayRecursively(int[] array, int searchedElement) {
		// TODO Auto-generated method stub
		
	}

	private static void searchElementInUnsortedArray(int[] unsortedArray, int searchedElement) {
		int index = -1;
		String status = "not found";
		for (int i = 0; i < unsortedArray.length; i++) {
			if (unsortedArray[i] == searchedElement) {
				index = i;
				status = "found";
			}
			System.out.println("aa");
		}
		System.out.println("Searched element: " + searchedElement + " " + status + " hence index: " + index);
	}

	private static void searchElementInSortedArray(int[] sortedArray, int searchedElement) {
		int index = -1;
		String status = "not found";
		for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[i] == searchedElement) {
				index = i;
				status = "found";
			}
			if(sortedArray[i] >= searchedElement) {
				break;
			}
			System.out.println("bbbb");
		}
		System.out.println("Searched element: " + searchedElement + " " + status + " hence index: " + index);
	}

}
