package _51DSAndAlgo._1Programs._3Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicatesFromString {

	public static void main(String[] args) {
		String actualString = "Sandeepp";
		String duplicates = "";
		duplicates = getDuplicates(actualString);
		// System.out.println(duplicates);
		duplicates = getDuplicates2(actualString);
		System.out.println(duplicates);
	}

	private static String getDuplicates2(String actualString) {
		StringBuffer duplicates = new StringBuffer();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] characters = actualString.toCharArray();
		for (char ch : characters) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		Set<Map.Entry<Character, Integer>> setEntry = map.entrySet();
		for (Map.Entry<Character, Integer> entry : setEntry) {
			if (entry.getValue() > 1) {
				duplicates = duplicates.append(entry.getKey());
			}
		}
		return duplicates.toString();
	}

	private static String getDuplicates(String actualString) {
		StringBuffer duplicates = new StringBuffer();
		char ch = ' ';
		Set<Character> duplicatesSet = new HashSet<Character>();
		for (int i = 0; i < actualString.length(); i++) {
			ch = actualString.charAt(i);
			if (!duplicatesSet.contains(ch)) {
				duplicatesSet.add(ch);
			} else {
				duplicates.append(ch);
			}
		}
		return duplicates.toString();
	}

}
