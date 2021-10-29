package array_Eg;
import java.util.*;
public class ArrayEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a row length of an array");
int row=sc.nextInt();
System.out.println("Enter a column length of an array");
int col=sc.nextInt();
//create an array
int arr[][]=new int[row][col];
int ele=row*col;
System.out.println("Enter"+ele+"element to store an array");
//enter values to an array
for(int i=0;i<row;i++) {
	for(int j=0;j<col;j++) {
		arr[i][j]=sc.nextInt();
	}
}
//display
System.out.println("Element in array are:");
for (int i=0;i<row;i++) {
	for (int j=0;j<col;j++) {
		System.out.println("Row["+i+"]:Column["+j+"]:"+arr[i][j]);
	}System.out.println();
}
	}

}
