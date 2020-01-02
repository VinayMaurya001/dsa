package _1Programs._1Level;

import java.util.Scanner;

public class FindLargestOfThreeNumbers {

	public static void main(String[] args) {
		getLargestNumber();
	}

	private static void getLargestNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		if (number1 > number2 && number1 > number3) {
			System.out.println("Largest number is: " + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("Largest number is: " + number2);
		} else if (number3 > number1 && number3 > number2) {
			System.out.println("Largest number is: " + number3);
		}
		scanner.close();
	}

}
