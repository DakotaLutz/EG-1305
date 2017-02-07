import java.util.Scanner;

public class CountMoney {

	//begin main
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int initialAmount; 				//amount given by user
		int leftoverAmount;				//to hold amount left over after each calculation
		
		System.out.println("Enter and amount in integer. For example, 1156 for 11 dollars and 56 cents: ");
		
		//save user input as initialAmount value
		initialAmount = input.nextInt();
		
		//calulate how many dollars and amount remaining
		int dollars = (initialAmount / 100);
		leftoverAmount = (initialAmount % 100);
		
		//calculate how many quarters and amount remaining
		int quarters = (leftoverAmount / 25);
		leftoverAmount = (leftoverAmount % 25);
		
		//calculate how many dimes and amount remaining
		int dimes = (leftoverAmount / 10);
		leftoverAmount = (leftoverAmount % 10);
		
		//calculate how many nickles and amount remaining
		int nickles = (leftoverAmount / 5);
		leftoverAmount = (leftoverAmount % 5);
		
		//calculate how many pennies 
		int pennies = leftoverAmount;
		
		//print results
		System.out.println("Your amount " + initialAmount + " consists of ");
		System.out.println( dollars + " dollars ");
		System.out.println( quarters + " quarters ");
		System.out.println( dimes + " dimes ");
		System.out.println( nickles + " nickles ");
		System.out.println( pennies + " pennies ");
		
		input.close();
		
	} //end main

}
