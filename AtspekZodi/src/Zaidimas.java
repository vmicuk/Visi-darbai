import java.util.ArrayList;
	
public class Zaidimas {
	private String zodis;
	private int skaicius;
	private String nickName;
	private int nrFaults;
    private ArrayList<Character> Array;
    private ArrayList<Character> hideWord;

    public Zaidimas(String zodis) {
    	this.zodis = zodis;
	    this.nrFaults = 0;
	    this.Array = new ArrayList<Character>();
	    this.hideWord = new ArrayList<Character>();
	    	
	    for(int i = 0; i<zodis.length();i++){
	    	this.hideWord.add('*');
	       	this.Array.add(zodis.charAt(i));
	    }
    }
    
    public void failEndGame() {
		switch (this.nrFaults) {
		case 10 : 
    		System.out.println("Zaidimas baigesi ir neatspetas zodis.");
    		break;
		}
    }
    
    public void atspetiZodi(String ivestasZodis) {
    	if (ivestasZodis.length() > 1) {
			if (ivestasZodis.equals(this.zodis)) System.out.println("Teisingai");		
			else System.out.println("Neteisingai");
    }
    }
    
    public String atspetiRaide(char raide) {
    	for(int i = 0; i<this.zodis.length();i++){
    		if(this.zodis.charAt(i) == raide) {
    			this.hideWord.set(i, this.Array.get(i));
    		}
    	}
	    	
    	if (!Array.contains(raide)){
			this.nrFaults++;
			System.out.println("Neteisingai! Bandikite dar karta. Klaidu kiekis: " + this.nrFaults);
		    	}
    	
    	String atspetasZodis = "";
    	for (Character c: hideWord) {
    		atspetasZodis += c;
    	}
    	return atspetasZodis;
    }
    
    
    
	public void setSkaicius(int skaicius) {
		this.skaicius = skaicius;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getSkaicius() {
		return this.skaicius;
	}
	public String getNickName() {
		return this.nickName;
	}
//	public String getZodis() {
//		this.zodis = "labas";
//		return this.zodis;
//	}

}
