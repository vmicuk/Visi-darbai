import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        lastCharacter(text);
    }
    
    public static char lastCharacter(String text) {
    	int a = text.length() - 1;
    	System.out.println("Last character: " + text.charAt(a));
    	return text.charAt(a);
    }
    

    
}
