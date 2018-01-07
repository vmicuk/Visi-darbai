import java.util.Scanner;

public class Uzd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sk, temp = 0,  count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite sk: ");
		sk = sc.nextInt();
		temp = sk;
			while (temp > 0) {
					count++;
					temp = temp / 10;
			}
		System.out.println("Skaicius " + sk + " turi " + count + " skaitmenys.");
	}

}
