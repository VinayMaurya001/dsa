package _1Programs._1Level;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		int term = 3;
		int sumOfNumbers = sum1(term);
		System.out.println("Sum of first " + term + " natural numbers:" + sumOfNumbers);
		sumOfNumbers = sum2(term);
		System.out.println("Sum of first " + term + " natural numbers:" + sumOfNumbers);
		sumOfNumbers = sum3(term);
		System.out.println("Sum of first " + term + " natural numbers:" + sumOfNumbers);
		sumOfNumbers = sum4(term);
		System.out.println("Sum of first " + term + " natural numbers:" + sumOfNumbers);

	}

	private static int sum1(int term) {// c1
		return (term * (term + 1)) / 2;
	}

	private static int sum2(int term) {
		if (term == 1) {
			return 1;
		}
		return (term + sum2(term - 1));
	}

	private static int sum3(int term) {// c2n+c3
		int sumOfNumbers = 0;
		for (int i = 1; i <= term; i++) {
			sumOfNumbers = sumOfNumbers + i;
		}
		return sumOfNumbers;
	}

	private static int sum4(int term) {// c4n^2+c5n+c6
		int sumOfNumbers = 0;
		for (int i = 1; i <= term; i++) {
			for (int j = 1; j <= i; j++) {
				sumOfNumbers++;
			}
		}
		return sumOfNumbers;
	}

}
