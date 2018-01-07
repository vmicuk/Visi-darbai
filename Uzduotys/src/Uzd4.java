import java.util.Scanner;

public class Uzd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sk, a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Iveskite intervalo pradzia a: ");
		a = sc.nextInt();
		System.out.print("Iveskite intervalo pabaiga b: ");
		b = sc.nextInt();
		System.out.print("Iveskite skaiciu sk: ");
		sk = sc.nextInt();
		
		if (sk >= a && sk <= b) System.out.println("Skaicius " + sk + " priklauso int. [" + a + ";" + b + "]." );
		else System.out.println("Skaicius " + sk + " nepriklauso int. [" + a + ";" + b + "]." );
	}

}
