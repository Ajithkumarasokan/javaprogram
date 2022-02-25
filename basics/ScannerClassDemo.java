package basics;
import java.util.Scanner;
public class ScannerClassDemo 
{
	int Rollno;
	String Name;
	double per;
	char grade;
	Scanner sc=new Scanner(System.in);
void get()
{
	System.out.println("enter Rollno=");
	Rollno=sc.nextInt();
	System.out.println("enter Name=");
	Name=sc.next();
	System.out.println("enter per=");
	per=sc.nextDouble();
	System.out.println("enter grade=");
	grade=sc.next().charAt(0);
}
void put()
{
	System.out.println("Rollno="+Rollno);
	System.out.println("Name="+Name);
	System.out.println("percentage="+per);
	System.out.println("grade="+grade);
}
	public static void main(String[] args)
	{
		ScannerClassDemo Sd=new ScannerClassDemo();
		Sd.get();
		Sd.put();
	}
}
