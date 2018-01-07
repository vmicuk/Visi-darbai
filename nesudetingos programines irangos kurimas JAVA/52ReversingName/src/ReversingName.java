import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String read = reader.nextLine();
        int a = read.length()-1;
        System.out.print("\nIn reverse order: ");
        for (int i = 0; i <= a; a--) {
        	System.out.print(read.charAt(a));
        }
    }
}
