import java.util.Scanner;
public class HangmanMain {

	public static void main(String[] args) {
		Scanner reader  = new Scanner(System.in);
		
		Hangman hang = new Hangman("mantas");
		
		System.out.print("Please, enter you name: ");
		String fName = reader.nextLine();
		
		System.out.print(fName + " ,Enter a character or whole word: ");
		
		boolean finished = false;
		
		while(!finished){
			String input = reader.next();			
			if(input.length()>1){
				hang.guessWord(input);
			}
			else if (input.length()==1){
				System.out.println(hang.guessLetter(input.charAt(0)));
			}
			
			
	}
		
		System.out.println("Finished");
		
	}
}
