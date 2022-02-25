package basics;
import java.util.Scanner;
public class Minimum
{
    int no1,no2,no3;
    Scanner sc=new Scanner(System.in);
    void min()
    {
    	System.out.println("enter the no1=");
    	no1=sc.nextInt();
    	System.out.println("enter the no2=");
    	no2=sc.nextInt();
    	System.out.println("enter the no3=");
    	no3=sc.nextInt();
    	if(no1<no2&&no1<no3)
    	{
    		System.out.println("no1 is minimum");
    	}
    	else if(no2<no1&&no2<no3)
    	{
    		System.out.println("no2 is minimum");
    	}
    	else
    	{
    		System.out.println("no3 is minimum");
    	}
    }
	public static void main(String[] args) 
	{
		Minimum m=new Minimum();
		m.min();
	}

}
