package _51DSAndAlgo._1Programs;

public class FindLargestNumber {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3 = 1;
		int largestNumber = getLargestNumber1(num1, num2);
		System.out.println(largestNumber);
		largestNumber = getLargestNumber2(num1, num2);
		System.out.println(largestNumber);

		int largestNumber1 = getLargestNumber1(num1, num2, num3);
		System.out.println(largestNumber1);
		largestNumber1 = getLargestNumber2(num1, num2, num3);
		System.out.println(largestNumber1);
		largestNumber1 = getLargestNumber3(num1, num2, num3);
		System.out.println(largestNumber1);
		largestNumber1 = getLargestNumber4(num1, num2, num3);
		System.out.println(largestNumber1);
	}

	private static int getLargestNumber2(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	private static int getLargestNumber1(int num1, int num2) {
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		return max;
	}

	private static int getLargestNumber1(int num1, int num2, int num3) {
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		return max;
	}

	private static int getLargestNumber2(int num1, int num2, int num3) {
		if (num1 < num2) {
			num1 = num2;
		}
		if (num1 < num3) {
			num1 = num3;
		}
		return num1;
	}

	private static int getLargestNumber3(int num1, int num2, int num3) {
		if ((num1 >= num2) && (num1 >= num3)) {
			return num1;
		}
		if ((num2 >= num1) && (num2 >= num3)) {
			return num2;
		}
		return num3;
	}

	private static int getLargestNumber4(int num1, int num2, int num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				return num1;
			} else {
				return num3;
			}
		} else {
			if (num2 > num3) {
				return num2;
			} else {
				return num3;
			}
		}
	}

}
