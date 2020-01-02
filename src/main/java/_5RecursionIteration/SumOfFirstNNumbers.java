package _5RecursionIteration;

public class SumOfFirstNNumbers {
	public static void main(String[] args) {
		int k;
		k = sum(3);
		System.out.println("Sum of natural number using recursion: " + k);
	}

	private static int sum(int i) {
		int s = 0;
		if (i == 1) {
			return 1;
		}else{
		s = i + sum(i - 1);}
		return s;
	}
}
