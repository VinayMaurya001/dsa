package _1Programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;// 1,153,370,371,... armstrong numbers
		boolean number = isArmStrongNumber(num);
		System.out.println(num + " is armstring number: " + number);

		int num1 = 1, num2 = 372;
		int totalArmstrongNumbers = armstrongNumbersInInterval(num1, num2);
		System.out.println("Total armstrong numbers: " + totalArmstrongNumbers);
		num1 = 1;
		num2 = 372;
		totalArmstrongNumbers = armstrongNumbersInInterval2(num1, num2);
		System.out.println("Total armstrong numbers: " + totalArmstrongNumbers);
		num1 = 1;
		num2 = 372;
		totalArmstrongNumbers = armstrongNumbersInInterval3(num1, num2);
		System.out.println("Total armstrong numbers: " + totalArmstrongNumbers);

	}

	private static boolean isArmStrongNumber(int number) {
		boolean isArmStrong = false;
		int armStrongNumber = 0;
		int tempNumber = number;
		for (; tempNumber > 0; tempNumber = tempNumber / 10) {
			int digit = tempNumber % 10;
			armStrongNumber = armStrongNumber + (int) Math.pow(digit, 3);
		}
		if (armStrongNumber == number) {
			isArmStrong = true;
		}
		return isArmStrong;
	}

	private static int armstrongNumbersInInterval(int num1, int num2) {
		int totalArmstrongNumbers = 0;
		for (; num1 <= num2; num1++) {
			if (isArmStrongNumber(num1)) {
				totalArmstrongNumbers++;
				System.out.print(num1 + "\t");
			}
		}
		return totalArmstrongNumbers;
	}

	private static int armstrongNumbersInInterval2(int num1, int num2) {
		int totalArmstrongNumbers = 0;
		for (; num1 <= num2; num1++) {
			boolean isArmStrong = false;
			int armStrongNumber = 0;
			int tempNumber = num1;
			for (; tempNumber > 0; tempNumber = tempNumber / 10) {
				int digit = tempNumber % 10;
				armStrongNumber = armStrongNumber + (int) Math.pow(digit, 3);
			}
			if (armStrongNumber == num1) {
				isArmStrong = true;
			}
			if (isArmStrong) {
				totalArmstrongNumbers++;
				System.out.print(num1 + "\t");
			}
		}
		return totalArmstrongNumbers;
	}

	private static int armstrongNumbersInInterval3(int num1, int num2) {
		int totalArmstrongNumbers = 0;
		int armStrongNumber = 0;
		int digit = 0;
		int tempNumber = 0;
		for (; num1 <= num2; num1++) {
			armStrongNumber = 0;
			tempNumber = num1;
			digit = 0;
			for (; tempNumber > 0; tempNumber = tempNumber / 10) {
				digit = tempNumber % 10;
				armStrongNumber = armStrongNumber + (int) Math.pow(digit, 3);
			}
			if (armStrongNumber == num1) {
				totalArmstrongNumbers++;
				System.out.print(num1 + "\t");
			}
		}
		return totalArmstrongNumbers;
	}
}
