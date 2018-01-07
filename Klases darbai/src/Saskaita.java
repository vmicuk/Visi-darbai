
public class Saskaita {
	private int numeris;
	private String savininkas;
	private double balansas;
	
	public Saskaita() {
		
	}
	public Saskaita(int numeris) {
		this.numeris = numeris;
	}
	public Saskaita(int numeris, String savininkas) {
		this.numeris = numeris;
		this.savininkas = savininkas;
	}
	public Saskaita(int numeris, String savininkas, double balansas) {
		this.numeris = numeris;
		this.savininkas = savininkas;
		this.balansas = balansas;
		}
	
	public void setBalansas(double balansas) {
		this.balansas = balansas;
	}
	
	public double getBalansas() {
		return this.balansas;
	}
	public int getNumeris() {
		return this.numeris;
	}
	public String getSavininkas() {
		return this.savininkas;
	}
	
	public double piniguIsemimas(double suma) {
		if (suma <= this.balansas) {
			System.out.print("Pinigai ruosiami, greitai bus paruosta jusu suma: ");
			this.balansas -=suma;
			return suma;
		}
		else {
			System.out.print("Neturi pinigu!! Eik dirbti!!! Dirbk!! Saskaitoje yra: ");
			return this.balansas;
		}
		
	}

	public double transferTo(Saskaita saskaita, double amount) {
		if (amount <= this.balansas) {
			this.balansas -= amount;
			return saskaita.balansas += amount;
		}
		else 
			return this.balansas;
		
	}
	
	public String toString() {
		return "[Balansas = " + balansas + " , vardas " + savininkas + " , id = " + numeris + "]";
	}
	
	
}
