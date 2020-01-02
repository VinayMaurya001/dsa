package _1Programs._1Level;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] unsortedArray = { 3, 4, 1, 5, 2 };
		System.out.println("Before sorting: ");
		for (int numbers : unsortedArray) {
			System.out.print(numbers + "\t");
		}
		System.out.println("\nAfter sorting: ");
		int[] sortedArray = getSortedNumber(unsortedArray);
		for (int numbers : sortedArray) {
			System.out.print(numbers + "\t");
		}
		System.out.println();
		System.out.println(Arrays.asList(sortedArray));
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] getSortedNumber(int[] intArray) {
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 1; j < intArray.length - i; j++) {
				if (intArray[j - 1] > intArray[j]) {
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		for (int numbers : intArray) {
		//	System.out.print(numbers + "\t");
		}
		//System.out.println();
		return intArray;
	}

}
