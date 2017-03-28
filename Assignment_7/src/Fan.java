
public class Fan {

	private int speed;
	private boolean fanStatus;
	private double radius;
	private String color;
	
	public Fan () {
		
		fanStatus = false;
		radius = 5;
		color = "blue";
		
	}
	
	public Fan (int speed, boolean fanStatus, double radius, String color) {
		
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
		
	}
	
	public int getSpeed () {
		
		return speed;
		
	}
	
	public boolean getFanStatus () {
		
		return fanStatus;
		
	}
	
	public double getRadius () {
		
		return radius;
		
	}
	
	public String getColor () {
		
		return color;
		
	}
	
	public void setSpeed (int speed) {
		
		this.speed = speed;
		
	}
	
	public void setFanStatus (boolean fanStatus) {
		
		this.fanStatus = fanStatus;
		
	}
	
	public void setRadius (double radius) {
		
		this.radius = radius;
		
	}
	
	public void setColor (String color) {
		
		this.color = color;
		
	}
	
	public String toString () {
		
		return speed + " " + fanStatus + " " + radius + " " + color;
		
	}
	
}

