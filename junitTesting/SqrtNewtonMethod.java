package junitTesting;

import java.util.Scanner;

import util.SquareRoot;

public class SqrtNewtonMethod {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the non-negative number find the sqaure root:");
		double c = scanner.nextDouble();
		
		SquareRoot.sqrt(c);
	}

}
