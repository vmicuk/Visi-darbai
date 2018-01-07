
public enum Numbers {
	EVEN, ODD;
	
	boolean testNumber (double x) {
		switch(this) {
		case EVEN: if (x % 2 == 0) return true;
		else return false;
		
		case ODD: if (x % 2 != 0) return true;
		else return false;
		
		default: throw new AssertionError("Unknown error " + this);
		}
	}
}
