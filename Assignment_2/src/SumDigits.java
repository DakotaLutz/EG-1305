import java.util.Scanner;

public class SumDigits {

	//begin main
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;											//number provided by user
		int digit1, digit2, digit3, digit4;					//hold value of each digit of the number
		int leftoverNumber;									//hold value of digits remaining
		
		//ask user for integer and save
		System.out.println("Enter an integer between 0 and 1000:");
		number = input.nextInt();	
		
		//initially tried to convert to string and pull individual values
		//instead applied technique from CountyMoney challenge
		
		//find value of first digit and calculate remaining value
		digit1 = (number / 1000);
		leftoverNumber = (number % 1000);
		
		//find value of second digit and calculate remaining value
		digit2 = (leftoverNumber / 100);
		leftoverNumber = (leftoverNumber % 100);
		
		//find value of third digit and calculate remaining value
		digit3 = (leftoverNumber / 10);
		leftoverNumber = (leftoverNumber % 10);
		
		//find value of fourth digit
		digit4 = (leftoverNumber / 1);
		
		//find sum of digits and print
		int digitSum = (digit1 + digit2 + digit3 + digit4);		
		System.out.println("The sum of the digits is " + digitSum);
		
	} // end main

}
