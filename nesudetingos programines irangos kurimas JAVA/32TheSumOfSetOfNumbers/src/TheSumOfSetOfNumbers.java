
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what? ");
        int a = reader.nextInt();
        int number = 0;
        int sum = 0;
	        while (number <= a) {
	        	sum += number;   
	        	number++;
	        }
        System.out.println("Sum is: " + sum);
    }
}
