
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");
        
        // PROGRAM YOUR SOLUTION HERE
        String q = "quit";
        String stat = "status";
        while (hangman.gameOn()) {
        	System.out.println("Type a command: ");
        	String command = reader.nextLine();
            if (command.isEmpty()) {
            	System.out.println("String was empty");
            	printMenu();
            }
            else {
            	System.out.println("I found something!");
            }
            
        	if (command.length() == 1) {
        		hangman.guess(command);
        		
        	}
        	else if (command.equals(q)) {
        		break;
        	}
        	else if (command.equals(stat)) {
        		hangman.printStatus();		
        	}
        	hangman.printMan();
        	hangman.printWord();	
        }
        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
