package _1Programs;

public class AllPermutationOfString {
	static int count;
	static char[] charArray;// =new char[]{'A','B','C'};

	public static void main(String[] args) {
		String str = "ABC";
		charArray = str.toCharArray();
		// System.out.println(charArray);
		m1(0);
	}

	private static void m1(int startIndex) {
		if (startIndex == charArray.length - 1) {
			count++;
			System.out.print("count:" + count + " ");
			for (int i = 0; i <= charArray.length - 1; i++) {
				System.out.print(charArray[i]);
			}
			System.out.println();
		} else {
			for (int j = startIndex; j <= charArray.length - 1; j++) {
				char temp = charArray[startIndex];
				charArray[startIndex] = charArray[j];
				charArray[j] = temp;
				m1(startIndex + 1);
				temp = charArray[startIndex];
				charArray[startIndex] = charArray[j];
				charArray[j] = temp;
			}
		}
	}

}
