package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.service.AccountService;

public class TestAccount {
	public static void main(String[] args) {
		int choice=0;
		do {
			System.out.println("*******Menu**********");
			System.out.println("\n1.Withdraw amount\n2.Deposite amount\n3.check balance\n4.change pin\n5.Open new account\n6.Display data\n7.Exit");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Please enter your account number");
				int accno=sc.nextInt();
				System.out.println("Enter your pin number");
				int pin=sc.nextInt();
				System.out.println("Please enter amount to withdraw");
				int amt=sc.nextInt();
				//System.out.println((AccountService.withdrawAmt(accno,pin,amt)));
				if(AccountService.withdrawAmt(accno,pin,amt))
				{
					System.out.println("Withdraw successfully");
				}
				
				break;
			case 2:System.out.println("Please enter your account number");
			int acno=sc.nextInt();
			System.out.println("Enter your pin number");
			int p=sc.nextInt();
			System.out.println("Please enter amount to deposite");
			float damt=sc.nextFloat();
			AccountService.depositeAmount(acno,p,damt);
			break;
			case 3:System.out.println("Please enter your account number");
			int acn=sc.nextInt();
			System.out.println("Enter your pin number");
			int pinno=sc.nextInt();
				float bal=AccountService.checkBal(acn,pinno);
				if(bal!=-1)
				{
					System.out.println("Available balance is:"+bal);
				}
				else
				{
					System.out.println("Invalid account number or pin");
				}
				break;
			case 4:
				System.out.println("enter Account no.");
				accno=sc.nextInt();
				System.out.println("Enter old pin number");
				pin=sc.nextInt();
				System.out.println("Enter new pin number");
				int newpin=sc.nextInt();
				boolean status =AccountService.changepin(accno,pin,newpin);
				if(status)
				{
					System.out.println("Pin changed successfully");
				}
				else
				{
					System.out.println("Pin not changed");
				}
				break;
			case 5: 
				
				System.out.println("Enter account type\n1.Savings Account\n2.Demat account");
				int choice1=sc.nextInt();
				System.out.println("Enter your name");
				String name2=sc.next();
				System.out.println("Enter account number");
				int id2=sc.nextInt();
				System.out.println("Enter your pin number");
				int pin2=sc.nextInt();
                System.out.println("Enter opening balance");
				float balance=sc.nextFloat();
				System.out.println("Enter mobile number");
				String mobNo=sc.next();
				float commsn=0.0f;
				String checkbkno=null;
				if(choice1==2)
				{
					System.out.println("Enter commision");
					commsn=sc.nextFloat();
				}
				else if(choice1==1)
				{
					System.out.println("Enter checkbook number");
					checkbkno=sc.next();
				}
				AccountService.OpenAccount(id2,name2,pin2,balance,mobNo,checkbkno, commsn,choice1);
				break;
			case 6: AccountService.displayAll();break;
			case 7:System.out.println("Thank you for using our system");
			break;
			}
		}while(choice!=7);
	}
}
