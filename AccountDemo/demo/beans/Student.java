package com.demo.beans;

abstract public class Student {
	private static int id;
	private String name;
	private String add;
	private int sid;
	
	public Student()
	{
		this.sid=++id;
		this.name=null;
		this.add=null;
	}

public Student(String name,String add)
{
	this.sid=++id;
	this.name=name;
	this.add=add;
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

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}
abstract public float calPercentage();

public String toString() {
	return "Student [id=" + this.sid + ", name=" + this.name + ", add=" + this.add + "]";
}
}

