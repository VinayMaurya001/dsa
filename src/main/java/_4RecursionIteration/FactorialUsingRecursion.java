package _4RecursionIteration;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Factorial of given number using recursion");
		int number = 5;
		int numberFactorial = factorialofNumber(number);
		System.out.println("Factorial of "+number+" : "+numberFactorial);
		numberFactorial = factorialofNumber2(number);
		System.out.println("Factorial of "+number+" : "+numberFactorial);
	}

	private static int factorialofNumber(int number) {
		if ((number == 0) || (number == 1)) {
			return 1;
		}
		return number * factorialofNumber(number - 1);
	}
	private static int factorialofNumber2(int number) {
		if(number<0) {
			return -1;
		}
		if ((number == 0) || (number == 1)) {
			return 1;
		}
		return number * factorialofNumber(number - 1);
	}
}
