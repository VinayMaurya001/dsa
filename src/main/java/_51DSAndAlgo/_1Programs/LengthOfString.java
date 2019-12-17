package _51DSAndAlgo._1Programs;

public class LengthOfString {

	public static void main(String[] args) {
		String string = "hello";
		int stringLength = computeLengthOfString(string);
		System.out.println("stringLength: " + stringLength);

		int stringLength2 = computeLengthOfString2(string);
		System.out.println("stringLength2: " + stringLength2);

		int stringLength3 = computeLengthOfString3(string);
		System.out.println("stringLength3: " + stringLength3);
		stringLength3 = computeLengthOfString03(string);
		System.out.println("stringLength3: " + stringLength3);

	}

	private static int computeLengthOfString03(String string) {
		int i = 0;
		if (string.equals("")) {
			return 0;
		}
		for (;;) {
			i++;
			if (string.substring(i).equals("")) {
				break;
			}
		}
		return i;
	}

	private static int computeLengthOfString3(String string) {
		int i = 0;
		if (string.equals("")) {
			return 0;
		}
		for (; !string.substring(i).equals(""); i++) {
		}
		return i;
	}

	private static int computeLengthOfString2(String string) {
		int i = 0;
		for (; i < string.length(); i++) {
		}
		return i;
	}

	private static int computeLengthOfString(String string) {
		int stringLength = 0;
		stringLength = string.length();
		return stringLength;
	}

}
