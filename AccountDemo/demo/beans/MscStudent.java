package com.demo.beans;

public class MscStudent extends Student {
	private int m1,m2,m3;
	
	public MscStudent() {
	this.m1=0;
	this.m2=0;
	this.m3=0;

}
	public MscStudent(String name,String add,int m1,int m2, int m3) {
		super(name,add);
        this.m1=m1;
		this.m2=m2;
		this.m3=m3;

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
	public float calPercentage() {
		int total=m1+m2+m3;
		float Per=(total*100)/300;
		return Per;
	}
	public String toString() {
		return super.toString()+"MscStudent [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
}