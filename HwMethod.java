package method;
import java.util.*;
public class HwMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter number in inches");
int num=sc.nextInt();
 myFun(num);

	}
	public static void myFun(int n) {
		int ft=n/12;
		int in=n%12;
		System.out.println(ft+"feet"+in+"inches");}
	}


