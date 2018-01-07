
public class SaskaitaKreditine extends Saskaita {
	private double skolinti = 0;
	private double skolintisMax = 1000.0;
	
	public SaskaitaKreditine() {
	}
	public SaskaitaKreditine(double skolinti) {
		this.skolinti = skolinti;
	}
	public SaskaitaKreditine(int numeris, String savininkas, double balansas, double skolinti) {
		super(numeris, savininkas, balansas);
		this.skolinti = skolinti;
	}
	public SaskaitaKreditine(int numeris, String savininkas, double balansas){
		super(numeris, savininkas, balansas);
	} 
	public double maxCredit() {
		return skolintisMax;
	}
	public void setSkolinti(double skolinti) {
		this.skolinti = skolinti;
	}
	public void skolinti(double suma) {
		if (suma > skolintisMax) {
			System.out.println("Per didele skolos suma.");
		}
		else {
			System.out.println("Jus norite paskolinti: " + suma);
			setBalansas(suma + getBalansas());
			System.out.println("Dabar " + super.toString());
		}
		
	}
	@Override
	public double piniguIsemimas(double suma) {
		
		
		return 0.0;
	}
	public String toString() {
		return "Maksimali skolinimo suma yra: " + skolintisMax;
	}
	
	
	
}
