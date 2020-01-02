package _1Programs._1Level;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

	public static void main(String[] args) {
		int[] unsortedArray = { 10, 9, 13, 12, 5 };
		int secondLargestNumber = getSecondLargestNumber(unsortedArray);
		System.out.println("Second largest number: " + secondLargestNumber);
	}

	private static int getSecondLargestNumber(int[] unsortedArray) {
		Arrays.sort(unsortedArray);
		return unsortedArray[unsortedArray.length - 2];
	}
}
