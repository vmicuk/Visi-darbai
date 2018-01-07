import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        firstCharacter(text);
    }
    
    public static char firstCharacter(String text) {
    	System.out.println("First character: " + text.charAt(0));
    	return text.charAt(0);
    }
}
