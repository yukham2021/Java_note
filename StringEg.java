package selection;
import java.util.*;
public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// get color from user display the colour
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color");
		String col=sc.nextLine();
		switch (col) {
		case "green":System.out.println("your favorite is green");break;
		case "white":System.out.println("your favorite is white");break;
		default:System.out.println("Please choose green or white");break;
		}
				
		
	}

}
