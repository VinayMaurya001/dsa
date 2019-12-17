package _51DSAndAlgo._1Programs;

public class SwappingTwoNumber {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		swappingOfTwoNUmbers(num1, num2);
		swappingOfTwoNUmbers2(num1, num2);// Another way
		swappingOfTwoNUmbers3(num1, num2);// Modify for <0
		//Using class & reference
	}

	private static void swappingOfTwoNUmbers(int num1, int num2) {
		System.out.println("Before swapping: " + num1 + "  " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping: " + num1 + "  " + num2);
	}

	private static void swappingOfTwoNUmbers2(int num1, int num2) {
		System.out.println("Before swapping: " + num1 + "  " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping: " + num1 + "  " + num2);
	}

	private static void swappingOfTwoNUmbers3(int num1, int num2) {
		System.out.println("Before swapping: " + num1 + "  " + num2);
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		System.out.println("After swapping: " + num1 + "  " + num2);
	}
}
