package _1Programs._1Level;

public class CharacterCountInEachWord {

	public static void main(String[] args) {
		String str = "Hello world";
		getEachWordCount(str);
	}

	private static void getEachWordCount(String str) {
		char[] characterArray = str.toCharArray();
		for (int i = 0; i < characterArray.length; i++) {
			String s = "";
			while (i < characterArray.length && characterArray[i] != ' ') {
				s = s + characterArray[i];
				i++;
			}
			if (s.length() > 0) {
				System.out.println(s + " ->" + s.length());
			}
		}
	}
}
