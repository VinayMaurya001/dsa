package _1Programs._1Level;

public class PalindromeString {

	public static void main(String[] args) {
		String actualString = "madam";
		boolean isPalindromeString = isPalindrom(actualString);
		if (isPalindromeString) {
			System.out.println("Given String " + actualString + " is Palindrome");
		} else {
			System.out.println("Given String " + actualString + " is not Palindrome");
		}
	}

	private static boolean isPalindrom(String actualString) {
		boolean isPalindromeString = false;
		String reverseString = "";
		for (int i = actualString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + actualString.charAt(i);
		}
		System.out.println("Reverse of " + actualString + ": " + reverseString);
		if (reverseString.equals(actualString)) {
			isPalindromeString = true;
		}
		return isPalindromeString;
	}
}
