import java.util.Arrays;

public class Main {
	public static int smallest(int[] values) {
		int min = values[0];
			for (int i = 0; i < values.length; i++) {
				if (min > values[i]) {
					min = values[i];
				}
			}
		return min;
	}
	public static int indexOfTheSmallest (int[] values) {
			int j = 0, ind = values[0];
			for (int i = 0; i < values.length; i++){
					if (ind > values[i]) {
						ind = values[i];
						j = i;
					}
				}
		return j;
	}
	public static int indexOfTheSmallestStartingFrom (int[] values, int ind) {
		int start = values[ind], j = ind;
		for (int i = ind; i < values.length; i++){
				if (start > values[i]) {
					start = values[i];
					j = i;
					}
				}
	return j;
	}
	public static void swap (int[] array, int index1, int index2) {
//		int c = array[index1];
//		int d = array[index2];
//		array[index2] = c;
//		array[index1] = d;
		
		int c = array[index1];
		array[index1] = array[index2];
		array[index2] = c;
	}
	
	public static void sort (int[] array2) {
		System.out.println("\nPradinė reikšmė: ");
		System.out.println(Arrays.toString(array2)+ "\n");
		for (int a = 0; a < array2.length; a++) { 
			swap(array2, a, indexOfTheSmallestStartingFrom(array2, a));
			System.out.println(Arrays.toString(array2));
			}
		}
		
//		for (int a = 1; a < array2.length; a++) 
//		for (int b = array2.length-1; b >= a; b--) {
//			if (array2[b-1] > array2[b]) {
//				int t = array2[b-1];
//				array2[b-1] = array2 [b];
//				array2[b] = t;
//			}
//		}
//	for (int i = 0; i < array2.length; i++) System.out.print(" " + array2[i]);
// -----------------------------------------------------------------------------
//		for (int i = 0; i < array2.length; i++) {
//			smallest(array2);
//			System.out.print(" " + smallest(array2));
//			swap(array2, smallest(array2), i);
//			System.out.print(" " + array2[i]);
//		}
		
    public static void main(String[] args) {
        // write testcode here
    	//		index = 0, 1, 2, 3, 4
    	int[] values = {6, 1, 8, 2, 10};
    	System.out.println("smallest: " + smallest(values));
    	System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
    	System.out.println(indexOfTheSmallestStartingFrom(values, 1));
    	System.out.println(indexOfTheSmallestStartingFrom(values, 2));
    	System.out.println(indexOfTheSmallestStartingFrom(values, 3));
    	
    	int[] array = {3, 2, 5, 4, 8};
    	System.out.println(Arrays.toString(array));
    	swap(array, 1, 0);
    	System.out.println(Arrays.toString(array));
    	swap(array, 0, 3);
    	System.out.println(Arrays.toString(array));
    	
    	int[] xxx = {8, 3, 7, 9, 1, 2, 4};
    	sort(xxx);
    }
}
