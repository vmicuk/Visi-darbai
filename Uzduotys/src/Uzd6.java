import java.util.Scanner;

public class Uzd6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sk1, sk2, rez;
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite sk1: ");
		sk1 = sc.nextInt();
		System.out.print("Iveskite sk2: ");
		sk2 = sc.nextInt();
		
		if (sk1 > 0 && sk2 > 0 || sk1 < 0 && sk2 < 0) { 
			rez = sk1*sk1 + sk2*sk2;
			System.out.println("Rez.: " + rez);
		}
		else {
			rez = sk1*sk1-sk2*sk2;
			System.out.println("Rez.: " + rez);
		}
	}

}
