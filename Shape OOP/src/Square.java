
public class Square extends Rectangle {

	public Square() {}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}
	
	public double getSide() {
		return getLenght();
	}
	public void setSide(double side) {
		super.setLenght(side);
		super.setWidth(side);
		
	}
	@Override
	public void setWidth(double width) {
		setSide(width);
	}
	@Override
	public void setLenght(double width) {
		setSide(width);
	}

	@Override
	public String toString() {
		return "Square [side=" + getSide() + ", area=" + getArea() + ", color=" + getColor()
				+ ", filled=" + isFilled() + "]";
	}

//	@Override
//	public String toString() {
//		return "Square [" + getSide() + "]";
//	}
	
	
	
	
}
