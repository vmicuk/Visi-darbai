
public enum KMI {

	A("Normalus svoris"), B("Antsvoris"), C("Io nutukimas"), D("IIo nutukimas"), E("IIIo (liguistas) nutukimas");
	
	private String val;
	private double kg;
	private double m;
	private double kmi;
	
	private KMI(String val) {this.val = val;}
	
	public double getNumber(double m, double kg) {
		if (getKMI(m, kg) < 25) return 1;
		else if (getKMI(m, kg) < 30) return 2;
		else if (getKMI(m, kg) < 35) return 3;
		else if (getKMI(m, kg) < 40) return 4;
		else return 5;
	} 
	
	public double getKMI(double m, double kg) {
		kmi = kg/(m*m);
		return kmi;
	}
	
	public String toString() {
		return "Jusu KMI: " + String.format("%.1f", kmi) + ": " + val + "[" + "]";
	}
	
}
