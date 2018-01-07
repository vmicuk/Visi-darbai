
public class Car {
	private String spalva;
	private String modelis;
	private int ag;
	private int greitis;
//	double kuroSanaudos;
	private double maxGreitis;
	public Car (String spalva, double maxGreitis) {
		this.spalva = spalva;
		this.maxGreitis = maxGreitis;
	}
	
	public void setGreitis(int greitis) {
		if (greitis <= 250) {
		this.greitis = greitis;
		}
		else System.out.println("Klaida");
	}
	
	public int getGreitis() {
		return this.greitis;
	}
}
