package com.demo.test;

import java.util.Scanner;

import com.demo.service.QuestionService;

public class TestQuestion {
	public static void main(String[] args) {
		int choice =0;
		do{
			System.out.println("********MENU*********");
			QuestionService.displayTopic();
			System.out.println("3.Exit");
			System.out.println("\n Select Exam");
		    Scanner sc=new Scanner(System.in);
			choice =sc.nextInt();
			switch(choice) {
			case 1:QuestionService.displaydetails(choice);
			QuestionService.displayQuestions(choice);
			
			break;
			case 2:QuestionService.displaydetails(choice);
			QuestionService.displayQuestions(choice);
			break;
			case 3:System.out.println("Thank you!!!");
			break;
			}
			System.out.println("Do you want continue.....Y/N");
			char y=Character.toUpperCase(sc.next().charAt(0));
			if(y=='N')
			{
				System.out.println("Thank you! Visit Again");
				System.exit(0);
			}
			
	}while(choice!=3);

}
}