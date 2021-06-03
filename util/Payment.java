package util; 

public class Payment {
	
	public static double monthlyPayment(double P, int Y, double R) {
		
		int n = 12*Y;
		double r = R/(12*100);
		double payment = (P*r)/(1-(Math.pow((1+r),(-n))));
		
		return payment;
	}

}
