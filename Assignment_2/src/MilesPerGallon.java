import java.util.Scanner;

public class MilesPerGallon {

	//begin main
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double milesDriven;				//how many miles the user drove
		double gallonsUsed;				//how many gallons of gas the user used
		double milesPerGallon;			//how many miles per gallon the user got
		
		//ask user for miles driven and save
		System.out.println("Enter the miles driven: ");
		milesDriven = input.nextDouble();
		
		//ask user for gallons used and save
		System.out.println("Enter the gallons of fuel used: ");
		gallonsUsed = input.nextDouble();
		
		//calculate miles per gallon and print
		milesPerGallon = (milesDriven / gallonsUsed);
		System.out.println("The miles per gallon is : " + milesPerGallon);

		input.close();
		
	} //end main

}
