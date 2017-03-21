import java.util.Scanner;

public class TestCircle {

	//begin main
	public static void main(String[] args) {
		
		//prep work
		Scanner input = new Scanner(System.in);
		
		Circle c = new Circle();
		
		double radius;
		
		System.out.println("Please enter the radius of the circle.");
		radius = input.nextDouble();
		
		System.out.println("This circle's radius is " + (c.getRadius()));
		System.out.println("This circle's diameter is " + (c.getDiameter()));
		System.out.println("This circle's area is " + (c.getArea()));
		System.out.println("This circle's circumference is " + (c.getCircumference()));
		
	} //end main

}
