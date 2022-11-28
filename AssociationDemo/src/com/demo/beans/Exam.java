package com.demo.beans;

import java.util.Date;

public class Exam {
	private int examid;
	private String ename;
	private Date examdate;
	private String topic;
	private Question[] que;
	public Exam() {
		this.examid=0;
		this.ename=null;
		this.examdate=null;
		this.topic=null;
	}
	public Exam(int eid,String ename,Date edate,Question[] que,String topic) {
		this.examid=eid;
		this.ename=ename;
		this.examdate=edate;
		this.que=que;
		this.topic=topic;
	}
	public Question[] getQue() {
		return que;
	}
	public void setQue(Question[] que) {
		this.que = que;
	}
	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", ename=" + ename + ", examdate=" + examdate + ", topic=" + topic + "]";
	}
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getExamdate() {
		return examdate;
	}
	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
