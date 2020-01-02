package _1Programs;

public class NarcissiticNumber {

	public static void main(String[] args) {
		int num = 116;
		//boolean number = isNarcissiticNumber(num);
		//System.out.println(num + " is narcissitic number: " + number);

		int num1 = 10, num2 = 15;
		 int number2 = checkNarcissiticNumber2(num1, num2);
		// System.out.println(" narcissitic numbers: " + number2);

		// number2 = checkNarcissiticNumber3(num1, num2);
		// System.out.println(" narcissitic numbers3:" + number2);
	}

	private static int narcissiticNumberInInterval2(int number, int num2) {
		int totalNarcissiticNumber = 0;
		boolean isNarcissitic = false;
		int tempNumber = number;
		int count = 0;
		int digit = 0;
		int narcissiticNumber = 0;
		for (; number <= num2; number++) {
			isNarcissitic = false;
			tempNumber = number;
			count = 0;
			digit = 0;
			narcissiticNumber = 0;
			for (; tempNumber > 0; tempNumber = tempNumber / 10) {
				count++;
			}
			tempNumber = number;
			for (; tempNumber > 0; tempNumber = tempNumber / 10) {
				digit = tempNumber % 10;
				narcissiticNumber = narcissiticNumber + (int) Math.pow(digit, count);
			}
			System.out.println("narcissiticValue is: " + narcissiticNumber);
			if (narcissiticNumber == number) {
				isNarcissitic = true;
			}
			if (isNarcissitic) {
				totalNarcissiticNumber++;
				System.out.print(number + ", ");
			}
		}
		return totalNarcissiticNumber;
	}

	private static int narcissiticNumberInInterval(int num1, int num2) {
		int totalNarcissiticNumber = 0;
		for (; num1 <= num2; num1++) {
			if (isNarcissiticNumber(num1)) {
				totalNarcissiticNumber++;
				System.out.print(num1 + ", ");
			}
		}
		return totalNarcissiticNumber;
	}

	private static int checkNarcissiticNumber2(int num1, int num2) {
		int totalNarcissiticNumber = 0;
		for (num1 = 1; num1 <= num2; num1++) {
			int actualNumbers = num1, count = 0, digit = 0;// number b/w 1 to 20
			for (; actualNumbers > 0;) {
				System.out.print("actualNumbers: " + actualNumbers);
				actualNumbers = actualNumbers / 10;
				count++;
				System.out.println(" and count: " + count);

			}
			int tempOfTempNumber = num1;
			int narcissiticNumber = 0;
			System.out.println("count: " + count);

			for (; tempOfTempNumber > 0; tempOfTempNumber = tempOfTempNumber / 10) {
				digit = tempOfTempNumber % 10;
				narcissiticNumber = narcissiticNumber + (int) Math.pow(digit, count);
			}
			System.out.println("narcissiticValue is: " + narcissiticNumber);
			System.out.println("*******************************");
			if (narcissiticNumber == actualNumbers) {
				totalNarcissiticNumber++;
				System.out.println("hi");
			}
		}
		return totalNarcissiticNumber;
	}

	private static boolean isNarcissiticNumber(int number) {
		boolean isNarcissitic = false;
		int tempNumber = number;
		int count = 0;
		int digit = 0;
		int narcissiticNumber = 0;
		for (; tempNumber > 0; tempNumber = tempNumber / 10) {
			count++;
		}
		tempNumber = number;
		for (; tempNumber > 0; tempNumber = tempNumber / 10) {
			digit = tempNumber % 10;
			narcissiticNumber = narcissiticNumber + (int) Math.pow(digit, count);
		}
		System.out.println("narcissiticValue is: " + narcissiticNumber);
		if (narcissiticNumber == number) {
			isNarcissitic = true;
		}
		return isNarcissitic;
	}

}
