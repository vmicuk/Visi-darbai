
public class Taskas {
	
	private double x;
	private double y;
	private double z;
	
	
	public Taskas() {
		
	}
	
	public Taskas(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	} 
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getZ() {
		return this.z;
	}
	
	public double atstumas() {
		double atstumas = Math.sqrt((this.x*this.x) + (this.y*this.y));
		return atstumas;
	}
	public double atstumasTrisTaskai() {
		double atstumas2 = Math.sqrt((this.x*this.x) + (this.y*this.y) + (this.z*this.z));
		return atstumas2;
	}
}
