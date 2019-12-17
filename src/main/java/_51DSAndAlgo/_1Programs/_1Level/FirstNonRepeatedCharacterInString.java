package _51DSAndAlgo._1Programs._1Level;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		char firstNonRepeatedChar = getFirstNonRepeatedChar("aabbddef");
		System.out.println("First non-repeated character in String: " + firstNonRepeatedChar);
	}

	private static char getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>(str.length());
		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("Didn't find any non repeated character");
	}
}
