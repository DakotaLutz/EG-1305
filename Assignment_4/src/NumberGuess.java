import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

	//begin main
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int randomNumber = generator.nextInt(100) + 1;
		int userGuess = 0;
		
		System.out.println("Enter a number between 1 and 100");
		
		while (userGuess != randomNumber) {
			
			userGuess = input.nextInt();
			
			if (userGuess > randomNumber) {
				
				System.out.println("Guess lower");
				
			}
			
			else if (userGuess < randomNumber) {
				
				System.out.println("Guess higher");
				
			}
			
			else {
				
				System.out.println("You guessed it right");
				
			}
			
		}
		
	} //end main

}
