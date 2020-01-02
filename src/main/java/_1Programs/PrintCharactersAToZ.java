package _1Programs;

public class PrintCharactersAToZ {

	public static void main(String[] args) {

		getCharactersAToZ();
		System.out.println();
		getCharactersaToz();
	}

	private static void getCharactersaToz() {
		char valueOfa = 97;// a=97
		for (int i = 1; i <= 26; valueOfa++, i++) {
			System.out.print(" " + valueOfa);
		}
	}

	private static void getCharactersAToZ() {
		char valueOfA = 65;
		for (int i = 1; i <= 26; valueOfA++, i++) {
			System.out.print(" " + valueOfA);
		}
	}
}
