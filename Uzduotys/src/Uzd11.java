import java.util.Scanner;

public class Uzd11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sk, n, sandauga = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite n: ");
		n = sc.nextInt();
		System.out.println("Iveskite " + n + " sk: ");
		for (int i = 1; i <= n; i++ ) {
			sk = sc.nextInt();	
			sandauga *= sk;
		}
		System.out.println("Ivestu skaiciu sandauga: " + sandauga);
		
	}

}
