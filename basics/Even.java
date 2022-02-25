package basics;

import java.util.Scanner;

public class Even 
{
   int num;
   Scanner sc=new Scanner(System.in);
   void Even1()
   {
	   System.out.println("enter the num");
	   num=sc.nextInt();
	   if(num%2==0)
	   {
		   System.out.println("this is even number");
	   }
	   else
	   {
		   System.out.println("this is odd number");
	   }
   }
	public static void main(String[] args) 
	{
		Even e=new Even();
		e.Even1();
	}

}
