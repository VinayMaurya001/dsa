package _1Programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// char ch = '*';
		// int num1 = 4, num2 = 3;

		// int calculation = calculationbetweenTwoNumbers(num1, num2, ch);
		// System.out.println(num1 + " " + ch + " " + num2 + " = " +
		// calculation);
		Scanner sc = new Scanner(System.in);

		int enteredOperation = 0;
		do {
			System.out.println("Selecct one of the follwoing operations:");
			System.out.println("0: Exit");
			System.out.println("1: Addition");
			System.out.println("2: Substraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Division");
			System.out.println("5: Modulus");
			System.out.println("6: Square");
			enteredOperation = sc.nextInt();
			calculator(enteredOperation);
		} while (enteredOperation != 0);
		sc.close();
	}

	private static void calculator(int selection) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		switch (selection) {
		case 0:
			System.out.println("Thank You!");
			break;
		case 1:
			System.out.println("Please enter 2 numbers to add:");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Sum is: " + (num1 + num2) + "\n");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;

		}

	}

	private static int calculationbetweenTwoNumbers(int num1, int num2, char ch) {
		int num3 = 0;
		switch (ch) {
		case '+':
			num3 = num1 + num2;
			break;
		case '-':
			num3 = num1 - num2;
			break;
		case '*':
			num3 = num1 * num2;
			break;
		case '/':
			num3 = num1 / num2;
			break;
		case '%':
			num3 = num1 % num2;
			break;
		default:
			System.out.println("Invalid operator for simple calculator");
		}
		return num3;
	}

}
