import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
    	int [] original = {2, 5, 7, 8, 9};
    	int [] reverse = reverseCopy(original);
    	System.out.println("original: " + Arrays.toString(original));
    	System.out.println("reversed: " + Arrays.toString(reverse));
    }

	public static int[] reverseCopy(int[] original) {
		int [] list = new int[original.length];
				for (int i = 0; i < original.length; i++) {
					list[i] = original[original.length - 1 - i];
				}
			
		return list;
	}
    
}
