package _1Programs;

public class AdditionSubtraction {

	public static void main(String[] args) {
		int num1 = 4, num2 = 2;
		int addition = additionOfTwoNumbers(num1, num2);
		System.out.println(addition);
		addition = additionOfTwoNumbers2(num1, num2);
		System.out.println(addition);
		addition = additionOfTwoNumbers3(num1, num2);
		System.out.println(addition);

		int subtraction = subtractionOfTwoNumbers(num1, num2);
		System.out.println("subtraction: "+subtraction);
	}

	private static int subtractionOfTwoNumbers(int num1, int num2) {
		int subtraction = num1;
		for (int i = 1; i <= num2; i++) {
			subtraction = subtraction - 1;
		}
		return subtraction;
	}

	private static int additionOfTwoNumbers(int num1, int num2) {
		int add = num1;
		int i = 1;
		for (i = 1; i <= num2; i++) {
			add = add + 1;
		}
		return add;
	}

	private static int additionOfTwoNumbers2(int num1, int num2) {
		int add = num1;
		int i = 1;
		for (i = 1; i <= num2; i++) {
			add = add + 2;
			add--;
		}
		return add;
	}

	private static int additionOfTwoNumbers3(int num1, int num2) {
		int add = num1;
		int i = 1;
		for (i = 1; i <= num2 / 2; i++) {
			add = add + 2;
		}
		if (num2 % 2 != 0) {
			add++;
		}
		return add;
	}

}
