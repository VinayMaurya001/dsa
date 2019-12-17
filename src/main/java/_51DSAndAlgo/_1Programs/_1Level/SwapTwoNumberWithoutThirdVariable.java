package _51DSAndAlgo._1Programs._1Level;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int number1 = 40;
		int number2 = 50;
		getSwappedNumbers(number1, number2);
	}

	private static void getSwappedNumbers(int number1, int number2) {
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println(number1 + " " + number2);
	}

}
