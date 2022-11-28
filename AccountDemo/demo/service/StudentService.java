package com.demo.service;

import java.util.Scanner;

import com.demo.beans.MscStudent;
import com.demo.beans.PhdStudent;
import com.demo.beans.Student;

public class StudentService {


	public static Student addStudentData(int ch) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter address");
		String add=sc.next();
		System.out.println("enter m1");
		int m1=sc.nextInt();
		System.out.println("enter m2");
		int m2=sc.nextInt();
		System.out.println("enter m3");
		int m3=sc.nextInt();
		Student ms=null;
		if(ch==2)
		{
			System.out.println("Enter special subject");
			String sub=sc.next();
			System.out.println("Enter special subject marks");
			int marks=sc.nextInt();
			ms=new PhdStudent(name,add,m1,m2,m3,sub,marks);
		}
		else if(ch==1)
		{
			ms=new MscStudent(name,add,m1,m2,m3);

		}
		return ms;

	}

	public static void displayData(Student[] student, int loc) {
		for(int i=0;i<loc;i++)
		{
			if(student[i] instanceof MscStudent) {
			System.out.println((MscStudent)student[i]);}
			else if(student[i] instanceof PhdStudent) {
				System.out.println((PhdStudent)student[i]);}
		}

	}
}
	
