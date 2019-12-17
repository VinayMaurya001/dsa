package _51DSAndAlgo._1Programs;

public class CheckPositiveOrNegativeNumber {

	public static void main(String[] args) {
		int num1 = -9;
		String sign = numberPositiveOrNegative(num1);
		System.out.println(sign);

	}

	private static String numberPositiveOrNegative(int num1) {
		if (num1 > 0) {
			return "positive";
		} else if (num1 < 0) {
			return "Negative";
		} else {
			return "Zero(neither Negative Nor Positive)";
		}
	}

}
