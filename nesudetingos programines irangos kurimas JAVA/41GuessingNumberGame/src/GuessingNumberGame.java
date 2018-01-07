
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int count = 1;
        System.out.println("Guess a number: ");  
	        while (true) {
	        	int read = Integer.parseInt(reader.nextLine());
		            if (read == numberDrawn) {
		                break;
		            }
		            else if (read > numberDrawn) {
				        	System.out.println("The number is lesser, quesses made: " + count++);
				        }
				    else {
				        	System.out.println("The number is greater, quesses made: " + count++);
				        }
	        }
	        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
