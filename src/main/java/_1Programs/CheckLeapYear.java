package _1Programs;

public class CheckLeapYear {

	// LY: 1976,1600
	// NLY: 1970,1900
	public static void main(String[] args) {
		int year = 1600;
		System.out.println("year " + year + " is leap year: " + isLeapYear4(year));
		year = 1900;
		System.out.println("year " + year + " is leap year: " + isLeapYear4(year));
		year = 1976;
		System.out.println("year " + year + " is leap year: " + isLeapYear4(year));
		year = 1979;
		System.out.println("year " + year + " is leap year: " + isLeapYear4(year));

	}

	private static boolean isLeapYear4(int year) {
		boolean leapYear = false;
		if ((year % 4 == 0)) {
			if ((year % 400 == 0)) {
				leapYear = true;
			} else if ((year % 100 != 0)) {
				leapYear = true;
			}
		}
		return leapYear;
	}

	private static boolean isLeapYear3(int year) {
		return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
	}

	private static boolean isLeapYear2(int year) {
		boolean leapYear = false;
		if ((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))) {
			leapYear = true;
		}
		return leapYear;
	}

	private static boolean isLeapYear(int year) {
		boolean leapYear = false;
		if ((year % 400 == 0)) {
			leapYear = true;
		} else if ((year % 100 == 0)) {
			leapYear = false;
		} else if ((year % 4 == 0)) {
			leapYear = true;
		}
		return leapYear;
	}

}
