package basics;
import java.util.Scanner;
public class Employee 
{
	int empId;
	String empName;
	double salary;
	float It;
	char grade;
	Scanner sc=new Scanner(System.in);
void get()
{
	System.out.println("enter empId=");
	empId=sc.nextInt();
	System.out.println("enter empName=");
	empName=sc.next();
	System.out.println("enter salary=");
	salary=sc.nextDouble();
	System.out.println("enter It=");
	It=sc.nextFloat();
	System.out.println("enter grade=");
	grade=sc.next().charAt(0);
}
void put()
{
	System.out.println("empId="+empId);
	System.out.println("empName="+empName);
	System.out.println("salary="+salary);
	System.out.println("It="+It);
	System.out.println("grade="+grade);
}
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.get();
		e1.put();
	}
}
