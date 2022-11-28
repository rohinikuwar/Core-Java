package com.demo.beans;

public class PhdStudent extends Student{
	private int m1,m2,m3;
	private String spsub;
	private int spmarks;

	public PhdStudent() {
		this.m1=0;
		this.m2=0;
		this.m3=0;
		this.spsub=null;
		this.spmarks=0;

	}
	public PhdStudent(String name,String add,int m1,int m2, int m3,String spsub,int spmarks) {
		super(name,add);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.spsub=spsub;
		this.spmarks=spmarks;
	}
	public String toString() {
		return super.toString()+ "PhdStudent [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ","
				+ " spsub=" + spsub + ", spmarks=" + spmarks + "]";
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public String getSpsub() {
		return spsub;
	}
	public void setSpsub(String spsub) {
		this.spsub = spsub;
	}
	public int getSpmarks() {
		return spmarks;
	}
	public void setSpmarks(int spmarks) {
		this.spmarks = spmarks;
	}
	public float calPercentage() {
		int total=m1+m2+m3+spmarks;
		float Per=(total*100)/400;
		return Per;
	}
}
