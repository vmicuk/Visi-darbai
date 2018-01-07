import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class Boat extends Transportation{
	private double PVM = 1.21;
	private double length = 0.0;
	
	public Boat(String make, String model, double price, Color color, double length) {
		super(make, model, price, color);
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}

	@Override
	public double getFinalPrice() {
		return super.getPrice()*PVM;
	}

}
