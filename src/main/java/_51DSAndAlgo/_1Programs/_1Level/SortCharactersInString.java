package _51DSAndAlgo._1Programs._1Level;

import java.util.Arrays;

public class SortCharactersInString {

	public static void main(String[] args) {
		String unsortedCharactersInString = "JAVA";
		String sortedCharactersInString = getSortedString(unsortedCharactersInString);
		System.out.println(
				"Sorted character of String: " + unsortedCharactersInString + " is: " + sortedCharactersInString);
	}

	private static String getSortedString(String unsortedCharactersInString) {
		String[] stringArray = new String[unsortedCharactersInString.length()];
		String sortedString = "";
		for (int i = 0; i < unsortedCharactersInString.length(); i++) {
			// sortedString = sortedString + unsortedCharactersInString.charAt(i);
			sortedString = "" + unsortedCharactersInString.charAt(i);
			stringArray[i] = sortedString;
		}
		Arrays.sort(stringArray);
		return Arrays.toString(stringArray);
	}

}
