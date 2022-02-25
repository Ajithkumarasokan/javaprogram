package basics;

import java.util.Scanner;

public class RelationalClassDemo 
{
	Scanner sc=new Scanner(System.in);
    void Demo1()
    {
   	 int no1;
   	 int no2;
   	 System.out.println("enter no1=");
   	 no1=sc.nextInt();
   	 System.out.println("enter no2=");
   	 no2=sc.nextInt();
   	 if(no1>no2)
   	 {
   		 System.out.println("no1 is Greater");
   	 }
    }
	public static void main(String[] args)
	{
		RelationalClassDemo rd=new RelationalClassDemo();
		rd.Demo1();
	}

}
