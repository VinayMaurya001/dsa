package _1Programs;

import java.util.Scanner;

public class LongestName {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		longestName(console, 3);
	}

	static void longestName(Scanner console, int n) {
		boolean isLengthTie = false;
		int maxLength = 0;
		String name = "";
		String longestName = "";
		for (int i = 1; i <= n; i++) {
			System.out.print("name #" + i + "? ");
			name = console.nextLine();
			if (maxLength <= name.length()) {
				if (maxLength == name.length()) {
					isLengthTie = true;
				} else {
					maxLength = name.length();
					longestName = name;
					isLengthTie = false;
				}
			}
		}
		longestName = longestName.substring(0, 1).toUpperCase() + longestName.substring(1).toLowerCase();
		System.out.println(longestName + "'s name is longest");
		if (isLengthTie) {
			System.out.println("(There was a tie!)");
		}
	}

}
