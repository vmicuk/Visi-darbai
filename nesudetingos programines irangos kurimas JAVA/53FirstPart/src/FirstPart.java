
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String read = reader.nextLine();
        String word = read;
        
        System.out.print("Length of the first part: ");
        int number = reader.nextInt();
        
        System.out.print("Result: " + word.substring(0, number));
        	
        
    }
}
