import java.util.Scanner; 
import java.util.Random;

public class PaperRockScissors {

	//begin main
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
	    Random generator = new Random();
	    
	    int userPlay, computerPlay;
	    
	    System.out.print("scissors (0), rock (1), paper (2): ");
	    userPlay = input.nextInt();										//user's play
	    	
	    computerPlay = generator.nextInt(2) + 0; 						//computer's play
	    
	    if (userPlay == 0) {
	    	
	    	if (computerPlay == 0) {
	    		
	    		System.out.println("It's a tie: You both chose scissors");
	    		
	    	}
	    	
	    	else if (computerPlay == 1) {
	    		
	    		System.out.println("You lost: Rock beats scissors");	
	    		
	    	}
	    	
	    	else if (computerPlay == 2) {
	    		
	    		System.out.println("You won: Scissors beats paper");
	    		
	    	}
	    	
	    }
	    
	    else if (userPlay == 1) {
	    	
	    	if (computerPlay == 0) {
	    		
	    		System.out.println("You won: Rock beats scissors");
	    		
	    	}
	    	
	    	else if (computerPlay == 1) {
	    		
	    		System.out.println("It's a tie: You both chose rock");	
	    		
	    	}
	    	
	    	else if (computerPlay == 2) {
	    		
	    		System.out.println("You lost: Paper beats rock");
	    		
	    	}
	    	
	    }
	    
	    else if (userPlay == 2) {
	    	
	    	if (computerPlay == 0) {
	    		
	    		System.out.println("You lose: Scissors beats paper");
	    		
	    	}
	    	
	    	else if (computerPlay == 1) {
	    		
	    		System.out.println("You win: Paper beats rock");	
	    		
	    	}
	    	
	    	else if (computerPlay == 2) {
	    		
	    		System.out.println("It's a tie: You both chose paper");
	    		
	    	}
	    	
	    }

	} //end main

}
