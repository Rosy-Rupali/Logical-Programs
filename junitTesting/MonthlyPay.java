package junitTesting;

import java.util.Scanner;
import util.Payment;

public class MonthlyPay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Principle amount loan (P): ");
		double P = scanner.nextDouble();
		System.out.println("Enter the Year of pay (Y): ");
		int Y = scanner.nextInt();
		System.out.println("Enter the Rate percent interest (R): ");
		double R = scanner.nextDouble();
		
		System.out.println(Payment.monthlyPayment(P, Y, R));

	}

}
