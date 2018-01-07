
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int a = reader.nextInt();
        
        System.out.println("Last: ");
        int b = reader.nextInt();
        
        int sum = 0;
        while (a <= b) {
        	sum +=a;
        	a++;
        }
        System.out.println("The sum: " + sum);
    }
}
