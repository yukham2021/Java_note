package classandobject;

public class Time {//class attribute
	int hour;
	int min;
	int sec;
	public Time(int h,int m,int s) {//constructor
		hour=h;
		min=m;
		sec=s;
	}
	public Time(int h,int m) {
		hour=h;
		min=m;
	}
	public int covertToSecond() {//method
		int second=hour*3600+min*60+sec;
		return second;
	}

}
