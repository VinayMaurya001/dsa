package _51DSAndAlgo._1Programs;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 7;

		boolean primeNumber = isPrimeNumber(number);
		System.out.println(number + " is prime number: " + primeNumber);
		primeNumber = isPrimeNumber2(number);
		System.out.println(number + " is prime number: " + primeNumber);
		primeNumber = isPrimeNumber3(number);
		System.out.println(number + " is prime number: " + primeNumber);

		int num1 = 10;
		int num2 = 20;
		int primeCount = primeNumbersInInterval(num1, num2);
		System.out.println("Total prime numbers: " + primeCount);
		num1 = 10;
		num2 = 20;
		primeCount = primeNumbersInInterval2(num1, num2);
		System.out.println("Total prime numbers: " + primeCount);
		num1 = 10;
		num2 = 20;
		primeCount = primeNumbersInInterval3(num1, num2);
		System.out.println("Total prime numbers: " + primeCount);
		num1 = 10;
		num2 = 20;
		primeCount = primeNumbersInInterval4(num1, num2);
		System.out.println("Total prime numbers: " + primeCount);
		num1 = 10;
		num2 = 20;
		primeCount = primeNumbersInInterval5(num1, num2);
		System.out.println("Total prime numbers: " + primeCount);
	}

	private static int primeNumbersInInterval(int num1, int num2) {
		int primeCount = 0;
		for (; num1 <= num2; num1++) {
			if (isPrimeNumber(num1)) {
				// if (isPrimeNumber2(num1)) {
				// if (isPrimeNumber3(num1)) {
				primeCount++;
				System.out.print(num1 + "\t");
			}
		}
		return primeCount;
	}

	private static int primeNumbersInInterval2(int num1, int num2) {
		int primeCount = 0;
		for (; num1 <= num2; num1++) {
			boolean isPrimeNumber = true;
			if (num1 == 1) {
				isPrimeNumber = false;
			}
			for (int i = 2; i < num1; i++) {
				if (num1 % i == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				primeCount++;
				System.out.print(num1 + "\t");
			}
		}
		return primeCount;
	}

	private static int primeNumbersInInterval3(int num1, int num2) {
		int primeCount = 0;
		for (; num1 <= num2; num1++) {

			boolean isPrimeNumber = false;
			for (int j = 2; j <= num1; j++) {
				if (j == num1) {
					isPrimeNumber = true;
				}
				if (num1 % j == 0) {
					break;
				}
			}

			if (isPrimeNumber) {
				primeCount++;
				System.out.print(num1 + "\t");
			}
		}
		return primeCount;
	}

	private static int primeNumbersInInterval4(int num1, int num2) {
		int primeCount = 0;
		for (; num1 <= num2; num1++) {
			for (int j = 2; j <= num1; j++) {
				if (j == num1) {
					primeCount++;
					System.out.print(num1 + "\t");
				}
				if (num1 % j == 0) {
					break;
				}
			}
		}
		return primeCount;
	}

	private static int primeNumbersInInterval5(int num1, int num2) {
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			for (int j = 2; j <= i; j++) {
				// System.out.println("i: " + i + " j: " + j);
				if (j == i) {
					System.out.print(i + "\t");
					count++;
				}
				if (i % j == 0) {
					break;
				}
			}
		}
		return count;
	}

	private static boolean isPrimeNumber2(int num) {
		boolean isPrimeNumber = false;
		for (int j = 2; j <= num; j++) {
			if (j == num) {
				isPrimeNumber = true;
			}
			if (num % j == 0) {
				break;
			}
		}
		return isPrimeNumber;
	}

	private static boolean isPrimeNumber3(int num) {
		boolean isPrimeNumber = false;
		int j = 0;
		for (j = 2; j < num; j++) {
			if (num % j == 0) {
				break;
			}
		}
		if (j == num) {
			isPrimeNumber = true;
		}
		return isPrimeNumber;
	}

	private static boolean isPrimeNumber(int number) {
		boolean isPrimeNumber = true;
		if (number == 1) {
			isPrimeNumber = false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		return isPrimeNumber;
	}

}
