import java.util.Scanner;

public class KMI2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iveskite ugi (m) ir svori (kg): ");
		Scanner read = new Scanner(System.in);
		double number1, number2;
		number1 = read.nextDouble();
		number2 = read.nextDouble();
		
		for (KMI2 kmi2 : KMI2.values()) System.out.println(kmi2);
		
	}

}
