package _51DSAndAlgo._1Programs._1Level;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		float temperature = 100;
		double celsius = convertTemperatureToCelsius(temperature);
		System.out.println("Temperature " + temperature + " in Celsius: " + celsius);
	}

	private static double convertTemperatureToCelsius(float temperature) {
		double valueInCelsius = 0;
		valueInCelsius = ((temperature - 32) * 5) / 9;

		return valueInCelsius;
	}

}
