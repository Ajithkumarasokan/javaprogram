package basics;
import java.util.Scanner;
public class Maximum
{
    int no1,no2,no3;
    Scanner sc=new Scanner(System.in);
    void max()
    {
    	System.out.println("enter the no1=");
    	no1=sc.nextInt();
    	System.out.println("enter the no2=");
    	no2=sc.nextInt();
    	System.out.println("enter the no3=");
    	no3=sc.nextInt();
    	if(no1<no2&&no1<no3)
    	{
    		System.out.println("no1 is maximum");
    	}
    	else if(no2<no1&&no2<no3)
    	{
    		System.out.println("no2 is maximum");
    	}
    	else
    	{
    		System.out.println("no3 is maximum");
    	}
    }
	public static void main(String[] args)
	{
		Maximum m=new Maximum();
		m.max();
	}

}
