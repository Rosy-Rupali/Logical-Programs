package util;

public class BinayRepresentation {

	public static void toBinary(int number) {
		
		int binaryNum[] = new int[30];
		
		int counter = 0;
		while(number>0) {
			binaryNum[counter] = number%2;
			number = number/2;
			counter++;
		}
		for(int j=counter-1; j>=0; j--) {
			System.out.println(binaryNum[j]);
		}
	}
}
