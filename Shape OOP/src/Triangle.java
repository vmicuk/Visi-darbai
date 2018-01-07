
public class Triangle extends Shape{
	
	private double a = 1.0;
	private double b = 1.0;
	private double c = 1.0;
	
	public Triangle() {}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle(String color, boolean filled, double a, double b, double c) {
		super(color, filled);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	@Override
	public double getArea() {
		return 0.5*a*b;
	}
	
	@Override
	public double getPerimeter() {
		return a+b+c;
	}
	
	
	
	
	

}
