package _1Programs._1Level;

public class CircleAreaAndCircumference {

	public static void main(String[] args) {
		int radiusOfCircle = 5;
		double area = getCircleArea(radiusOfCircle);
		System.out.println("Area Of a circle: " + area);
		double circumference = getCircleCircumference(radiusOfCircle);
		System.out.println("Circumference Of a circle: " + circumference);
	}

	private static double getCircleCircumference(int radiusOfCircle) {
		return Math.PI * (radiusOfCircle * radiusOfCircle);
	}

	private static double getCircleArea(int radiusOfCircle) {
		return (2 * Math.PI) * radiusOfCircle;
	}

}
