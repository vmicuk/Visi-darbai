
public enum KMI2 {
	A(18.5, 24.9),
	B(25.0, 29.9),
	C(30.0, 34.9),
	D(35.0, 39.9),
	E(40.0, 60.0);
	
	private double number1;
	private double number2;
	private double kmi;
	
	private KMI2(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public double getKMI(double m, double kg) {
		kmi = kg/(m*m);
		return kmi;
	}
	
	public String toString() {
		return "Jusu KMI: " + String.format("%.1f", number1) + ": ";
	}
	
}
