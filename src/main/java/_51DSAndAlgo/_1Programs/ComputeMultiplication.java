package _51DSAndAlgo._1Programs;

public class ComputeMultiplication {

	public static void main(String[] args) {
		int num1 = 2, num2 = 3, num3 = 4, num4 = 5;
		int multiplication = multiplicationOfTwoNumber(num1, num2);
		System.out.println(multiplication);

		multiplication = multiplicationOfThreeNumber(num1, num2, num3);
		System.out.println(multiplication);
		multiplication = multiplicationOfThreeNumber2(num1, num2, num3);
		System.out.println(multiplication);
		multiplication = multiplicationOfFourNumber(num1, num2, num3, num4);
		System.out.println(multiplication);
		multiplication = multiplicationOfFourNumber2(num1, num2, num3, num4);
		System.out.println("multiplicationOfFourNumber2:" + multiplication);

	}

	private static int multiplicationOfFourNumber(int num1, int num2, int num3, int num4) {
		int multiplication = 0;
		for (int i = 1; i <= num1; i++) {
			int temp = 0;
			for (int j = 1; j <= num2; j++) {
				int temp1 = 0;
				for (int k = 0; k < num3; k++) {
					temp1 = temp1 + num4;
				}
				temp = temp + temp1;
			}
			multiplication = multiplication + temp;
		}
		return multiplication;
	}

	private static int multiplicationOfFourNumber2(int num1, int num2, int num3, int num4) {
		int multiplication = 0;
		int temp = 0, temp1 = 0;
		for (int i = 1; i <= num1; i++) {
			temp1 = temp1 + num2;
		}
		for (int j = 1; j <= num3; j++) {
			temp = temp + temp1;
		}
		for (int k = 1; k <= num4; k++) {
			multiplication = multiplication + temp;
		}
		return multiplication;
	}

	private static int multiplicationOfThreeNumber(int num1, int num2, int num3) {
		int multiplication = 0;
		int count = 0;
		for (int i = 1; i <= num2; i++) {
			int temp = 0;
			for (int j = 1; j <= num1; j++) {
				temp = temp + num3;
				count++;
			}
			multiplication = multiplication + temp;
		}
		System.out.println("1 " + count);
		return multiplication;
	}

	private static int multiplicationOfThreeNumber2(int num1, int num2, int num3) {
		int multiplication = 0;
		int firstTwo = 0;
		int count = 0;

		for (int i = 1; i <= num2; i++) {
			firstTwo = firstTwo + num1;
			count++;

		}
		for (int j = 1; j <= num3; j++) {
			count++;
			multiplication = multiplication + firstTwo;
		}
		System.out.println("2 " + count);

		return multiplication;
	}

	private static int multiplicationOfTwoNumber(int num1, int num2) {
		int multiplication = 0;
		for (int i = 1; i <= num2; i++) {
			multiplication = multiplication + num1;
		}
		return multiplication;
	}

}
