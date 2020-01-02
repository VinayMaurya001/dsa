package _1Programs._1Level;

import java.util.Scanner;

public class CheckAlphabetCharacter {

	public static void main(String[] args) {
		System.out.print("Enter a character:");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		boolean isAlphabet = isAlphabet(ch);
		if (isAlphabet) {
			System.out.println("The given character is alphabet");
		} else {
			System.out.println("The given character is not alphabet");
		}
	}

	private static boolean isAlphabet(char ch) {
		boolean isAlphabetCharacter = false;
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			isAlphabetCharacter = true;
		}
		return isAlphabetCharacter;
	}

}
