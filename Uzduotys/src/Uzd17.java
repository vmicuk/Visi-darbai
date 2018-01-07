
public class Uzd17 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = {10, 12, 14, 16, 18 };
		double temp[] = {37.8, 39.5, 40.1, 39.9, 37,5};
		int t = 0;
		Double max = temp[0];
		System.out.println("Ligonio stebejimas \n");
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i] + " val. - " + temp[i] + " temp.");
		}
		
		for (int i = 1; i < temp.length-1; i++) {
			if (max < temp[i]) {
				max = temp[i];
				t = i;
			}
	}
		System.out.println("\nDidziausia temp. buvo " + val[t] + " - " + max);
	}
	
}
