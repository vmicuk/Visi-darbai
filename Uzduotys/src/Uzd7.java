import java.util.Scanner;

public class Uzd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite skaicius: ");
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			suma +=n;
		}
		if (suma % 2 == 0) System.out.println("Lyginiu sk suma = " + suma);
		else System.out.println("Nelyginiu sk suma = " + suma);
		
	}

}
