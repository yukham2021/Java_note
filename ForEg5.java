package repitition;
import java.util.*;
public class ForEg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int sum=0;
for(int i=1;i<=num;i++) {
	//loop body
	sum+=i;
}
System.out.println("Add 1 to 4" +sum);
	}

}
