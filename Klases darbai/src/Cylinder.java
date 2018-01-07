
public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {
		super();
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius, double height) {
		super(radius, "color");
		this.height = height;
	}
	public Cylinder(double radius, double height, String color) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return getArea()*height;
	}
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height = " + height;
	}
	
	
}
