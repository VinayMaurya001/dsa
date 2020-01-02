package _1Programs._1Level;

import java.util.Arrays;

public class DeleteElementFromAnArray {

	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int indexToDeleteElement = 2;
		System.out.println("Original array: " + Arrays.toString(originalArray));

		int[] arrayAfterElementdeleted = new int[originalArray.length-1];
		for (int i = 0, j = 0; i < originalArray.length; i++) {
			if (i == indexToDeleteElement) {
				continue;
			}
			arrayAfterElementdeleted[j++] = originalArray[i];
		}
		System.out.println("Array after element deleted: " + Arrays.toString(arrayAfterElementdeleted));
	}

}
