package _51DSAndAlgo._1Programs;

public class ComputePower {

	public static void main(String[] args) {
		int num1 = 4, num2 = 2;
		int power = powerOfTwoNumbers(num1, num2);
		System.out.println(power);
	}

	private static int powerOfTwoNumbers(int num1, int num2) {
		int powerOfTwoNumbers = 1;
		for (int i = 1; i <= num2; i++) {
			powerOfTwoNumbers = powerOfTwoNumbers * num1;
		}
		return powerOfTwoNumbers;
	}

}
