package junitTesting;

import java.util.Scanner;

import util.BinayRepresentation;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to convert in binary form:");
		int number = scanner.nextInt();
		int newnumber;
		BinayRepresentation.toBinary(number);
		
		newnumber = ((number&0X0F)<<4 | (number&0XF0)>>4);
		
		System.out.println("Before swapping: "+number);
		System.out.println("After swapping: "+newnumber);
		
		

	}

}
