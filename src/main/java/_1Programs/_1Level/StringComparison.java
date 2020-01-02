package _1Programs._1Level;

public class StringComparison {

	public static void main(String[] args) {
		String str1 = "Sandeep";
		String str2 = "Shyam";
		boolean isCompare = stringsComparison(str1, str2);
		if (isCompare) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both Strings are not equal");
		}
	}

	private static boolean stringsComparison(String str1, String str2) {
		boolean isEqualString = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				isEqualString = false;
				break;
			} else {
				isEqualString = true;
			}
		}
		return isEqualString;
	}
}
