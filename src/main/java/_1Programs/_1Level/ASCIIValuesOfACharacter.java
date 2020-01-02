package _1Programs._1Level;

public class ASCIIValuesOfACharacter {

	public static void main(String[] args) {
		char character = 'A';
		int asciiValue = getASCIIValueOfCharacter(character);
		System.out.println(asciiValue);
	}

	private static int getASCIIValueOfCharacter(char character) {
		return (int) character;
	}

}
