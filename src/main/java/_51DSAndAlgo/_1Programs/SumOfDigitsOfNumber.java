package _51DSAndAlgo._1Programs;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		int number = 129034;
		int sum = sumOfDigits(number);
		System.out.println("Sum of digits of an integer2: " + sum);
	}

	private static int sumOfDigits(int number) {
		int sumOfDigits = 0;
		int digit = 0;
		for (; number > 0; number = number / 10) {
			digit = number % 10;
			sumOfDigits = sumOfDigits + digit;
		}
		return sumOfDigits;
	}

}
