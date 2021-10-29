package recursion;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter a number");
int number=sc.nextInt();
double result=armstrong (number);
if (result==number) {
	System.out.println(number+"It is armstrong number:");
}else
{
	System.out.println(number+"It is not armstrong number:");
}
	}
static double total=0;
static int remainder=0;
public static double armstrong(int number) {
	if(number>0) {
		remainder=number%10;//split digit
		total+=Math.pow(remainder, 3);
		armstrong (number/10);
	}return total;
}
}
