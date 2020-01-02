package _1Programs._1Level;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int multiplication = 1;
		int n = args.length;
		System.out.println("1. Sum");
		System.out.println("2. Average");
		System.out.println("3. Multiplication");
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();

		System.out.println("Enter numbers(seperate with comma) to perform operation");
		Scanner scanner2 = new Scanner(System.in);
		String inputNumbers = scanner2.next();
		String[] numbers = inputNumbers.split(",");
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + Integer.parseInt(numbers[i]);
		}

		switch (choice) {
		case 1:
			System.out.println("Sum is: " + sum);
			break;
		case 2:
			System.out.println("Average is: " + sum / numbers.length);
			break;
		case 3:
			for (String str : numbers) {
				multiplication = multiplication * Integer.parseInt(str);
			}
			System.out.println("Multiplicationis is: " + multiplication);
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

}
