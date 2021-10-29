package array_Eg;
import java.util.*;
public class TwoDEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[][]=new int[2][3];
for (int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		System.out.println("Enter a number");
		arr[i][j]=sc.nextInt();
	}
}
for (int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(arr[i][j]+"\t");
	}System.out.println();
}
	
	//sum
int sum=0;
for (int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		sum+=arr[i][j];
	}
}System.out.println("Sum:"+sum);
}}


