import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        float average = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers: ");
        while (true) {
        	int read = Integer.parseInt(reader.nextLine());
	            if (read == -1) {
	                break;
	            }
	            sum += read;
	            number++;
	            average = sum / (float)number;
	            	if (read % 2 != 0) {
	            		odd++;
	            	}
	            	else {
	            		even++;
	            	}
        }
        
        System.out.println("Thanks you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + number);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
