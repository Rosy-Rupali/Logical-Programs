package logicalprograms;

public class Stopwatch {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<100; i++) {
			System.out.println("hello");
		}
		
		long endTime = System.currentTimeMillis();
		printElapsedTime(startTime, endTime);

	}

	

	private static void printElapsedTime(long startTime, long endTime) {
		long elapsedTime = endTime - startTime;
		System.out.println("Elapsed time is: "+elapsedTime);
		
	}

}
