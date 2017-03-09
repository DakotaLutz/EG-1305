import java.util.Scanner;

public class FindPI {

	//begin main
	public static void main(String[] args) {
		
		//prep work
		Scanner input = new Scanner(System.in);
		
		int numOfIterations = 0;
		double PI = 0;
		long startTime = System.nanoTime();

		System.out.println("How many iterations?");
		numOfIterations = input.nextInt();
		
		for (int i = 1; i <= numOfIterations; i++) {
			
			//insert iteration formula to find PI
		    	
		}
		    
		long finishTime = System.nanoTime();
		long totalTime = finishTime - startTime;
		double seconds = totalTime / 1000000000.0;
		
		System.out.println("PI = " + PI + " after " + numOfIterations + " iterations.");
		System.out.println("It took " + seconds + " seconds to complete this iteration.");
		
	} //end main

}
