package com.demo.beans;

public abstract class Account {
	private int id;
	private String name;
	private String mob;
	private int pin;
	protected float bal;
	
	public Account() {
		this.id=id;
		this.name=null;
		this.mob=null;
		this.pin=0;
		this.bal=0.0f;
	}
	public Account(int id,String name,String mob,int pin,float bal)
	{
		this.id=id;
		this.name=name;
		this.mob=mob;
		this.pin=pin;
		this.bal=bal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", mob=" + mob + ", pin=" + pin + ", bal=" + bal + "]";
	}
	abstract public boolean withdraw(int amt);
	
	
	public void depositeAmount(float damt) {
		this.bal=this.bal+damt;
	}
}
	


