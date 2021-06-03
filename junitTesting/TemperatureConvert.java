package junitTesting;

import java.util.Scanner;
import util.Temperature;

public class TemperatureConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the option 1: Celsius to Fahrenheit 2: Fahrenheit to Celsius");
		int option = scanner.nextInt();
		
		System.out.println("Enter the temperature in Celsius: ");
		double temperature = scanner.nextDouble();
		Temperature.temperatureConversion(option, temperature);

	}

}
