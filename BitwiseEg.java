package operators;

public class BitwiseEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=6;
int c=a&b;
int d=a|b;
int e=a^b;
int f=~a;
int g=~b;
int h=a<<1;
int i=a>>>1;
int j=a>>1;
System.out.println("Bitwise &answer"+c);
System.out.println("Bitwise |answer"+d);
System.out.println("Bitwise |answer"+e);
System.out.println("1st complement"+f);
System.out.println("1st complement b"+g);	
System.out.println("shift left 1"+h);
System.out.println("shift right 1"+i);
System.out.println("shift right"+j);
	}
}
