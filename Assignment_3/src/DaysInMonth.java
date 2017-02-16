import java.util.Scanner;

public class DaysInMonth {
	
	//begin main
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    int year, month;

	    System.out.print("Enter a year: ");
	    year = input.nextInt();

	    System.out.print("Enter a month: ");
	    month = input.nextInt();

	        switch (month){
	        
	        case 1:
	        	System.out.println(month + " / " + year + " has 31 days"); 
	            break;
	        case 2:
	            if (year % 4 == 0)
	            	System.out.println(month + " / " + year + " has 29 days");
	            else
	            	System.out.println(month + " / " + year + " has 28 days");
	            break;
	        case 3:
	        	System.out.println(month + " / " + year + " has 31 days"); 
	            break;
	        case 4:
	        	System.out.println(month + " / " + year + " has 30 days"); 
	            break;
	        case 5:
	        	System.out.println(month + " / " + year + " has 31 days"); 
	            break;
	        case 6:
	        	System.out.println(month + " / " + year + " has 30 days"); 
	            break;
	        case 7:
	        	System.out.println(month + " / " + year + " has 31 days"); 
	            break;
	        case 8:
	        	System.out.println(month + " / " + year + " has 31 days"); 
	            break;
	        case 9:
	        	System.out.println(month + " / " + year + " has 30 days"); 
	            break;
	        case 10:
	        	System.out.println(month + " / " + year + " has 31 days"); 
	            break;
	        case 11:
	            System.out.println(month + " / " + year + " has 30 days"); 
	            break;
	        case 12:
	            System.out.println(month + " / " + year + " has 31 days"); 
	            break;

	        }
	        
	        input.close();
		
	} //end main

}
