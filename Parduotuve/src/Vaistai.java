
public class Vaistai extends Item{
	
	public Vaistai(String name, double price, int amount) {
		super(name, price, amount);
	}
//	public double getFullVaistuWithPVM() {
//		double suma = getPrice() * getAmount() * 1.09;
//		return suma;
//	} 
	@Override
	public double getFullPriceWithPVM() {
		double suma = getAmount() * (getPrice() * 1.09); 
		System.out.print("Pilna Vaistu kaina su PVM: ");
		return suma;
	}
	@Override
	public double getFullPriceNoPVM() {
		double suma = getAmount() * getPrice();
		System.out.print("Pilna Vaistu kaina be PVM: ");
		return suma;
	}
	
	get
	
}
