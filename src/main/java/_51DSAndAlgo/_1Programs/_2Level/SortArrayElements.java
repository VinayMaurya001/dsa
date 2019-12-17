package _51DSAndAlgo._1Programs._2Level;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayElements {

	public static void main(String[] args) {
		String[] unsortedArray = { "Ram", "Shyam", "Sita", "Gita" };
		System.out.print("Before sorting: ");
		for (String arrayElement : unsortedArray) {
			System.out.print(arrayElement + " ");
		}
		System.out.println();

		System.out.print("After sorting in ascending order: ");
		String sortedArray = getSortedArrayInAscendingOrder(unsortedArray);
		System.out.println(sortedArray);

		System.out.print("After sorting in descending order: ");
		sortedArray = getSortedArrayInDescendingOrder(unsortedArray);
		System.out.println(sortedArray);

	}

	private static String getSortedArrayInDescendingOrder(String[] unsortedArray) {
		String[] sortedElement = new String[unsortedArray.length];
		String str = "";
		Arrays.sort(unsortedArray, Collections.reverseOrder());
		for (int i = 0; i < unsortedArray.length; i++) {
			str = unsortedArray[i];
			sortedElement[i] = str;
		}
		return Arrays.toString(sortedElement);
	}

	private static String getSortedArrayInAscendingOrder(String[] unsortedArray) {
		String[] sortedElement = new String[unsortedArray.length];
		String str = "";
		Arrays.sort(unsortedArray);
		for (int i = 0; i < unsortedArray.length; i++) {
			str = unsortedArray[i];
			sortedElement[i] = str;
		}
		return Arrays.toString(sortedElement);
	}

}
