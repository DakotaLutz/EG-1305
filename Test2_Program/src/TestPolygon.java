import java.util.Scanner;

public class TestPolygon {

	public static void main(String[] args) {
		
		RegularPolygon p = new RegularPolygon ();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides");
		p.sideNumber = input.nextInt();
		
		System.out.println("Enter the length of the side");
		p.sideLength = input.nextDouble();
		
		System.out.println(p.toString());
		
	}

}
