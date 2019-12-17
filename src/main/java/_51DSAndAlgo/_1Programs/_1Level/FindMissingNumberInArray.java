package _51DSAndAlgo._1Programs._1Level;

import java.util.Arrays;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 6 };
		int missingNumber = getMissingNumberInAnArray(array, 6);
		System.out.println("Missing number in " + Arrays.toString(array) + " is: " + missingNumber);
	}

	private static int getMissingNumberInAnArray(int[] array, int actualArraySize) {
		int missingNumber = 0;
		int actualTotal = 0;
		int expectedTotal = 0;// size*(Size+1)/2
		expectedTotal = actualArraySize * (actualArraySize + 1) / 2;

		for (int arrayElement : array) {
			actualTotal = actualTotal + arrayElement;
		}
		missingNumber = expectedTotal - actualTotal;

		return missingNumber;
	}

}
