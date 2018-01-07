import java.util.Scanner;

public class Uzd9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sk, temp = 0, count = 0, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite sk: ");
		sk = sc.nextInt();
		temp = sk;
			while (temp > 0) {
					count++;
					temp = temp / 10;
					if (temp % 2 != 0 )	{
						suma +=temp;
					}
			}
		System.out.println("Skaicius " + sk + " nelyginiu skaitmenu suma " + suma);
	}

}
