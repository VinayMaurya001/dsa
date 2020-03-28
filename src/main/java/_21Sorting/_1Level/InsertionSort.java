package _21Sorting._1Level;

import java.util.Arrays;

public class InsertionSort {

	static void insertionSort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int temp = A[i], j = i;
			while (j > 0 && A[j - 1] > temp) {
				A[j] = A[j - 1];
				j--;
				System.out.println(Arrays.asList(A));
			}
			A[j] = temp;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void main(String[] args) {

		int array[] = { 10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8 };

		System.out.println("User entered Array: ");
		InsertionSort.printArray(array);

		long start = System.nanoTime();
		InsertionSort.insertionSort(array);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end - start));

		System.out.println("\nAfter sorting: ");
		InsertionSort.printArray(array);
	}

}