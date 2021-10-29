package classandobject;

public class Timeobj {

	public static void main(String[] args) {
Time t1=new Time(2,34,45);
int se=t1.covertToSecond();
System.out.println("Equalvalent second"+se);

Time t2=new Time(1,0,0);
int se2=t2.covertToSecond();
System.out.println("Equalvalent second"+se2);

Time t3=new Time(3,0);
int sec=t3.covertToSecond();
t3.sec=0;
System.out.println("Equalvalent second"+sec);
	}

}
