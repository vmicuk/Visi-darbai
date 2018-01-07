import java.util.Scanner;

public class Extra2 {
	public static void daugybosLentele(int number1, int number2) {
		
		int start = number1, end = number2;
		for (int x = start; x <= end; x++) {
			System.out.println("\nDaugybos lentele is " + x);
				for (int i = 1; i <= 9; i++) {
					System.out.println(x + " * " + i + " = " + x*i);
				}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		n = sc.nextInt();
		n1 = sc.nextInt();
		
		daugybosLentele(n, n1);
	}

}
