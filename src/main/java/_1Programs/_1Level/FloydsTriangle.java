package _1Programs._1Level;

public class FloydsTriangle {

	public static void main(String[] args) {
		int row = 4;
		getFloydsTriangle(row);
	}

	private static void getFloydsTriangle(int row) {
		int number = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				number++;
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}
}
