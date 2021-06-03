package logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check it is prime or not: ");
		int number = scanner.nextInt();
		
		if(number == 0 || number == 1) {
			System.out.println("0 and 1 are not counted as prime numbers");
		}else if(number == 2) {
			System.out.println(" 2 is the only even prime number");
		}else {
			int flag = 0;
			for(int i=3; i<number; i++) {
				if(number%i == 0) {
					flag =1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(number+" is a prime number");
			}else {
				System.out.println(number+" is not a prime number");
			}
		}
		

	}

}
