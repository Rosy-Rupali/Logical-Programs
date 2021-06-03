package util;

public class Temperature {
		
	public static void temperatureConversion(int option, double temperature) {
		
		double result=0;
		switch(option) {
			case 1: result = (temperature*(9/5))+32;
					System.out.println(result+" Fahrenheit");
					break;
			
			case 2: result = (temperature-32)*(5/9);
					System.out.println(result+" Celsius");
					break;
					
			default: 
				System.out.println("Invalid input");
				break;
		}
	}
}
