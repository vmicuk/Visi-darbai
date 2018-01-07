
public class Circle {
	private double radius ;
	private String color ; 
	
	public Circle () {
		radius = 1.0;
		color = "Red";
	}
	
	public Circle (double radius) {
		this.radius = radius;
	}
	public Circle (double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius () {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString () {
		return "Circle[radius = " + radius + " color = " + color + "]";
	}
	public double getArea () {
		return radius*radius*Math.PI;
	}

}
