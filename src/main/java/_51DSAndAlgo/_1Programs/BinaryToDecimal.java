package _51DSAndAlgo._1Programs;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int binaryNumber = 0b1010;
		int binaryNumber2 = 1010;
		int numberIndecimal = computeBinaryToDecimal(binaryNumber);
		System.out.println(binaryNumber + " in decimal: " + numberIndecimal);
		numberIndecimal = computeBinaryToDecimal2(binaryNumber2);
		// System.out.println(binaryNumber2 + " in decimal: " +
		// numberIndecimal);

		int decimalNumber = 27;
		int binaryNumber3 = decimalToBinary(decimalNumber);
		System.out.println("Binary value of " + decimalNumber + " is: " + binaryNumber3);
	}

	private static int decimalToBinary(int decimalNumber) {
		int tempDecimalNumber = decimalNumber;
		String binaryString = "";
		for (; tempDecimalNumber > 0; tempDecimalNumber = tempDecimalNumber / 2) {
			int digit = tempDecimalNumber % 2;
			binaryString = digit + binaryString;
		}
		return Integer.parseInt(binaryString);
	}

	private static int computeBinaryToDecimal(int binaryNumber) {
		return binaryNumber;
	}

	private static int computeBinaryToDecimal2(int binaryNumber) {
		int decimalNumber = 0;
		int digit = 0;
		for (int i = 0; binaryNumber > 0; binaryNumber = binaryNumber / 10, i++) {
			digit = binaryNumber % 10;
			System.out.println("digit: " + digit);
			decimalNumber = decimalNumber + (digit * (int) Math.pow(2, i));
		}
		return decimalNumber;
	}

}
