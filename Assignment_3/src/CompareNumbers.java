import java.util.Scanner;

public class CompareNumbers {

	//begin main
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int firstInt, secondInt, thirdInt;			//user input
		int sum, product, average;					//calculations
		
		System.out.print("Enter first integer: ");
		firstInt = input.nextInt();
		
		System.out.print("Enter second integer: ");
		secondInt = input.nextInt();
		
		System.out.print("Enter third integer: ");
		thirdInt = input.nextInt();
		
		
		/* The program has some redundant code that starts here. You should first only compare the numbers without 
		any print statements. An easier algorithm would be: 
		int smallest = number1;
		if(number2 < smallest) {
			smallest = number2;
		}
		
		if (number3 < smallest) {
			smallest = number3;
		}
		
		Then you can calculate the sum, product, average and then print the results.
		*/
		
		if ((firstInt > secondInt) && (firstInt > thirdInt)) {
			
			if (secondInt > thirdInt) {
				
				sum = (firstInt + thirdInt);
				product = (firstInt * thirdInt);
				average = ((firstInt + thirdInt) / 2);
				
				System.out.println("Largest is " + firstInt);
				System.out.println("Smallest is " + thirdInt);
				System.out.println("Sum is " + sum);
				System.out.println("Product is " + product);
				System.out.println("Average is " + average);
				
			}
			
			else {
				
				sum = (firstInt + secondInt);
				product = (firstInt * secondInt);
				average = ((firstInt + secondInt) / 2);
				
				System.out.println("Largest is " + firstInt);
				System.out.println("Smallest is " + secondInt);
				System.out.println("Sum is " + sum);
				System.out.println("Product is " + product);
				System.out.println("Average is " + average);
				
			}
			
		}
		
		else if ((secondInt > firstInt) && (secondInt > thirdInt)) {
			
			if (firstInt > thirdInt) {
				
				sum = (secondInt + thirdInt);
				product = (secondInt * thirdInt);
				average = ((secondInt + thirdInt) / 2);
				
				System.out.println("Largest is " + secondInt);
				System.out.println("Smallest is " + thirdInt);
				System.out.println("Sum is " + sum);
				System.out.println("Product is " + product);
				System.out.println("Average is " + average);
				
			}
			
			else {
				
				sum = (secondInt + firstInt);
				product = (secondInt * firstInt);
				average = ((secondInt + firstInt) / 2);
				
				System.out.println("Largest is " + secondInt);
				System.out.println("Smallest is " + firstInt);
				System.out.println("Sum is " + sum);
				System.out.println("Product is " + product);
				System.out.println("Average is " + average);
				
			}
			
		}
		
		else if ((thirdInt > firstInt) && (thirdInt > secondInt)); {
			
			if (firstInt > secondInt) {
				
				sum = (thirdInt + secondInt);
				product = (thirdInt * secondInt);
				average = ((thirdInt + secondInt) / 2);
				
				System.out.println("Largest is " + thirdInt);
				System.out.println("Smallest is " + secondInt);
				System.out.println("Sum is " + sum);
				System.out.println("Product is " + product);
				System.out.println("Average is " + average);
				
			}
			
			else {
				
				sum = (thirdInt + firstInt);
				product = (thirdInt * firstInt);
				average = ((thirdInt + firstInt) / 2);
				
				System.out.println("Largest is " + thirdInt);
				System.out.println("Smallest is " + firstInt);
				System.out.println("Sum is " + sum);
				System.out.println("Product is " + product);
				System.out.println("Average is " + average);
				
			}
			
		}
		
		input.close();

	} //end main

}
