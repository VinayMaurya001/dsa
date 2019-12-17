package _51DSAndAlgo._1Programs;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num1 = 9;
		String evenOrOddNumber = evenOrOddNumber(num1);
		System.out.println(evenOrOddNumber);
	}

	private static String evenOrOddNumber(int num1) {
		if (num1 % 2 == 0) {
			return "Even number";
		} else {
			return "Odd number";
		}
	}

}
