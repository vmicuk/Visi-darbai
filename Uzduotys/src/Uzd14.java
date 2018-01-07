import java.util.Scanner;

public class Uzd14 {
	public static void daugybosLentele(int number) {
		int num = number;
		System.out.println("Daugybos lentele is " + number);
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " * " + i + " = " + number*i);
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		n = sc.nextInt();
		
		daugybosLentele(n);
	}

}
