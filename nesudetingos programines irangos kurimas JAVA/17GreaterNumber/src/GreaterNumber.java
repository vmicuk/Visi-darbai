import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int a = reader.nextInt();
        System.out.print("Type the second number: ");
        int b = reader.nextInt();
        
        if (a == b) {
        	System.out.println("The numbers are equal!");
        	}
        else if (a > b) {
        	System.out.println("Greater number: " + a);
        }
        else if (b > a) {
        	System.out.println("Greater number: " + b);
        	}

        
    }
}
