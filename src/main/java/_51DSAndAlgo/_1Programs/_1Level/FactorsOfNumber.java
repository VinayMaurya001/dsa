package _51DSAndAlgo._1Programs._1Level;

public class FactorsOfNumber {
	public static void main(String[] args) {
		getFactorsFromOneToHundred();
	}

	private static void getFactorsFromOneToHundred() {
		for (int i = 1; i <= 100; i++) {
			System.out.print("Factors of " + i + ": ");
			for (int j = 1; j <= i; j++) {
				if(i%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}
}
