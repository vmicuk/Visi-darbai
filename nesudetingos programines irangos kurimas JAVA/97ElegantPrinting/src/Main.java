
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
    	
    	for (int i = 0; i < array.length; i++) {
    		if (i == 4) {
    			System.out.println(array[4]);
    			break;
    		}
    		System.out.print(array[i] + ", ");

    	}
    	
    }
}
