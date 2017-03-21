import java.util.Scanner;

public class Distance {

	//begin main
	public static void main(String[] args) {
		
		//prep work
		Scanner input = new Scanner(System.in);
		
		double x1, y1, x2, y2;
		
		System.out.println("Please enter the x and y values for the first point.");
		System.out.println("x: ");
		x1 = input.nextInt();
		System.out.println("y: ");
		y1 = input.nextInt();
		
		System.out.println("Please enter the x and y values for the second point.");
		System.out.println("x: ");
		x2 = input.nextInt();
		System.out.println("y: ");
		y2 = input.nextInt();
		
		getDistance(x1, y1, x2, y2);
		
		System.out.println("The distance between the two points is " + (getDistance(x1, y1, x2, y2)));
	
	} //end main
	
	//begin static method
	public static double getDistance (double x1, double y1, double x2, double y2) {
		
		double distance = (Math.sqrt( ((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2-y1)) ) );
		
		return distance;
		
	} //end static method
	
}
