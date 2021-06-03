package junitTesting;

import java.util.Scanner;
import util.Date;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the month m: ");
		int m = scanner.nextInt();
		System.out.println("Enter the date d: ");
		int d = scanner.nextInt();
		System.out.println("Enter the year y: ");
		int y = scanner.nextInt();

		switch(m) {
		case 1:
				System.out.println("january");
				break;
				
		case 2:
			System.out.println("febuary");
			break;
			
		case 3:
			System.out.println("march");
			break;
			
		case 4:
			System.out.println("april");
			break;
			
		case 5:
			System.out.println("may");
			break;
			
		case 6:
			System.out.println("june");
			break;
			
		case 7:
			System.out.println("july");
			break;
			
		case 8:
			System.out.println("august");
			break;
			
		case 9:
			System.out.println("september");
			break;
			
		case 10:
			System.out.println("october");
			break;
			
		case 11:
			System.out.println("november");
			break;
			
		case 12:
			System.out.println("december");
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}
	
		int dayOfWeek = Date.dayOfWeek(m, d, y);
		switch(dayOfWeek) {
		
			case 0:
				System.out.println("sunday");
				break;
			
			case 1:
				System.out.println("monday");
				break;
				
			case 2:
				System.out.println("tuesday");
				break;
				
			case 3:
				System.out.println("wednesday");
				break;
				
			case 4:
				System.out.println("thursday");
				break;
				
			case 5:
				System.out.println("friday");
				break;
				
			case 6:
				System.out.println("saturday");
				break;
				
			default:
				System.out.println("invalid input");
				break;
		}
	}

}
