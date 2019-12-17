package _51DSAndAlgo._4RecursionIteration;

public class FibonnaciSequenceUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Febonacci sequence using recursion");
		int fibonnaciValue = fibonnaciValue(7);// 1 1 2 3 5 8 13 21
		System.out.println(fibonnaciValue);

		for (int i = 1; i <= 3; i++) {
			fibonnaciValue = fibonnaciValueOfNumber0(i);// 0 1 2 3 5 8 13 21
			System.out.println("factorial of " + i + " is:" + fibonnaciValue);
		}
	}

	private static int fibonnaciValueOfNumber0(int number) {
		if (number < 0) {
			return -1;//retunr error;
		}
		if ((number == 1) || (number == 2)) {
			return number - 1;
		}
		return fibonnaciValueOfNumber0(number - 2) + fibonnaciValueOfNumber0(number - 1);
	}

	private static int fibonnaciValue(int term) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for (int i = 1; i <= term - 2; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		return num3;
	}

}
