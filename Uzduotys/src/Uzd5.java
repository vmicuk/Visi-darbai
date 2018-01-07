import java.util.Scanner;

public class Uzd5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite a: ");
		a = sc.nextInt();
		System.out.print("Iveskite b: ");
		b = sc.nextInt();
		System.out.print("Iveskite c: ");
		c = sc.nextInt();
		if (a > b && a > c) System.out.println("Didziausias is " + a + ", " + b + ", " + "c, " + " yra skaicius " + a); 
		else if (b > a && b > c) System.out.println("Didziausias is " + a + ", " + b + ", " + "c, " + " yra skaicius " + b);
		else System.out.println("Didziausias is " + a + ", " + b + ", " + "c, " + " yra skaicius " + c);
	}
	

}
