package basics;
import java.util.Scanner;
public class ArithmaticDemo 
{
	public static void main(String[] args)
	{
		int no1,no2,ans,ch;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter no1;");
		no1=sc.nextInt();
		System.out.println("enter no2:");
		no2=sc.nextInt();
		System.out.println("MENU");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Divition");
		System.out.println("4.Multiplication");
		System.out.println("5.Madulus");
		System.out.println("enter your choice=");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addition");
			ans=no1+no2;
			System.out.println("Addition="+ans);
		case 2:
			System.out.println("Subtarction");
			ans=no1-no2;
			System.out.println("Subtraction="+ans);
		case 3:
			System.out.println("Division");
			ans=no1/no2;
			System.out.println("Division="+ans);
		case 4:
			System.out.println("Multiplication");
			ans=no1*no2;
			System.out.println("maltiplication="+ans);
		case 5:
			System.out.println("madulus");
			ans=no1%no2;
			System.out.println("madulus="+ans);
			default:
				System.out.println("its not choice");
		}
	}
	}

