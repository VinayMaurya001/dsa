package _51DSAndAlgo._1Programs._1Level;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		String str1 = "JAVa";
		String str2 = "VAAJ";
		System.out.println("Hello");
		// boolean isAnagram = isAnagramStringCaseSensitive(str1, str2);
		// boolean isAnagram = isAnagramStringCaseInSensitive(str1, str2);
		boolean isAnagram = isAnagramStringCaseInSensitiveSingleLoop(str1, str2);
		if (isAnagram) {
			System.out.println(str1 + " and " + str2 + " are anagram string");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram string");
		}
	}

	private static boolean isAnagramStringCaseInSensitiveSingleLoop(String str1, String str2) {
		boolean isAnagramString = true;
		char[] stringArray1 = str1.toLowerCase().toCharArray();
		StringBuffer sb = new StringBuffer(str2.toLowerCase());
		for (int i = 0; i < stringArray1.length; i++) {
			int index = sb.indexOf(stringArray1[i] + "");
			if (index != -1) {
				sb.deleteCharAt(index);
			} else {
				isAnagramString = false;
				break;
			}
		}
		if (sb.length() == 0) {
			isAnagramString = true;
		}
		return isAnagramString;
	}

	private static boolean isAnagramStringCaseInSensitive(String str1, String str2) {
		boolean isAnagramString = false;
		char[] stringArray1 = str1.toLowerCase().toCharArray();
		char[] stringArray2 = str2.toLowerCase().toCharArray();
		Arrays.sort(stringArray1);
		Arrays.sort(stringArray2);
		if (Arrays.equals(stringArray1, stringArray2)) {
			isAnagramString = true;
		}
		return isAnagramString;
	}

	private static boolean isAnagramStringCaseSensitive(String str1, String str2) {
		boolean isAnagramString = false;
		char[] stringArray1 = str1.toCharArray();
		char[] stringArray2 = str2.toCharArray();
		Arrays.sort(stringArray1);
		Arrays.sort(stringArray2);
		if (Arrays.equals(stringArray1, stringArray2)) {
			isAnagramString = true;
		}
		return isAnagramString;
	}

}
