import java.text.DecimalFormat;

public class Circle {
	
	public static void main(String[] args){
		
	DecimalFormat formatter = new DecimalFormat("#0.0000");

	int radius=5;
	double area;
	double diameter;
	
	area=radius*radius*Math.PI;
	diameter=2*radius;

	System.out.println("The area of the circle is "+formatter.format(area));
	System.out.println("The diameter of the circle is "+diameter);

	}
}
