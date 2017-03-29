
public class RegularPolygon {

	int sideNumber;
	double sideLength;

	public RegularPolygon () {
		
	}
	
	public RegularPolygon (int sideNumber, int sideLength) {
		
		this.sideNumber = sideNumber;
		this.sideLength = sideLength;
		
	}
	
	public double getPerimeter () {
		
		return (sideNumber * sideLength);
		
	}
	
	public double getArea () {
		
		return (sideNumber * sideLength * sideLength) / (4 * Math.tan(3.14159/sideNumber));
			
	}

	@Override
	public String toString() {
		return "The polygon has " + sideNumber + " sides of length " + sideLength + " and it has a perimeter of " + getPerimeter() + " and an area of " + getArea();
	}
	
}
