public class Drink {

	public static void main(String[] args) {
		
		int customers = 12467;
		double weekly = (.14*customers);
		double citrus = (.64*customers);
		
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week is "+(int)weekly);
		System.out.println("The approximate number of customers in the survey who prefer energy flavored drinks is "+(int)citrus);
	}

}
