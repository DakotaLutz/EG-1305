public class Drink {

	public static void main(String[] args) {
		
		int customers = 12467;
		double weekly = (.14*customers);
		double citrus = (.64*customers);
		/*this is not correct as 64 percent of energy drink users prefer citrus not 
		64 percent of the customers, should be .14 * .64 * customers. Also include spaces on both sides of operators*/
		
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week is "+(int)weekly);
		System.out.println("The approximate number of customers in the survey who prefer energy flavored drinks is "+(int)citrus);
	}

}
