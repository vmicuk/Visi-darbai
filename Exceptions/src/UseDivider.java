public class UseDivider {

	public static void main(String[] args) {
		try {
			IntDivider divider = new IntDivider();
			System.out.println(divider.divide(new String[] {"6", "a"} ));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}
	}
}
