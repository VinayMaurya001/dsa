package _51DSAndAlgo._1Programs;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		int num1 = 8, num2 = 2;
		int quotient = computeQuotient(num1, num2);
		System.out.println(quotient);
		quotient = computeQuotient2(num1, num2);
		System.out.println(quotient);
		quotient = computeQuotient3(num1, num2);// without using / Operator
		System.out.println(quotient);
		quotient = computeQuotient4(num1, num2);// without using / Operator
		System.out.println(quotient);

		int remainder = getRemainder(num1, num2);
		System.out.println(remainder);

		displayQuotientAndRemainder(num1, num2);
	}

	private static void displayQuotientAndRemainder(int num1, int num2) {
		int quotient = 0, remainder = 0;
		int temp = num1;
		for (; temp >= num2;) {
			temp = temp - num2;
			quotient++;
		}
		System.out.println("quotient: " + quotient);
		remainder = num1 - quotient * num2;
		System.out.println("remainder: " + remainder);

	}

	private static int computeQuotient3(int num1, int num2) {
		int count = 0;
		int temp = num1;
		for (; temp >= num2;) {
			temp = temp - num2;
			// System.out.println(num1 + " " + num2 + " " + count + " " + temp);
			count++;
		}
		return count;
	}

	private static int computeQuotient4(int num1, int num2) {
		int count = 1;
		for (; (num1 = num1 - num2) >= num2;) {
			// System.out.println(num1+" "+num2+" "+count);
			count++;
		}
		return count;
	}

	private static int computeQuotient2(int num1, int num2) {
		return num1 / num2;
	}

	private static int computeQuotient(int num1, int num2) {
		int quotient = 0;
		quotient = num1 / num2;
		return quotient;
	}

	private static int getRemainder(int num1, int num2) {
		int quotient = 0, remainder = 0;
		quotient = num1 / num2;
		remainder = num1 - quotient * num2;
		return remainder;
	}
}
