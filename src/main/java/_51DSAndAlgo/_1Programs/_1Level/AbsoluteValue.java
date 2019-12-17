package _51DSAndAlgo._1Programs._1Level;

public class AbsoluteValue {

	public static void main(String[] args) {
		int absoluteValue = 0;
		for (int i = Integer.MIN_VALUE +1; i <= Integer.MAX_VALUE; i++) {
			absoluteValue = absolute(i);
			assert (absoluteValue >= 0) : "absoluteValue can not be negative";
			if (i % 10 == 0) {
				System.out.println(absoluteValue);
			}
		}
	}

	public static int absolute(int I) {
		int absoluteValue = I;
		if (I < 0) {
			absoluteValue *= -1;
		}
		return absoluteValue;
	}
}
