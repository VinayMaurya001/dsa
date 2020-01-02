package _1Programs;

public class ConcatenateTwoStrings {

	public static void main(String[] args) {
		String firstString = "sita", secondString = "ram";
		System.out.println("ConcatenatedStrings: " + firstString.concat(secondString));

		String concatenatedString = concatenateTwoStrings(firstString, secondString);
		System.out.println("Concatenated Strings: " + concatenatedString);
	}

	private static String concatenateTwoStrings(String firstString, String secondString) {
		String str = "";
		for (int i = 0; i < firstString.length(); i++) {
			str = str + firstString.charAt(i);
		}
		for (int i = 0; i < secondString.length(); i++) {
			str = str + secondString.charAt(i);
		}
		return str;
	}

}
