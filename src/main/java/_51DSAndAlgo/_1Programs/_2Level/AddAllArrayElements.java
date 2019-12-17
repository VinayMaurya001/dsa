package _51DSAndAlgo._1Programs._2Level;

import java.util.Arrays;
import java.util.Scanner;

public class AddAllArrayElements {

	public static void main(String[] args) {
		getAdditionOfAllArrayElements();
	}

	private static void getAdditionOfAllArrayElements() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int size = scanner.nextInt();
		int[] arrayElements = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arrayElements[i] = scanner.nextInt();
		}
		System.out.println("Array: " + Arrays.toString(arrayElements));
		int additionOfArrayElements = 0;
		for (int element : arrayElements) {
			additionOfArrayElements = additionOfArrayElements + element;
		}
		System.out.println("Addition of all array elements: " + additionOfArrayElements);
		scanner.close();
	}

}
