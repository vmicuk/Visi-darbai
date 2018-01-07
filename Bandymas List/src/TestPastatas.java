import java.awt.List;

import java.util.ArrayList;

public class TestPastatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pastatas> pastatas = new ArrayList<>();
		pastatas.add(new Pastatas("Namas", 9, "Vilnius"));
		pastatas.add(new Pastatas("Butas", 5,"Kauno regione"));
		pastatas.add(new Pastatas("Namas", 9, "Kaunas"));
		pastatas.add(new Pastatas("Namas", 5, "Vilnius"));
		pastatas.add(new Pastatas("Gamykla", 1, "Klaipeda"));
		pastatas.add(new Pastatas("Mokykla", 3, "Kaunas"));
		
		for (Pastatas a : pastatas) System.out.println(a);
		
	}

}
