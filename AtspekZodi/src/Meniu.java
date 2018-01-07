import java.util.Scanner;

public class Meniu {

public static void meniu() {
	System.out.println("Meniu, pasirinkite ka norite padaryti: ");
	System.out.println("1. Zaisti.");
	System.out.println("2. Iseiti.");
	System.out.println("3. Informacija apie zaidima.");
	
	Programa prog = new Programa();
	
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	
	if (number >= 1 && number <= 3) {
		switch (number) {
		case 1:
			prog.programa();
			break;
		case 2:
			System.out.println("Iki.");
			break;
		case 3:
			System.out.println("Zaidimas, kur reikia atspeti zodi, galimi keli variantai, \n1)Galima parasyti iskart visa zodi. \n2)Galima atspeti raide. ");
			System.out.println("\nSugristi atgal spauskite '4'");
			switch (sc.nextInt()) {
				case 4:
					Meniu.meniu();
					break;
			}
			break;
		}
	}
	else {
		System.out.println("Neteisingai pasirinkti skaiciai!!! Patikrinkite, ar teisingai pasirinkote.");
		System.out.println("\nSugristi atgal spauskite '4'");
		switch (sc.nextInt()) {
			case 4:
				Meniu.meniu();
				break;
	}
	}	
}
}
