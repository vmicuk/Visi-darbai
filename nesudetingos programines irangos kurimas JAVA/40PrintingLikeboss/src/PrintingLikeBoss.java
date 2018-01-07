public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
    	int i = 1;
    	while (i <= amount) {
    		System.out.print("*");
    		    i++;
    		}
    	System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
    	int i = 1;
    	while (i <= amount) {
    		System.out.print(" ");
    		    i++;
    		}
    	
    }

    public static void printTriangle(int size) {
        // 40.2
    	for (int i = 1; i <= size; i++) {
    		int n = size - i;
    		printWhitespaces(n);
    		printStars(i);
    	}

	 }

    public static void xmasTree(int height) {
        // 40.3
    	for (int i = 1; i <= height; i++) {
    		int n = height - i;
    		printWhitespaces(n);
    		printStars(i*2-1);
    			if (i == height) {
    					for (int a = 1; a <= 2; a++) {
    						printWhitespaces(height - 2);
    						printStars(3);
    					}
    			}
    	}
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
