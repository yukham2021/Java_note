package classandobject;

import java.util.Scanner;

public class Bankaccount {
	int account_number;
	String name;
	double balance;
	Scanner sc=new Scanner(System.in);
	public Bankaccount(int account_number,String name) {
		balance=0;
		this.account_number=account_number;
		this.name=name;
	}
	public void deposit() {
		System.out.println("Enter deposit amount");
		double amount=sc.nextDouble();
		balance=amount;
		System.out.println("Deposit Successful");}
	public void withdrawl() {
		System.out.println("Enter withdrawl amount");
		double wamt=sc.nextDouble();
		if (wamt>balance) {
			System.out.println("Amount is insufficient");
			
		}else {
			balance-=wamt;
			System.out.println("Withdrawl Successful");
		}
	}
	public void balance() {
		System.out.println("Current Balance is"+balance);
	}
	public static void main(String []args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number:");
		int accno=sc.nextInt();
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		sc.next();
		
		Bankaccount bacc=new Bankaccount(accno,name);
		do {
			System.out.println("1.Deposit\n2.Withdrawl\n3.Current Balance\n4.Exit\nChoice:");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:bacc.deposit();break;
			case 2:bacc.withdrawl();break;
			case 3:bacc.balance();break;
			}
		}while (choice!=4);
		
	}
	}


