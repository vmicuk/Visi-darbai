package ShapeKontr;

import com.eisgroup.javaexam.shapes.Shape;
import com.eisgroup.javaexam.shapes.ShapeFactory;

public class ShapeCreate implements ShapeFactory {

	@Override
	public Shape createCircle(double arg0) {
		Circle circle = new Circle(arg0);
		return circle;
	}

	@Override
	public Shape createRectangle(double arg0, double arg1) {
		Rectangle rectangle = new Rectangle(arg0, arg1);
		return rectangle;
	}

}
