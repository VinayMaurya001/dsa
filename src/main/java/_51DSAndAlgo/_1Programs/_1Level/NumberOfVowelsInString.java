package _51DSAndAlgo._1Programs._1Level;

public class NumberOfVowelsInString {

	public static void main(String[] args) {
		String str = "javaaaaa";
		int numberOfVowelsInString = getNumberOfVowels(str);
		System.out.println("Number of vowels in " + str + ": " + numberOfVowelsInString);
	}

	private static int getNumberOfVowels(String str) {
		char[] characters = str.toCharArray();
		int numberOfVowels = 0;
		for (char ch : characters) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				numberOfVowels++;
				break;
			}
		}
		return numberOfVowels;
	}
}
