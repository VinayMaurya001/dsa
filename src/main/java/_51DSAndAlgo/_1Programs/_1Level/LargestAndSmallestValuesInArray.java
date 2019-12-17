package _51DSAndAlgo._1Programs._1Level;

import java.util.HashMap;
import java.util.Map;

public class LargestAndSmallestValuesInArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		Map largestAndSmallestNumberMap = getLargestAndSmallestValues(numbers);
		System.out.println(largestAndSmallestNumberMap.get("largest"));
		System.out.println(largestAndSmallestNumberMap.get("smallest"));
		int[] numbers2 = { 1, 2, 3, 4, 5 };
		largestAndSmallestNumberMap = getLargestAndSmallestValues2(numbers2);
		System.out.println(largestAndSmallestNumberMap.get("largest"));
		System.out.println(largestAndSmallestNumberMap.get("smallest"));

	}

	private static Map getLargestAndSmallestValues2(int[] numbers) {
		Map<String, Integer> numberMap = new HashMap<String, Integer>();
		int largestNumber = 1;
		int smallestNumber = 1;
		for (int number : numbers) {
			if (number > largestNumber) {
				largestNumber = number;
			}
		}
		for (int number : numbers) {
			if (number < smallestNumber) {
				smallestNumber = number;
			}
		}
		numberMap.put("largest", largestNumber);
		numberMap.put("smallest", smallestNumber);
		return numberMap;
	}

	private static Map getLargestAndSmallestValues(int[] numbers) {
		Map<String, Integer> numberMap = new HashMap<String, Integer>();
		int largestNumber = Integer.MIN_VALUE;
		int smallestNumber = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number > largestNumber) {
				largestNumber = number;
			}
		}
		for (int number : numbers) {
			if (number < smallestNumber) {
				smallestNumber = number;
			}
		}
		numberMap.put("largest", largestNumber);
		numberMap.put("smallest", smallestNumber);
		return numberMap;
	}

}
