import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection<Pastatas> list = new ArrayList<>();
		list.add(new Pastatas("Namas", 9, "Vilnius"));
		list.add(new Pastatas("Butas", 5,"Kauno regione"));
		list.add(new Pastatas("Namas", 9, "Kaunas"));
		list.add(new Pastatas("Namas", 5, "Vilnius"));
		list.add(new Pastatas("Gamykla", 1, "Klaipeda"));
		list.add(new Pastatas("Mokykla", 3, "Kaunas"));
		
		for (Pastatas a : list) System.out.println(a);
		
	
	}

}
