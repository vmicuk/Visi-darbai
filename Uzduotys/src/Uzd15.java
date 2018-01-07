import java.util.Scanner;

public class Uzd15 {
	public static double kvadratas (double a) {
		double plotis;
		plotis = a*a;
		return plotis;
	}
	public static double staciakampis (double a, double b) {
		double plotis;
		plotis = a * b;
		return plotis;
	}
	public static double trikampis (double a, double b) {
		double plotis;
		plotis = (a*b)/2;
		return plotis;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Turinys: ");
		System.out.println("1. Kvadrato plotas;");
		System.out.println("2. Staciakampio plotas;" );
		System.out.println("3. Stac. trikampio plotas;");
		System.out.print("Pasirinkite: ");
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		n = sc.nextInt();
		double a, b;
		if (n <= 3)
		switch (n) {
		case 1 :
			System.out.print("Iveskite a: ");
			a = sc.nextDouble();
			System.out.println("Plotis: "  + kvadratas(a));
			break;
		case 2 :
			System.out.print("Iveskite a: ");
			a = sc.nextDouble();
			System.out.print("Iveskite b: ");
			b = sc.nextDouble();
			System.out.println("Plotis: " + staciakampis(a, b)); 
			break;
	
		case 3 :
			System.out.print("Iveskite a: ");
			a = sc.nextDouble();
			System.out.print("Iveskite b: ");
			b = sc.nextDouble();
			System.out.println("Plotis: " + trikampis(a, b));
			break;
		
		}
		else System.out.println("Klaida");
		
		
	}
}
