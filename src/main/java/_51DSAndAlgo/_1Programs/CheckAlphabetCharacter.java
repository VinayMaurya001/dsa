package _51DSAndAlgo._1Programs;

public class CheckAlphabetCharacter {

	public static void main(String[] args) {
		char alphabet = '+';
		boolean alphabetCharacter = isAlphabetCharacter(alphabet);
		System.out.println(alphabetCharacter);
	}

	private static boolean isAlphabetCharacter(char alphabet) {
		return ((alphabet >= 65) && (alphabet <= 91) || ((alphabet >= 97) && (alphabet <= 123)));
	}

	private static boolean isAlphabetCharacter0(int alphabet) {
		boolean isAlphabet = false;
		int num1 = 65, num2 = 97;
		if ((alphabet >= 65) && (alphabet <= 91)) {

			for (int i = 0; i <= 26; i++) {
				num1++;
				if (num1 == alphabet) {
					System.out.println("num: " + num1 + " which is equivalent to alphabet: " + (char) alphabet);
					isAlphabet = true;
					return isAlphabet;
				} else {
					isAlphabet = false;
				}
			}
		}
		if ((alphabet >= 97) && (alphabet <= 123)) {

			for (int i = 0; i <= 26; i++) {
				num2++;
				if (num2 == alphabet) {
					System.out.println("num: " + num2 + " which is equivalent to alphabet: " + (char) alphabet);
					isAlphabet = true;
					return isAlphabet;
				} else {
					isAlphabet = false;
				}
			}
		}
		return isAlphabet;
	}

}
