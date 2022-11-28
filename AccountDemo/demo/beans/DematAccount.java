package com.demo.beans;

public class DematAccount  extends Account{
	public static float ROI;
	private float comm;
	static {
		ROI=0.08f;
	}
	public DematAccount()
	{
		super();
		this.comm=0;
	}
	public DematAccount(int id,String name,String mob,int pin,float bal,float comm)
	{
		super(id,name,mob,pin,bal);
		this.comm=comm;
	}
	public static float getROI() {
		return ROI;
	}
	public static void setROI(float rOI) {
		ROI = rOI;
	}
	public float getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	
	@Override
	public String toString() {
		return super.toString()+"DematAccount [comm=" + comm + "]";
	}
	@Override
	public boolean withdraw(int amt) {
		if(amt<=5000)
		{
			this.bal=this.bal-amt;
			return true;
		}
		return false;
	}

}
