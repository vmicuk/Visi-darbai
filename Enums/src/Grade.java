
public enum Grade {
	A("Excellent!"), B("Well done mate!"), C("Well done!"), D("You pass!"), E("Better try again!");
	
	private String mark;
	
	Grade(String mark) {this.mark = mark;}
	
	public String getMark() {
		return mark;
	}
	
	public String toString() {
		return "Result: " + mark;
	}
}
