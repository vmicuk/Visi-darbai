package ShapeKontr;

import com.eisgroup.javaexam.shapes.Shape;

public class Rectangle implements Shape{

	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getArea() {
		return a*b;
	}

}
