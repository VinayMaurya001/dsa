package _51DSAndAlgo._1Programs;

public class CountDigitOfNumber {

	public static void main(String[] args) {
		int number = 345;
		int count = countDigitOfANumber(number);
		System.out.println("number of digits in an integer: " + number + " = " + count);
		count = countDigitOfANumber2(number);
		System.out.println("number of digits in an integer: " + number + " = " + count);
	}

	private static int countDigitOfANumber(int number) {
		int count = 0;
		if (number == 0) {
			count = 1;
			return count;
		}
		for (; number > 0;) {
			number = number / 10;
			count++;
		}
		return count;
	}

	private static int countDigitOfANumber2(int number) {
		int count = 0;
		do {
			number = number / 10;
			count++;
		} while (number > 0);
		return count;
	}
}
