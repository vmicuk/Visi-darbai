
public class Circle extends Shape {

	private double radius = 1.0;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, radius);
	} 
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

//	@Override
//	public String toString() {
//		return "Circle [radius=" + getRadius() + ", area=" + getArea() + ", perimeter=" + getPerimeter()
//				+ ", color=" + getColor() + ", filled=" + isFilled() + "]";
//	}

	@Override
	public String toString() {
		return "A Circle with radius= " + radius + " , which is a subclass of " + super.toString();
	}
	
	
}
