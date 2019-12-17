package _51DSAndAlgo._1Programs._1Level;

public class FibonacciSeries {

	public static void main(String[] args) {
		int maxNumber = 9;
		getFibonacciSeries(maxNumber);
	}

	private static void getFibonacciSeries(int maxNumber) {
		int number = 1;
		int temp = 0;
		for (int i = 1; i <= maxNumber; i++) {
			int sum = 0;
			if (i == 1) {
				number = 1;
			} else {
				sum = number + temp;
				temp = number;
				number = sum;
			}
			System.out.println(number);
		}
	}

}
