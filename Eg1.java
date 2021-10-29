package overloading;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	sum(80,90);
int n1=200,n2=300,n3=400;
sum(n1,n2,n3);}
public static void sum(int a,int b) {
int sum=a+b;
System.out.println("Sum is:"+sum);
	}
	public static void sum(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum is:"+sum);
	}

}
