import java.util.Scanner;

public class TestFan {

	//begin main
	public static void main(String[] args) {
		
		//prep work
		Fan f = new Fan ();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the fan speed: ");
		speed = input.nextInt();
		
		System.out.println("Enter the status of the fan: ");
		fanStatus = input.nextBoolean();
		
		System.out.println("Enter the radius of the fan: ");
		radius = input.nextDouble();
		
		System.out.println("Enter the color of the fan: ");
		color = input.nextLine();
		
		System.out.println(f.toString());
		
	} //end main
	
}
