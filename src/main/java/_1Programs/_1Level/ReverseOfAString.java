package _1Programs._1Level;

public class ReverseOfAString {

	public static void main(String[] args) {
		String actualString = "your";
		String reverseString = getReverseString(actualString);
		System.out.println(reverseString);
	}

	private static String getReverseString(String actualString) {
		String reverseOfString = "";
		char[] characterArray = actualString.toCharArray();
		for (int i = characterArray.length - 1; i >= 0; i--) {
			reverseOfString = reverseOfString + characterArray[i];
		}
		return reverseOfString;
	}
}
