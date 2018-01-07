import java.util.Scanner;

public class Programa {

	public static void programa() {
		Zaidimas zaidimas = new Zaidimas("labas");
		//Zodis atspekZodi = new Zodis();
		
		Scanner sc = new Scanner(System.in);
		Scanner vardas = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		int kiekis = 0, nr = 0;
		System.out.print("Iveskite kiek zais zmoniu: \n");
		int skaicius = sc.nextInt();
		
		if (skaicius == 0) {
			System.out.println("Neteisingas skaicius");	
		}
		
		else if (skaicius == 1) {
			System.out.print("Iveskite varda: ");
			zaidimas.setNickName(vardas.nextLine());
			while(true) {
				System.out.println(zaidimas.getNickName() + ": atspekite zodi arba parasykite raide: ");
	//			cia reikia testi koda kad zaisti
				String zodi = read.nextLine();
				if(zodi.length() == 1){
					zaidimas.atspetiRaide(zodi.charAt(0));
				}
				else {
					zaidimas.atspetiZodi(zodi);
				}
			}
			
			
		}
		else if (skaicius > 1) {
			while (kiekis != skaicius) {
				System.out.print("Iveskite varda: ");
				zaidimas.setNickName(vardas.nextLine());
				kiekis++;
			}
			if (kiekis == skaicius) {
				System.out.println("Zaidimas prasideda!!! turite 10 bandymus.");
				System.out.print("Iveskite zodi arba raide: ");
				String raideZodis = sc.nextLine();
//				cia reikia testi koda kad zaisti
				String zodi = read.nextLine();
//				if () {
					if(zodi.length()>1){
						zaidimas.atspetiZodi(zodi);
					}
					else {
						zaidimas.atspetiRaide(zodi.charAt(0));
					}
//				}
				
			}
		}
		else {
			System.out.println("KLAIDA");
		}
	}
	
}
