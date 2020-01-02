package _5RecursionIteration;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int gcdOfTwoNumbers = 0;
		System.out.println("Two positive integers");
		System.out.println("Enter first positive integers: ");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		System.out.println("Enter second positive integers: ");
		int number2 = scanner.nextInt();

		gcdOfTwoNumbers = gcdOfTwoNumbers(number1, number2);
		System.out.println("gcd of two numbers: " + gcdOfTwoNumbers);
		scanner.close();
	}

	private static int gcdOfTwoNumbers(int number1, int number2) {
		if (number1 == number2) {
			return number1;
		}
		if ((number1 % number2) == 0) {
			return number2;
		}
		if ((number2 % number1) == 0) {
			return number1;
		}
		if (number2 > number1) {
			return gcdOfTwoNumbers(number2 % number1, number1);
		} else {
			return gcdOfTwoNumbers(number2, number1 % number2);
		}
	}
}
