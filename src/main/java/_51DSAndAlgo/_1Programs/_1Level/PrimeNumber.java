package _51DSAndAlgo._1Programs._1Level;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// m1();
		m2();

	}

	private static void m2() {
		System.out.println("Welcome to the prime factors calculator!");
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			// Prompt user for integer to find factors of and store the data
			System.out.println("Please input a number to factor...");
			int numToFactor = scan.nextInt();
			System.out.println("Prime factors of " + numToFactor + " are: ");
			/*
			 * Algorithm to check for prime factors (starting from 1 to the inputed number,
			 * if 'i' divides into the numToFactor without a remainder and isPrime returns
			 * true, 'i' is a prime factor of numToFactor)
			 */

			if (isPrime(numToFactor)) {
				System.out.println("1*" + numToFactor);
				System.exit(0);
			}
			for (int i = 2; i <= numToFactor; i++) {
				if ((numToFactor % i == 0) && (isPrime(i))) {
					// Keep dividing numToFactoe by i until it is divisible
					// and print i as prime factor each time it divides numToFactor
					while (numToFactor % i == 0) {
						numToFactor /= i;
						System.out.print(i);
						if (numToFactor != 1)
							System.out.print("*");
					}
				}
			}

		} catch (InputMismatchException ex) {
			System.out.println();
			System.err.println(
					"Please provide only numbers (no text). Also, please ensure your number is within the range of -2,147,483,648 to 2,147,483,647. Restart the program and try again!");
			main(new String[0]);
		} finally {
			scan.close();
		}
	}

	private static void m1() {
		int number = 1;
		boolean isPrime = isPrime(number);
		if (isPrime) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
