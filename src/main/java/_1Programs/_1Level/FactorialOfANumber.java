package _1Programs._1Level;

import java.math.BigInteger;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int number = 12;
		int factorial = getFactorial(number);
		System.out.println("Factorial of " + number + " is " + factorial);

		Integer number2 = new Integer(12);
		Integer factorial2 = getFactorial2(number2);
		System.out.println("Factorial of " + number2 + " is " + factorial2);

		int number3 = 12;
		BigInteger factorial3 = getFactorial3(number3);
		System.out.println("Factorial of " + number3 + " is " + factorial3);
	}

	private static BigInteger getFactorial3(int number) {
		BigInteger fact = new BigInteger("1");// .ONE;
		if (number < 0) {
			fact = new BigInteger("-1");
		} else if (number == 0) {
			fact = BigInteger.ONE;
		} else {
			for (int i = 1; i <= number; i++) {
				fact = fact.multiply(BigInteger.valueOf(i));
			}
		}
		return fact;
	}

	private static Integer getFactorial2(Integer number) {
		Integer fact = 1;
		if (number < 0) {
			fact = -1;
		} else if (number == 0) {
			fact = 1;
		} else {
			for (int i = 1; i <= number; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}

	private static int getFactorial(int number) {
		int fact = 1;
		if (number < 0) {
			fact = -1;
		} else if (number == 0) {
			fact = 1;
		} else {
			for (int i = 1; i <= number; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}
}
