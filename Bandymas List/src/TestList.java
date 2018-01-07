import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Pastatas> pastatas = new ArrayList<>();
		pastatas.add(new Pastatas("Namas", 9, "Vilnius"));
		pastatas.add(new Pastatas("Butas", 5,"Kauno regione"));
		pastatas.add(new Pastatas("Namas", 9, "Kaunas"));
		pastatas.add(new Pastatas("Namas", 5, "Vilnius"));
		pastatas.add(new Pastatas("Gamykla", 1, "Klaipeda"));
		pastatas.add(new Pastatas("Mokykla", 3, "Kaunas"));
		
		System.out.println(pastatas.get(1));
		//pastatas.remove(0);
		System.out.println(pastatas.get(0));
		pastatas.add(0, new Pastatas("Villa", 2, "Taurage"));
		System.out.println(pastatas.get(0));
		
		System.out.println(pastatas.indexOf(2));
		System.out.println(pastatas.lastIndexOf(0));
		
		System.out.println(pastatas.subList(1, 4));
		System.out.println();
		
		for (Pastatas num : pastatas) System.out.println(num);
		System.out.println();
		
		for (int i = 0; i < pastatas.size(); i+=2) System.out.println(pastatas.get(i));
		System.out.println();
		
		Iterator<Pastatas> iterator = pastatas.iterator();
		while (iterator.hasNext()) {
			final Pastatas pastata = iterator.next();
			if (pastata.getAukstuSkaicius() > 3) System.out.println(pastata);
			else iterator.remove();
		}
		
		
		
	}



}
