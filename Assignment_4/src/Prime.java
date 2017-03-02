import java.util.Scanner;

public class Prime {

	//begin main
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int userInput;
		int primeTotal = 0;
		
		System.out.println("Enter a number. The program will pring all the prime numbers smaller than this number.");
		userInput = input.nextInt();
		
		for (int number = 2; number <= userInput; number++) {
			
			//call to prime method
			if (prime(number)) {
	    
				System.out.println(number);
	            
				primeTotal++;
				
	        }
	          
		}
		
		System.out.println("There are a total of " + primeTotal + " prime numbers.");
			
	}
	
	//method used to determine if prime and return answer
	public static boolean prime (int number) {
		
       	for (int i = 2; i < number; i++) {
       		
           if(number % i == 0){
        	   
               return false; 
               
           }
           
        }
       	
        return true; 

	}
        
}
