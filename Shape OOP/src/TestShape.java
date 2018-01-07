import java.util.ArrayList;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle("Blue", false, 2.6);
		Shape c2 = new Circle();
		
		
		System.out.println(c1);
		System.out.println(c2 + "\n");
		
		Rectangle r1 = new Rectangle(2.2, 3.8);		
		Rectangle r2 = new Rectangle("grey", true, 400.5, 6.9);
		
		System.out.println(r1);
		System.out.println(r2 + "\n");
		
		Square s1 = new Square(3.4);
		s1.setSide(10);
		Square s2 = new Square("green", false, 6.8);
		
		System.out.println(s1);
		System.out.println(s2 + "\n");
		
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(c1);
		list.add(c2);
		list.add(r1);
		list.add(r2);
		list.add(s1);
		list.add(s2);
		list.add(new Circle(2.0));
		list.add(new Triangle(2.5, 3.6, 4.8));
		list.add(new Triangle());
		
		double suma = 0;
		for (Shape a : list ) {
			System.out.println(a);
			suma += a.getArea();
		}
		System.out.println("Total sum: " + suma);
		
		//Raskite figûrà su didþiausiu Area;
		System.out.println(maxAreaFind(list));
		
		//Atspausdinkite tik kvadratø kraðtiniø reikðmes (panaudokite getSide() metodà)
		for (Shape c : list) {
			if (c instanceof Square) {
				System.out.println(((Square) c).getSide());
			} 
		}
		//nr 9 su abstract
		for (Shape d : list) {
			System.out.println(d);
		}
	}
	
	public static double maxAreaFind (ArrayList<Shape> list) {
		double max = list.get(0).getArea();
		for (Shape b : list) {
			if (max < b.getArea()) {
				max = b.getArea();
			}
		}
		return max;
	}
	

}
