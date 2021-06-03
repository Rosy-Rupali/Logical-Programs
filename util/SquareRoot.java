package util;

/**
 * 
 * Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 *
 *  % java Sqrt 2
 *  1.414213562373095
 *
 */
public class SquareRoot {
	
	public static void sqrt(double c) {
		
		double t = c;
		double epsilion = 1e-15;
		
		while(Math.abs(t - c/t)>epsilion*t) {
			t = (c/t + t)/2.0;
		}
		
		System.out.println(t);
	}

}
