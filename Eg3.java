package selection;
import java.util.*;
public class Eg3
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your test score");
	int score=sc.nextInt();
	System.out.println("Enter your age");
	int age=sc.nextInt();
if (score>=60) {
	if (age<10) {
		System.out.println("You did a great job");
		
	}else {
		System.out.println("You did pass");
	}
}else {
	System.out.println("You did not pass");
}
	}

}
