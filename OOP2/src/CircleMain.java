
public class CircleMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		Circle c2 = new Circle(1.5);
		
		System.out.println(c2.getArea());
		
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println("Operator '+' invokes toString() too: " + c2);
	}
}
