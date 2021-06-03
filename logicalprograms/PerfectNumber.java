package logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check it is perfect or not: ");
		int number = scanner.nextInt();
		
		int divisors = 0;
		for(int i=1; i<number; i++) {
			if(number%i == 0) {
				divisors+=i;
			}
		}
		if(divisors == number) {
			System.out.println(number+" is a perfect number");
		}else {
			System.out.println(number+" is not a perfect number");
		}

	}

}
