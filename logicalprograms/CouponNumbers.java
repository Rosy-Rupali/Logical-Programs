package logicalprograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N distinct scoupon number : ");
		int n = scanner.nextInt();
		
		findCoupon(n);
		
	}
		private static void findCoupon(int n) {
			int arr[] = new int[n];
			Random random = new Random();
			int range =1000;
			for(int i = 0; i<n; i++) {
				arr[i] = random.nextInt(range);
				
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}for( int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
		
		
		
	


