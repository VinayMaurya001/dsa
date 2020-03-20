package _5RecursionIteration;

public class RecusrionInternally {

	public static void main(String[] args) {

		m1();
		System.out.println("I am in main()");
		//foo(3);
		//foo2(3);

	}

	private static void m1() {
		m2();
		System.out.println("I am in m1()");

	}

	private static void m2() {
		m3();
		System.out.println("I am in m2()");

	}

	private static void m3() {
		System.out.println("I am in m3()");
	}

	private static void foo(int num) {
		if (num < 1) {
			return;
		} else {
			foo(num - 1);
		}
		System.out.println("Hello World " + num);
	}

	private static void foo2(int num) {
		if (num < 1) {
			return;
		} else {
			foo(num - 1);
		}
		System.out.println("Hello World " + num);
	}

}
