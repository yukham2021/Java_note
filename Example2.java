package classandobject;

public class Example2 {

	public static void main(String[] args) {
	Rectangle rec1=new Rectangle();
	rec1.width=4;
	rec1.height=2;
	rec1.color="red";
	int ans=rec1.area();
	System.out.println("Area of rectangle is"+ans);
	rec1.displaycolor();
	
	Rectangle rec2=new Rectangle();
	rec2.width=7;
	rec2.height=3;
	rec2.color="Green";
	int ans1=rec2.area();
	System.out.println("Area of rectangle is"+ans1);
	rec2.displaycolor();
	

	}

}
