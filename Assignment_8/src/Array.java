import java.util.Scanner;
import java.util.Arrays;

public class Array {

	//begin main
	public static void main(String[] args) {
		
		//prep work
		Scanner input = new Scanner(System.in);
		
		//variables
		int size = 0;
		
		System.out.println("This program will find the highest, lowest, average and the sum of the numbers that you will enter.");
		
		System.out.println("How many numbers do you want to enter?");
		size = input.nextInt();
		
		//create array
		int[] array1 = new int[size];
		
		getValues(array1);

		System.out.println("The sum of the elements is: " + showTotal(array1));

		System.out.println("Highest element is: " + showHighest(array1));

		System.out.println("Lowest is: " + showLowest(array1));

		System.out.println("The average of the elements is: " + showAverage(array1));

	} //end main
	
	//begin getValues method
	public static void getValues(int[] array) {
		
		//prep work
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {	
			System.out.println("Enter number:");
			array[i] = input.nextInt();
		}
		
	} //end getValues method

	//begin showHighest method
	public static int showHighest(int[] array) {
		
		int highest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {
				highest = array[i];
			}
		}
		return highest;
		
	} //end showHighest method

	
	public static int showLowest(int[] array) {
		
		int lowest = array[0];
		
		for (int i = 0; i < array.length; i++) {		
			if (array[i] < lowest) {
				lowest = array[i];	
			}
		}
		return lowest;
	}

	//begin showTotal method
	public static int showTotal(int[] array) {
		
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {		
			total += array[i];
		}
		
		return total;
	} //end showTotal method

	//begin showAverage method
	public static double showAverage(int[] array) {
		
		double average = showTotal(array) / array.length;
		return average;
	}//end showAverage method
	
}

