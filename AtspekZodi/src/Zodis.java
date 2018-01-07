import java.util.Scanner;

public class Zodis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zodziai = "labas";
		String hideZodis = "";
		String star = "*";
		int ilgis = zodziai.length();
		
		System.out.print("Atspeti zodi: ");
			for (int i = 0; i < ilgis; i++) {
				System.out.print(star);
			}
		System.out.println();
		
		System.out.print("Iveskite zodi arba raide: ");
		Scanner sc = new Scanner(System.in);
		String raideZodis = sc.nextLine();
		
		
		if (raideZodis.length() > 1) {
			if (raideZodis.equals(zodziai)) System.out.println("Teisingai");		
			else System.out.println("Neteisingai");
		}
		else {
			for (int a = 0; a < ilgis; a ++) {
				if (raideZodis.equals(zodziai.chars())) {
					System.out.println(zodziai.charAt(a));
				}
			}
				
			
//				if (raideZodis.equals(zodziai.indexOf(a))) {
//					System.out.println("Yra");
//				}
//				else {
//					System.out.println("Neteisingai");
//					break;
//				}
		}
		System.out.println(hideZodis);
	}		

}
