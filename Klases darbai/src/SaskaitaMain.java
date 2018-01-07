
public class SaskaitaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Saskaita s1 = new Saskaita(1, "Gig", 400);
//		Saskaita s2 = new Saskaita(2, "vi", 520);
//		Saskaita s3 = new Saskaita(3, "Vit", 699);
//		s3.transferTo(s1, 76);
//		//s2.transferTo(s1, 150);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		Saskaita sk1 = new SaskaitaKreditine(4, "Vi", 0);
		System.out.println(sk1);
		Saskaita sk2 = new SaskaitaKreditine();
		System.out.println(sk2);
		sk1.skolinti(500);
		System.out.println(sk1);
		sk1.piniguIsemimas(10);
		
	}

}
