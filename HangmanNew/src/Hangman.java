import java.util.ArrayList;

public class Hangman {
	private String word;
    private int numberOfFaults;
    private ArrayList<Character> wordArray;
    private ArrayList<Character> hiddenWord;

    public Hangman(String word) {
        this.word = word;
        this.numberOfFaults = 0;
        this.wordArray = new ArrayList<Character>();
        this.hiddenWord = new ArrayList<Character>();
        		for(int i = 0; i<word.length();i++){
        			this.hiddenWord.add('_');
        			this.wordArray.add(word.charAt(i));
        		}
        			
 
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }
    
    
    public void guessWord(String full){
    	if(this.word.equals(full))
    		System.out.println("Correct! You are right. Word was " + this.word);
    	else
    		System.out.println("You have lost. Word was " + this.word);
    }

    public String guessLetter(char letter) {
    	
    	
    	
    	for(int i = 0; i<this.word.length();i++){
    		if(this.word.charAt(i) == letter) {
    			this.hiddenWord.set(i, this.wordArray.get(i));
    			if(wordArray.equals(hiddenWord))
    				System.out.println("Correct! Secret word was " + this.word); 
    		}
    		}
    	if (!wordArray.contains(letter)){
			this.numberOfFaults++;
			System.out.println("There is no such a letter. Try again. You failed " + this.numberOfFaults + " times");
		    	}
    	if(this.numberOfFaults==this.word.length())
			System.out.println("You have lost. You are out of tries. The secret word was " + this.word);

    	String word = "";
    	for (Character c: hiddenWord) {
    		word += c;
    	}
    	
    	return word;
    	
    }
    	
    public boolean finished(){
    	if (this.hiddenWord.equals(wordArray)){
    	}
    	return true;
    }
  

}
