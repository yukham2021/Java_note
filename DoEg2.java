package repitition;
import java.util.*;
public class DoEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int pc=0,nc=0,zc=0;
int user=0;
do {
	System.out.println("Enter a number");
	int num=sc.nextInt();//user input
	if(num>0) {
		pc++;
	}
	else if (num<0) {
		nc++;
	}
	else if(num==0) {
		zc++;
	}
	System.out.println("do next time or not?(1/0)");
	user=sc.nextInt();
}
while (user==1);
System.out.println("count of positive"+pc);
System.out.println("count of negative"+nc);	
System.out.println("count of zero"+zc);}
}
