public class IntDivider {
	/*
	 * Pabaikite ra�yti program� IntDivider
	 * public class IntDivider {
		public int divide(String[] skaiciai) {
		...
		}
		
	 * metodo divide signat�r� (vard�, gr��inam� tip�, parametr� skai�i� ar tip�) keisti draud�iama!
	 * 
	 * Reikalavimai programai:
	 * Kaip programos parametrai bus perduodami tekstiniai duomenys, kuriuose bus sveikieji skai�iai.
	 * Programos paskirtis - atlikti skai�i� dalyb�,
	 * kur pirmas masyvo skai�ius turi b�ti padalintas i� antrojo.
	 * Jeigu metodui perduoti nekorekti�ki duomenys - programa turi 
	 * mesti IllegalArgumentException tipo exception'�.
	 * 
	 * Programa negali nul��ti jokiu atveju (nepriklausomai nuo perduot� duomen�)!
	 * 
	 * Norint tekstin� skai�i� paversti skai�iaus tipo duomenimis (su kuriais galime
	 * atlikti aritmetines operacijas), galima pasitelkti:
	 * 
	 * Integer.parseInt(...)
	 *  
	 * Taigi, jeigu bus perduoti skai�iai  6 ir  3, tokiu atveju, 
	 * programa turi i�vesti: 6 / 3 = 2
	 */
	
	public int divide(String[] skaiciai) throws IllegalArgumentException {
		
		if (skaiciai == null || skaiciai.length != 2  || skaiciai[0] == ("0") || skaiciai[1] == "0" || skaiciai.equals("") || 
				skaiciai[0].matches("[a-zA-Z]") || skaiciai[1].matches("[a-zA-Z]"))
			
			throw new IllegalArgumentException("eRRORAS");
			
		try {
			int a = Integer.parseInt(skaiciai[0].replaceAll("\\s+", ""));
			int b = Integer.parseInt(skaiciai[1].replaceAll("\\s+", ""));
			return a/b;
		}
		catch (IndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e); 
		}
}
}
