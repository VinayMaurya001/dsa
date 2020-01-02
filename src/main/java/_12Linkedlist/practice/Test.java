package _12Linkedlist.practice;

public class Test {

	// sum(n): Algorithm to add first n natural numbers. Assume s is a variable
	// initialized to 0.
	// 1. if n<=0 return -1
	// 2. repeat step 3 and 4 while n!=0
	// 3. s=s+n
	// 4. [decrement n]n--
	// 5. return s
	//
	// sum(n): Algorithm to add first n natural numbers. Assume s is a variable
	// initialized to 0 & i is a variable initialized to 1.
	// 1. if n<=0 return -1
	// 2. repeat step 3 and 4 while i<=n
	// 3. s=s+i
	// 4. [increment i]i++
	// 5. return s

	public static void main(String[] args) {
		int sum = addNaturalNumbers(3);
		System.out.println(sum);
		sum = addNaturalNumbers0(3);
		System.out.println(sum);
		sum = addNaturalNumbers00(3);
		System.out.println(sum);

		int sum2 = addNaturalNumbers2(3);
		System.out.println(sum2);
		sum2 = addNaturalNumbers20(3);
		System.out.println(sum2);
		sum2 = addNaturalNumbers200(3);
		System.out.println(sum2);

		int sum3 = addNaturalNumbers3(10);
		System.out.println(sum3);
	}

	private static int addNaturalNumbers3(int num3) {
		if (num3 <= 0) {
			return -1;
		}
		if (num3 == 1) {
			return 1;
		}
		return num3 + addNaturalNumbers3(num3 - 1);
	}

	private static int addNaturalNumbers2(int num2) {
		int s = 0;
		int i = 1;
		if (num2 <= 0) {
			return -1;
		}
		while (i <= num2) {
			s = s + i;
			i++;
		}
		return s;
	}

	private static int addNaturalNumbers20(int num2) {
		int s = 0;
		int i = 1;
		if (num2 <= 0) {
			return -1;
		}
		for (; i <= num2;) {
			s = s + i;
			i++;
		}
		return s;
	}

	private static int addNaturalNumbers200(int num2) {
		int s = 0;
		int i = 1;
		if (num2 <= 0) {
			return -1;
		}
		do {
			s = s + i;
			i++;
		} while (i <= num2);
		return s;
	}

	private static int addNaturalNumbers(int num) {
		int s = 0;
		if (num <= 0) {
			return -1;
		}
		while (num != 0) {
			s = s + num;
			num--;
		}
		return s;
	}

	private static int addNaturalNumbers0(int num) {
		int s = 0;
		if (num <= 0) {
			return -1;
		}
		for (; num != 0;) {
			s = s + num;
			num--;
		}
		return s;
	}

	private static int addNaturalNumbers00(int num) {
		int s = 0;
		if (num <= 0) {
			return -1;
		}
		do {
			s = s + num;
			num--;
		} while (num != 0);
		return s;
	}

}
