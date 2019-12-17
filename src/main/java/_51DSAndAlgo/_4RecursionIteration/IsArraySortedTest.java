package _51DSAndAlgo._4RecursionIteration;

public class IsArraySortedTest {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9 };

		boolean isArraySorted = m1(arr, arr.length);
		System.out.println(isArraySorted);
		isArraySorted = m2(arr);
		System.out.println(isArraySorted);
	}

	private static boolean m1(int[] arr, int index) {
		if (index == 1)
			return true;
		return arr[index - 1] >= arr[index - 2] ? m1(arr, index - 1) : false;
	}

	private static boolean m2(int[] arr) {
		boolean isArraySorted = true;
		if (arr.length == 1) {
			isArraySorted = true;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isArraySorted = false;
			}
		}
		return isArraySorted;
	}

}
