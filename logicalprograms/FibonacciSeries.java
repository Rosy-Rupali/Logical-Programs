package logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the maximum range you want to print the series: ");
		int n = scanner.nextInt();
		
		/**
		 * a = first term of series
		 * b = second term of series
		 * c = next term of the series
		 */
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=3; i<=n; i++) {
		int c = a+b;
		System.out.print(c+" ");
		a = b;
		b = c ;
		}
	}

}
