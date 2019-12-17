package _51DSAndAlgo._1Programs._1Level;

public class ArrayCodingIQ {

	public static void main(String[] args) {
		int[] integerArray = { 3, 3, 5, 1, 1, 6 };
		int missingNumber = getNonRepeatingElements(integerArray);
		System.out.println(missingNumber);
	}

	private static int getNonRepeatingElements(int[] integerArray) {
		for (int i = 0; i < integerArray.length; i++) {
			int j;
			for (j = 0; j < integerArray.length; j++)
				if (i != j && integerArray[i] == integerArray[j])
					break;
			if (j == integerArray.length)
				return integerArray[i];
		}
		return -1;
	}

}
