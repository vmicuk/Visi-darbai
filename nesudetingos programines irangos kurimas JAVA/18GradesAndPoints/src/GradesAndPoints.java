
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int a = reader.nextInt();
        
        if (a < 30) {
        	System.out.println("Grade: failed");
        }
        else if (a >= 30 & a < 35) {
        	System.out.println("Grade: 1");
        }
        else if (a > 34 & a < 40) {
        	System.out.println("Grade: 2");
        }
	    else if (a > 39 & a < 45) {
	    	System.out.println("Grade: 3");
	    }
	    else if (a > 44 & a < 50) {
	    	System.out.println("Grade: 4");
	    }
	    else if (a > 49 & a <= 60) {
	    	System.out.println("Grade: 5");
	    }
    }
}
