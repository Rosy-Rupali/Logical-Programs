package logicalprograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find it's reverse: ");
		int number = scanner.nextInt();
		
		System.out.println("The original number is :"+number);
		
		int reverse = 0, remainder = 0;
		while(number != 0) {
			remainder = number%10;
			reverse = (reverse*10)+remainder;
			number/=10;
		}
		
		System.out.println("Reverse of the number is: "+reverse);
	}

}
