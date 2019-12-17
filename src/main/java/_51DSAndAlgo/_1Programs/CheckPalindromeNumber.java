package _51DSAndAlgo._1Programs;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int number = 013310;
		boolean isPalindromeNumber = isPalindromeNumber(number);
		System.out.println(number + " is palindrome:" + isPalindromeNumber);
	}

	private static boolean isPalindromeNumber(int number) {
		boolean isPalindromeNumber = false;
		int reverseOfNumber = 0, tempNumber = number;
		for (; tempNumber > 0; tempNumber = tempNumber / 10) {
			int digit = tempNumber % 10;
			reverseOfNumber = reverseOfNumber * 10 + digit;
		}
		if (reverseOfNumber == number) {
			isPalindromeNumber = true;
		}
		System.out.println("hi everybody");
		return isPalindromeNumber;
	}

}
