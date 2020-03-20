package _5RecursionIteration;

public class FibonnaciSequenceUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Febonacci sequence using recursion");
		int fibonnaciValue = fibonnaciValueUsingIteration(7);// 0 1 1 2 3 5 8 13
																// 21
		System.out.println(fibonnaciValue);

		for (int i = 1; i <= 3; i++) {
			fibonnaciValue = fibonnaciValueUsingRecursion(i);// 0 0 1 2 3 5 8 13
																// 21
			System.out.println("factorial of " + i + " is:" + fibonnaciValue);
		}
	}

	private static int fibonnaciValueUsingRecursion(int number) {
		if (number < 0) {
			return -1;// retunr error;
		}
		if ((number == 1) || (number == 2)) {
			return number - 1;
		}
		return fibonnaciValueUsingRecursion(number - 2) + fibonnaciValueUsingRecursion(number - 1);
	}

	private static int fibonnaciValueUsingIteration(int term) {
		int num1 = 0;
		int num2 = 1;

		int num = 0;
		for (int i = 1; i <= term - 2; i++) {
			num = num1 + num2;
			num1 = num2;
			num2 = num;
		}
		return num;
	}

}
