package _1Programs._1Level;

public class PrintAndSumUptoTenWithoutLoop {

	public static void main(String[] args) {
		int minValue = 1;
		int maxValue = 10;
		printNumbersUptoTen(minValue);
		System.out.println();
		printNumbersTentoOne(maxValue);
		System.out.println();
		int number = 10;
		int sumOfNumbers = sumOfOneToTen(number);
		System.out.println("Sum of numbers: " + sumOfNumbers);
	}

	private static int sumOfOneToTen(int number) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

	private static void printNumbersTentoOne(int rangeNumber) {
		if (rangeNumber >= 1) {
			System.out.print(rangeNumber + " ");
			printNumbersTentoOne(rangeNumber - 1);
		}
	}

	private static void printNumbersUptoTen(int rangeNumber) {
		if (rangeNumber <= 10) {
			System.out.print(rangeNumber + " ");
			printNumbersUptoTen(rangeNumber + 1);
		}
	}

}
