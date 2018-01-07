import java.util.Scanner;

public class Uzd13 {
	public static void valiuta (double eur) {
		double kronai = 8.96, keitimas; 
		keitimas = eur * kronai;
		System.out.printf("%.2f", eur);
		System.out.print(" Eur = ");
		System.out.printf("%.2f", keitimas);
		System.out.print(" Norwegian Krone.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite pinigu suma eurais: ");
		n = sc.nextDouble();
		
		valiuta(n);
	}

}
