import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String read = reader.nextLine();
        
        if (read.length() <= 2) {
        	System.out.println();
        } 
        else {
        	System.out.println("1. character: " + read.charAt(0));
        	System.out.println("2. character: " + read.charAt(1));
        	System.out.println("3. character: " + read.charAt(2));
        }
    }
}
