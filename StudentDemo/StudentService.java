import java.util.Scanner;

public class StudentService {

	public static void acceptOneStudentdata(Student[] student,int loc)
	{
		Scanner sc=new Scanner(System.in);
		if(loc<student.length)
		{
		        System.out.println("Enter Id");
				int id=sc.nextInt();
				System.out.println("Enter student name");
		        String name=sc.next();
				System.out.println("Enter marks 1");
				int m1=sc.nextInt();
				System.out.println("Enter marks 2");
				int m2=sc.nextInt();
				System.out.println("Enter marks 3");
				int m3=sc.nextInt();
				student[loc]=new Student(id,name,m1,m2,m3);
		}
		else
		System.out.println("Data limit finished");
	}
	public static Student searchStudent(Student[] student,int loc)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Id to search");
		int id=sc.nextInt();
		Student s=null;
		for(int i=0;i<loc;i++)
		{
			if(student[i].getId()==id)
			{
				s= student[i];
			}
		}
		return s;
	}
	
    public static float calPercentage(Student[] student,int loc) {
	Student s=searchStudent(student,loc);
	float Per=0;
	int total=(s.getm1()+s.getm2()+s.getm3());
    Per=(total*100)/300;
	return Per;
}
	public static char calGPA(float Per) {
		char GPA;
		if (Per>80)
		{
			GPA = 'A';
		}
		else if(Per<80 && Per>70) {
			GPA='B';
		}
		else if(Per<70 && Per>60) {
			GPA='c';
		}
		else
		{
			GPA='D';
		}
		return GPA;
	}

	public static void displayStudentdata(Student[] student, int loc)
	{
		for(int i=0;i<loc;i++) {
			System.out.println(student[i]);
		}
	}
}
