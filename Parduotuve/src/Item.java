
public class Item {
	
	private String name;
	private double price;
	private int amount;
	
	public Item(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getFullPriceWithPVM() {
		double suma = this.amount * (this.price * 1.21); 
		System.out.print("Pilna kaina su PVM: ");
		return suma;
	}
	public double getFullPriceNoPVM() {
		double suma = this.amount * this.price;
		System.out.print("Pilna kaina be PVM: ");
		return suma;
	}
	public String toString() {
		return "Item [name= " + name + ", price= " + price + ", amount= " + amount + "]";
	}	
	
	
	
}
