import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, max;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		System.out.print("c: ");
		c = sc.nextInt();
		System.out.print("d: ");
		d = sc.nextInt();
		max = (Math.max(a, b) | Math.max(c, d));
		System.out.println(max);
	}

}
