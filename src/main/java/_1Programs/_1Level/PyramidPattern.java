package _1Programs._1Level;

public class PyramidPattern {

	public static void main(String[] args) {
		int row = 5;
		getPyramidPattern(row);
	}

	private static void getPyramidPattern(int row) {
		System.out.println("Pyramid Patternn:");
		for (int i = 1; i <= row; i++) {
			int number = 1;
			for (int j = (row + 1) - i; j >= 1; j--, number++) {
				System.out.print(number);
			}
			System.out.println();
		}
	}
}
