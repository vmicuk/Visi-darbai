
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time nextSecond() {
		int bendra = this.second + this.minute*60 + this.hour*3600; 
		bendra +=1;
			this.hour = bendra/3600;
			this.minute = bendra%3600/60;
			this.second = bendra%3600%60;
			this.hour = this.hour == 24?00:this.hour;
		
		return this;
	}
	public Time previousSecond() {
		this.second -= 1;
		return this;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
