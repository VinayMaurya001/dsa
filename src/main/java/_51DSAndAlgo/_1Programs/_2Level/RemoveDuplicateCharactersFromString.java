package _51DSAndAlgo._1Programs._2Level;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		String withDuplicates = "Sandeep";
		String withoutDuplicates = removeDuplicates(withDuplicates);
		System.out.println(withoutDuplicates);
	}

	private static String removeDuplicates(String withDuplicates) {
		StringBuffer withoutDuplicates = new StringBuffer();
		Set<Character> characterSet = new HashSet<Character>();
		char ch = ' ';
		for (int i = 0; i < withDuplicates.length(); i++) {
			ch = withDuplicates.charAt(i);
			if (!characterSet.contains(ch)) {
				characterSet.add(ch);
				withoutDuplicates.append(ch);
			}
		}
		return withoutDuplicates.toString();
	}

}
