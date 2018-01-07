
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Up to what number? ");
        int a = reader.nextInt();
        int number = 1;
        while (number <= a) {
        	System.out.println(number);
        	number++;
        }
        
        // Write your code here
        
    }
}
