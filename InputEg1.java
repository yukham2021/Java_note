package scanner;
import java.util.*;
public class InputEg1 {
//get information from user
	//display the information
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
	String name=sc.nextLine();
	System.out.println("Enter age");
	int age=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter phone number");
	String ph=sc.nextLine();
	System.out.println("Enter your gender (F/M)");
	char gender=sc.next().charAt(0);
	System.out.println("Your name is"+name+"\nYour age is"+age+"\nYour phone number is"+ph+"\n Your gender is"+gender);
	
	}

}
