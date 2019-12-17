package _51DSAndAlgo._1Programs;

public class CalculatePower {

	public static void main(String[] args) {
		int num1 = 4, num2 = 3;
		int powerOfANumber = getPowerOfANumber(num1, num2);
		System.out.println("Power of a number: " + powerOfANumber);

		int powerOfANumber1 = getPowerOfANumber2(num1, num2);
		System.out.println("Power of a number2: " + powerOfANumber1);

		powerOfANumber1 = getPowerOfANumber3(num1, num2);
		System.out.println("Power of a number2: " + powerOfANumber1);

	}

	private static int getPowerOfANumber3(int num1, int num2) {
		if (num2 == 0) {
			return 1;
		}
		return num1 * getPowerOfANumber3(num1, num2 - 1);
	}

	private static int getPowerOfANumber2(int num1, int num2) {
		int powerOfANumber = 1;
		if ((num1 <= 0) || (num1 <= 0)) {
			return -1;
		} else if (num2 == 0) {
			return 1;
		} else {
			for (int i = 1; i <= num2; i++) {
				powerOfANumber = powerOfANumber * (num1);
			}
			return powerOfANumber;
		}
	}

	private static int getPowerOfANumber(int num1, int num2) {
		int powerOfANumber = 1;
		for (int i = 1; i <= num2; i++) {
			powerOfANumber = powerOfANumber * (num1);
		}
		return powerOfANumber;
	}

}
