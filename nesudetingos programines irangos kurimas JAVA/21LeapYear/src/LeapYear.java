
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type are year: ");
        int a = reader.nextInt();
        
        if ((a%100 == 0) & (a%400 != 0)) {
        	System.out.println("The year is not a leap year.");
        }
        else if (a%4 == 0) {
        	System.out.println("The year is a leap year.");
        }
        else {
        	System.out.println("The year is not a leap year.");
        }
    }
}
