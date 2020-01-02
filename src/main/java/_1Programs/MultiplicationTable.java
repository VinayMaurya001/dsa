package _1Programs;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number = 3;
		multiplicationTableOfANumber(number);
	}

	private static void multiplicationTableOfANumber(int number) {
		int multiplication = 0;
		for (int i = 1; i <= 10; i++) {
			multiplication = multiplication + number * 1;
			System.out.println(number + " * " + i + " = " + multiplication);
		}
	}

}
