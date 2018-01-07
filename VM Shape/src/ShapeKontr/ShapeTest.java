package ShapeKontr;

import com.eisgroup.javaexam.shapes.ShapeFactory;
import com.eisgroup.javaexam.shapes.tests.BaseShapeFactoryTest;

public class ShapeTest extends BaseShapeFactoryTest {

	@Override
	protected ShapeFactory createShapeFactory() {
		// TODO Auto-generated method stub
		return new ShapeCreate();
	}



}
