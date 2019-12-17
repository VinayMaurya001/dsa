package _51DSAndAlgo._1Programs._3Level;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitAString {

	public static void main(String[] args) {
		String string = "091-1234567890";
		String[] splitString = string.split("-");
		printString(splitString, "String class split method");

		List<String> listOfString = Pattern.compile("-").splitAsStream(string).collect(Collectors.toList());
		printString2(listOfString, "Pattern class method");

		StringTokenizer stringTokenizer = new StringTokenizer(string, "-");
		printString3(stringTokenizer, "StringTokenizer class");

		// String[] splitString1= StringUtils.split(string,"-");
		// Iterable <String> result = Splitter.on("-").split(string);
	}

	private static void printString3(StringTokenizer stringTokenizer, String approach) {
		System.out.println("Splitting string by using " + approach);
		while (stringTokenizer.hasMoreTokens()) {
			String str = stringTokenizer.nextToken();
			System.out.println(str);
		}
	}

	private static void printString2(List<String> listOfString, String approach) {
		System.out.println("Splitting string by using " + approach);
		for (String str : listOfString) {
			System.out.println(str);
		}
	}

	private static void printString(String[] spliString, String approach) {
		System.out.println("Splitting string by using " + approach);
		for (String str : spliString) {
			System.out.println(str);
		}
	}

}
