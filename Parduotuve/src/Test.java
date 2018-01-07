
public class Test {

	public static void main(String[] args) {
		
		Item item1 = new Item("Beer", 10, 3);
		System.out.println(item1);
		System.out.println(item1.getFullPriceWithPVM());
		System.out.println(item1.getFullPriceNoPVM());
		
		Item item2 = new Vaistai();
		System.out.println(item2);
		System.out.println(item2.getFullPriceWithPVM());
		System.out.println(item2.getFullPriceNoPVM());
	}

}
