import java.util.Scanner;

public class GeneratePassword {

	//begin main
	public static void main(String[] args) {
		
		//prep work
		Scanner input = new Scanner(System.in);
		
		int passwordLength;				//from user
		
		System.out.println("How many digits would you like to use for a numeric password?");
		passwordLength = input.nextInt();
		
		System.out.println("Your password is ");
		
		for (int i = 0; i < passwordLength; i++) {
			
			System.out.print(randomGenerator() + " ");
			
		}
		
	} //end main

	public static int randomGenerator () {
		
		int random = (int) (Math.random () * 9 + 0);
		
		return random; 
		
	}
	
}
