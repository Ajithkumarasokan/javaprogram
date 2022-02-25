package basics;
import java.util.Scanner;
class college
{
	int collegeId;
	String collegeName;
	Scanner sc=new Scanner(System.in);
	void collegeGet()
	{
		System.out.println("enter collegeId:");
		collegeId=sc.nextInt();
		System.out.println("enter collegeName:");
		collegeName=sc.next();
	}
}
class Learner extends college
{
	int studId;
	String studName,course;
	void StudentPrint()
	{
		System.out.println("enter studId:");
		studId=sc.nextInt();
		System.out.println("enter studName:");
		studName=sc.next();
		System.out.println("enter course:");
		course=sc.next();
	}
}
class Trainer extends college
{
	int teacherId;
	String teacherName,designation;
	void TrainerDisp()
	{
		System.out.println("enter teacherId:");
		teacherId=sc.nextInt();
		System.out.println("enter teacherName:");
		teacherName=sc.next();
		System.out.println("enter designation:");
		designation=sc.next();
	}
}
class Aluminii extends college
{
	String TC,LC;
	void dispaly()
	{
		System.out.println("enter TC:");
		TC=sc.next();
		System.out.println("enter LC:");
		LC=sc.next();
	}
}
public class HirarchicalInherit 
{
	
	public static void main(String[] args)
	{		
		Learner learn=new Learner();
		Trainer train=new Trainer();
		Aluminii l=new Aluminii();
	    learn.collegeGet();
	    learn.StudentPrint();
	    train.collegeGet();
	    l.collegeGet();
	    l.dispaly();
	}
}
