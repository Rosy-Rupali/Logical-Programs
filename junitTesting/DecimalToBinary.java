package junitTesting;

import java.util.Scanner;

import util.BinayRepresentation;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to convert to binary form: ");
		int number = scanner.nextInt();
		
		BinayRepresentation.toBinary(number);

	}

}
