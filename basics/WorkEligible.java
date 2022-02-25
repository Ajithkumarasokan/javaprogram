package basics;
import java.util.Scanner;
public class WorkEligible
{
    int Age;
    String Name;
    Scanner sc=new Scanner(System.in);
    void WorkElig()
    {
    	System.out.println("enter Name:");
    	Name=sc.next();
    	System.out.println("enter Age:");
    	Age=sc.nextInt();
    	if(Age>=18)
    	{
    		if(Age<=60)
    		{
    			System.out.println(Name+ "you are eligible for work");
    	}
    		else
    		{
    			System.out.println(Name+"you are not eligible for work");
    		}
    }
    	else if(Age<=18)
    	{
    		if(Age>=5)
    		{
    			System.out.println(Name+"you are not eligible for work");
    		}
    		else
    		{
    			System.out.println(Name+"you are not eligible for work");
    		}
    	}
    }
	public static void main(String[] args)
	{
		WorkEligible we=new WorkEligible();
		we.WorkElig();
	}

}
