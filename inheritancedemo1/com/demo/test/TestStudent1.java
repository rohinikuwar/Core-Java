package com.demo.test;

import java.util.Scanner;

import com.demo.beans.*;
import com.demo.service.StudentService;

public class TestStudent1 {
	public static void main(String[] args) {
		int loc=0;
		Scanner sc =new Scanner(System.in);
		Student[] s=new Student[3];
		while(true) {
			System.out.println("\nEnter your choice");
			System.out.println("\n1.Msc student\n2.Phd Student\n3.Calculate percentage\n4.Display All Student \n5.Exit");
			Student s1=null;
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:s1=StudentService.addStudentData(ch);
			s[loc]=s1;System.out.println(s[loc]);loc++;
			break;
			case 2:s1=StudentService.addStudentData(ch);
			s[loc]=s1;System.out.println(s[loc]);loc++;break;
			case 3:
				for(int i=0;i<loc;i++) {
					System.out.println();
					System.out.print(s[i]);
					if((s[i] instanceof MscStudent))
					{
						System.out.print("Percentage="+((MscStudent)s[i]).calPercentage()+"%");
					}
					else if((s[i] instanceof PhdStudent))
					{System.out.print("Percentage="+((PhdStudent)s[i]).calPercentage()+"%");}
				}
				break;
			case 4:StudentService.displayData(s, loc);break;

			case 5:System.out.println("Thank you");break;

			}
			if(ch==5) {break;}
		}

	}
}

