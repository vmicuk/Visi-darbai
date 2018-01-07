import java.util.Scanner;

public class Uzd18 {
	public static void burbulas(int [] array) {
		for (int a = 1; a < array.length; a++) 
		for (int b = array.length-1; b >= a; b--) {
			if (array[b-1] > array[b]) {
				int t = array[b-1];
				array[b-1] = array [b];
				array[b] = t;
			}
	}
		System.out.print("\nSurusiuotas masyvas: \n");
		for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        int arr[] = new int [50];
        Scanner in = new Scanner(System.in);
        System.out.print("Iveskite masyvo dydi: ");
        n = in.nextInt();
        arr = new int [n];
        for (int i=0;i<arr.length;i++) arr[i] = ((int) ( Math.random() * 50));
        for (int i: arr) System.out.print( i + " " );
        burbulas(arr);
    }
}