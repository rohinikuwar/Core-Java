package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.beans.DematAccount;
import com.demo.beans.SavingsAccount;

public class AccountService {
	public static Account[] acarr=new Account[10];
	private static int count;
	static {
		acarr[0]=new DematAccount(1,"Rohini","5689314183",1212,50000,0.2f);
		acarr[1]=new DematAccount(2,"Nilima","9589314185",1111,40000,0.2f);
		acarr[2]=new DematAccount(3,"Reva","8589314186",2222,60000,0.2f);
		acarr[3]=new SavingsAccount(4,"Pratiksha","8289314189",3333,50000,"AB52112");
		acarr[4]=new SavingsAccount(5,"Nisha","9689634185",4444,20000,"AD24352");
		acarr[5]=new SavingsAccount(6,"Rita","7489314156",5555,60000,"PA56655");
		count=6;
	}
	public static boolean withdrawAmt(int accno,int pin,int amt) {
		Account ac=searchAcc(accno);
		if(ac!=null)
		{
			if(ac.getPin()==pin)
			{
				if(ac.withdraw(amt))
				{
					return true;
				}
				else 
				{
					System.out.println("Insufficient fund");
				}
			}
			else {
				System.out.println("Invalid credentials");
			}

		}
		return false;
	}
	private static Account searchAcc(int accno) {
		for(int i=0;i<count;i++)
		{
			if(accno==acarr[i].getId())
			{
				return acarr[i];
			}
		}
		return null;
	}
	public static boolean depositeAmount(int acno,int pin, float damt) {
		Account ac1= searchAcc(acno);
		if(ac1!=null)
		{
			if(ac1.getPin()==pin)
			{
				ac1.depositeAmount(damt);
				return true;
			}
		}
		return false;
	}
	public static boolean changepin(int accno, int pin, int newpin) {
		Account ac=searchAcc(accno);
		if(ac!=null && ac.getPin()==pin)
		{
			ac.setPin(newpin);
			return true;
		}
		return false;
	}
	public static void displayAll() {
		for(int i=0;i<count;i++)
		{
			System.out.println(acarr[i]);
		}
		
	}

	public static void OpenAccount(int id2,String name2,int pin2, float balance,String mobNo,String checkbkno, float commsn,int choice1) {
		Account Anew=null;
		if(choice1==1)
		{
			Anew=new SavingsAccount(id2,name2,mobNo,pin2,balance,checkbkno);
		}
		else if(choice1==2)
		{
			Anew=new DematAccount(id2,name2,mobNo,pin2,balance,commsn);
		}
		acarr[count]=Anew;
		count++;
	}
	public static float checkBal(int accno,int pin) {
		Account ac=searchAcc(accno);
		if(ac!=null)
		{
			if(ac.getPin()==pin)
		    return ac.getBal();
		}
		return -1;
	}

}



