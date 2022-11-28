package com.demo.beans;

public class Question {
private int qno;
private String ques;
private String opt1,opt2,opt3,opt4;
private char ans;
private static int marks;
static {
	marks=1;
}
public Question() {
	this.qno=0;
	this.ques=null;
	this.opt1=null;
	this.opt2=null;
	this.opt3=null;
	this.opt4=null;
	this.ans=0;
	this.marks=0;
}
public Question(int qno,String ques,String opt1,String opt2,String opt3,String opt4,char ans) {
	this.qno=qno;
	this.ques=ques;
	this.opt1=opt1;
	this.opt2=opt2;
	this.opt3=opt3;
	this.opt4=opt4;
	this.ans=ans;
	this.marks=marks;
}
@Override
public String toString() {
	return "\n"+ qno +"."+ ques+"\t\t\t" +"Marks "+marks+"\n"+ opt1+opt2+opt3+opt4;
		//	+ ", opt4=" + opt4 + ", ans=" + ans + ", marks=" + marks + "]";
}
public int getQno() {
	return qno;
}
public void setQno(int qno) {
	this.qno = qno;
}
public String getQues() {
	return ques;
}
public void setQues(String ques) {
	this.ques = ques;
}
public String getOpt1() {
	return opt1;
}
public void setOpt1(String opt1) {
	this.opt1 = opt1;
}
public String getOpt2() {
	return opt2;
}
public void setOpt2(String opt2) {
	this.opt2 = opt2;
}
public String getOpt3() {
	return opt3;
}
public void setOpt3(String opt3) {
	this.opt3 = opt3;
}
public String getOpt4() {
	return opt4;
}
public void setOpt4(String opt4) {
	this.opt4 = opt4;
}
public char getAns() {
	return ans;
}
public void setAns(char ans) {
	this.ans = ans;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}


}
