package com.demo.service;

import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Exam;
import com.demo.beans.Question;

public class QuestionService {
	static Question[] java=new Question[5];
    static Question[] html=new Question[5];
    static char[] ans;
    static int marks;
    static Exam[] earr=new Exam[2];
    static{
    	java[0]=new Question(1, "Which of the following is not a Java features?","A.Dynamic","\tB.Architecture Neutral","\tC.Use of pointers","\tD.Object-oriented",'C');
    	java[1]=new Question(2, "_____ is used to find and fix bugs in the Java programs.?","A.JRE","\tB.JVM","\tC.JDK","\tD.JDB",'D');
    	java[2]=new Question(3, "What is the return type of the hashCode() method in the Object class?","A.object","\tB.int","\tC.long","\tD.void",'B');
    	java[3]=new Question(4, "Which package contains the Random class?","A.java.util package","\tB.java.lang package","\tC.java.awt package","\tD.java.io package",'A');
    	java[4]=new Question(5, " In which memory a String is stored, when we create a string using new operator?","A.stack","\tB.String memory","\tC.Heap memory","\tD.Random storage space",'C');
    
    
    	html[0]=new Question(1,"What does the abbreviation HTML stand for?","A.hypertext markup language","\tB.hightext markup language","\tC.hypertext markdown language","\tD.none of the above",'A');
    	html[1]=new Question(2,"What are the types of lists available in HTML?","A.ordered and unordered list","\tB.bulleted,numbered list","\tC.named,unnamed list","\tD.none of the above",'A');
        html[2]=new Question(3,"How to create an ordered list in HTML?","A.<ol>","\tB.<ul>","\tC.<href>","\tD.<b>",'A');
        html[3]=new Question(4,"HTML files are saved by default with the extension?","A. .html","\tB. .h","\tC. .ht","\tD.None of the above",'B');     	
    	html[4]=new Question(5,"We enclose HTML tags within?", "A.{}","\tB.<>","\tC.!!","\tD.None of the above",'B');
        ans=new char[5];
        marks=0;
        earr[0]=new Exam(1,"Java Exam",new Date(28/11/2022),java,"Java basic");
        earr[1]=new Exam(2,"Html Exam",new Date(28/11/2022),html,"html basic");
    }

	public static void displayTopic() {
		for(int i=0;i<earr.length;i++) {
			int num=i+1;
			System.out.print(num+"."+earr[i].getEname()+"\t");
		}
		
	}

	public static void displaydetails(int choice) {
		System.out.println("Topic: "+earr[choice-1].getTopic()+"  Exam Date "+earr[choice-1].getExamdate());
		
		
	}

	public static void displayQuestions(int choice) {
		for(int i=0;i<earr[choice-1].getQue().length;i++)
		{
			System.out.println(earr[choice-1].getQue()[i]);
			getAnswer(i);
		}
		showResult(choice);
	}

	private static void showResult(int choice) {
		for(int i=0;i<ans.length;i++)
		{
			if(earr[choice-1].getQue()[i].getAns()==Character.toUpperCase(ans[i]))
				marks++;
		}
		System.out.println("You got Marks:"+marks);
		if(marks>=3)
		{
			System.out.println("Congratulations you pass the exam");
		}
		else
		{
			System.out.println("Fail... Better luck next time!!!");
		}
		
	}

	private static void getAnswer(int i) {
		System.out.println("Enter your answer");
		Scanner sc=new Scanner(System.in); 
	     ans[i]=sc.next().charAt(0);
	}
    
}

