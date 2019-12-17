package _51DSAndAlgo._1Programs._1Level;

public class ReverseOfANumber {

	public static void main(String[] args) {
		int number = 123;
		String numberInString = Integer.toString(number);
		String reverseOfNumber = getReverseOfNumber(numberInString);
		System.out.println("Reverse of number " + number + ": " + reverseOfNumber);
	}

	private static String getReverseOfNumber(String numberInString) {
		String reverse = "";
		for (int i = numberInString.length() - 1; i >= 0; i--) {
			reverse = reverse + numberInString.charAt(i);
		}
		return reverse;
	}

}
