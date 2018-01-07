
public class TestCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder: radius = " + c1.getRadius() + ", height = " + c1.getHeight()
		+ ", area = " + c1.getArea() + ", volume = " + c1.getVolume() + ";" );
		
		Cylinder c2 = new Cylinder(11.5);
		System.out.println("Cylinder: radius = " + c2.getRadius() + ", height = " + c2.getHeight()
		+ ", area = " + c2.getArea() + ", volume = " + c2.getVolume() + ";" );
		
		Cylinder c3 = new Cylinder(11.5, 22.1);
		System.out.println("Cylinder: radius = " + c3.getRadius() + ", height = " + c3.getHeight()
		+ ", area = " + c3.getArea() + ", volume = " + c3.getVolume() + ";" );
		
		System.out.println(c3);
		
	}

}
