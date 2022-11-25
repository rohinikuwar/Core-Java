import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student[] student=new Student[2];
		int loc=0;
		while(true)
		{
		System.out.println("1.Add new Student\n2.Search to student by id\n3.Find percentage and GPA\n4.Display all students\n5.Exit");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();

		switch(choice)
		{
		case 1:

			StudentService.acceptOneStudentdata(student, loc);
			loc++;
			break;

		case 2: Student s=StudentService.searchStudent(student,loc);
		if(s==null)
		{
			System.out.println("Student not found");
		}
		else
		{
			System.out.println("Student found");
			System.out.println(s);
		}
		break;
		case 3:float Per=StudentService.calPercentage(student, loc);
		
			System.out.println("Pecentage"+Per);
			if(Per==0)
			{
				System.out.println("Student not found");
			}
			else
			{
				System.out.println("GPA is:"+StudentService.calGPA(Per));
		    }
		break;
		
		case 4: StudentService.displayStudentdata(student,loc);
		break;
		case 5: System.out.println("Exit");
		break;
		}

	}
	}
}
