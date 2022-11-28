package com.demo.beans;

public class SavingsAccount extends Account {
	private String checkbook;
	public static float R;
	public static float minBal;
	static {
		R=0.04f;
		minBal=5000.0f;
	}
	public SavingsAccount()
	{
		super();
		this.checkbook=null;
	}
	public SavingsAccount(int id,String name,String mob,int pin,float bal,String checkbook)
	{
		super(id,name,mob,pin,bal);
		this.checkbook=checkbook;
	
	}
	public String getCheckbook() {
		return checkbook;
	}
	public void setCheckbook(String checkbook) {
		this.checkbook = checkbook;
	}
	public static float getR() {
		return R;
	}
	public static void setR(float r) {
		R = r;
	}
	public float getMinBal() {
		return minBal;
	}
	public void setMinBal(float minBal) {
		this.minBal = minBal;
	}
	public boolean withdraw(int amt) {
		if(bal-amt>=minBal)
		{
			this.bal=(this.bal-amt);
			return true;
		}
		return false;
			}
	@Override
	public String toString() {
		return super.toString()+"SavingsAccount [checkbook=" + checkbook + ", minBal=" + minBal + "]";
	}
	
	
}
