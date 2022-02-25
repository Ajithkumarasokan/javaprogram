package basics;
import java.util.Scanner;
public class SudentDemo
{
    int Rollno,Maths,Phy,Chem;
    String Name;
    double per;
    Scanner sc=new Scanner(System.in);
    void get()
    {
    	System.out.println("enter Rollno=");
    	Rollno=sc.nextInt();
    	System.out.println("enter Name=");
    	Name=sc.next();
    	System.out.println("enter Maths=");
    	Maths=sc.nextInt();
    	System.out.println("enter Phy=");
    	Phy=sc.nextInt();
    	System.out.println("enter Chem=");
    	Chem=sc.nextInt();
    	sc.close();
    }
    void put()
    {
    	System.out.println("Rollno:"+Rollno);
    	System.out.println("Name:"+Name);
    	System.out.println("Maths:"+Maths);
    	System.out.println("Physics:"+Phy);
    	System.out.println("Chemistry:"+Chem);
    	per=(Maths+Phy+Chem)/3;
    	System.out.println("percentage:"+per+"%");
    	if(per>=75)
    	{
    		System.out.println("Distinction");
    	}
    	else if(per<75&&per>=60)
    	{
    		System.out.println("FirstClass");
    	}
    	else if(per<60&&per>=55)
    	{
    		System.out.println("SecondClass");
    	}
    	else if(per<55&&per>=40)
    	{
    		System.out.println("Pass");
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
    }
	public static void main(String[] args) {
		SudentDemo sd=new SudentDemo();
		sd.get();
		sd.put();

	}

}
