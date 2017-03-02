import java.util.Scanner;

public class Mersenne {

	//begin main
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int userInput;
		int mersenneTotal = 0;

		System.out.println("Enter a number. The program will print all the Mersenne prime numbers smaller than this number.");
		userInput = input.nextInt();
		
		for (int number = 2; number <= userInput; number++) {
			
			//call to mersenne method
			if (mersenne(number)) {
	    
				
				
				System.out.println(number);
	            
				mersenneTotal++;
				
	        }
	          
		}
		
		System.out.println("There are a total of " + mersenneTotal + " mersenne numbers.");
			
	}
	
	//method used to determine if mersenne and return answer
	public static boolean mersenne (int number) {
		
       	for (int i = 2; i < number; i++) {
       		
           if(number % i == 0){
        	   
               return false; 
               
           }
           
        }
       	
        return true; 
		
	} //end main

}
