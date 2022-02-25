package basics;

import java.util.Scanner;

public class PosNeg 
{
	Scanner sc=new Scanner(System.in);
	void get()
	{
		int num;
		System.out.println("number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("given number is positive");
		}
		else if(num<0)
		{
			System.out.println("given number is negative");
		}
		else
		{
			System.out.println("given number is zero");
		}
	}
	public static void main(String[] args) 
	{
       PosNeg pn=new PosNeg();
       pn.get();
	}

}
