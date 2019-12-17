package _51DSAndAlgo._1Programs;

public class ReverseOfANumber {

	public static void main(String[] args) {
		int number = 15867658;
		int reverse = getReverseOfANumber(number);
		System.out.println("reverse: " + reverse);
	}

	private static int getReverseOfANumber(int number) {
		int reverseOfNumber = 0;
		for (; number > 0; number = number / 10) {
			int digit = number % 10;
			reverseOfNumber = reverseOfNumber * 10 + digit;
		}
		return reverseOfNumber;
	}

}
