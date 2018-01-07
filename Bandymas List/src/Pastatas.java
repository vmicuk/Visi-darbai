
public class Pastatas {
	
	private String pavadinimas;
	private int aukstuSkaicius;
	private String miestas;
	
	public Pastatas() {	}

	public Pastatas(String pavadinimas, int aukstuSkaicius, String miestas) {
		this.pavadinimas = pavadinimas;
		this.aukstuSkaicius = aukstuSkaicius;
		this.miestas = miestas;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public int getAukstuSkaicius() {
		return aukstuSkaicius;
	}

	public void setAukstuSkaicius(int aukstuSkaicius) {
		this.aukstuSkaicius = aukstuSkaicius;
	}

	public String getMiestas() {
		return miestas;
	}

	public void setMiestas(String miestas) {
		this.miestas = miestas;
	}

	@Override
	public String toString() {
		return "Pastatas [pavadinimas=" + pavadinimas + ", aukstuSkaicius=" + aukstuSkaicius + ", miestas=" + miestas
				+ "]";
	}
	
	
	

	

}
