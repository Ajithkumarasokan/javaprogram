package basics;

import java.util.Scanner;

public class ClassDemo 
{
	int no1=10;
	String empName="Ajith";
	Scanner sc=new Scanner(System.in);
	void getData()
	{
	int no=100;
	String Name="Edubrdge";
	double sal=2393.23;
	float per=98.45f;
		System.out.println("no="+no);
		System.out.println("Name="+Name);
		System.out.println("Salary="+sal);
		System.out.println("persentage="+per);
	}
	void putData()
	{
		System.out.println("no1="+no1);
		System.out.println("empName="+empName);
	}
	void printNos()
	{
		for(int no=1;no<=10;no++)
		{
			if(no%2==0)
			{
				System.out.println(no+"is even no");	
			}
		}
	}
		void ifDemo()
		{
			if(no1%2==0)
			{
				System.out.println(no1+"is even no");
			}
				else
				{
					System.out.println(no1+"is not odd no");
				}
			}
		void oddNos()
		{
			int no=1;
			while(no<=10)
			{
				if(no%2!=0)
				{
					System.out.println(no+"is odd no.");
				}
				no++;
			}
		}
		void evenDemo()
		{
			int startValue,endValue;
			System.out.println("enter the startvalue:");
			startValue=sc.nextInt();
			System.out.println("enter the endvalue:");
			endValue=sc.nextInt();
			int i=startValue;
			do
			{
				if(i%2==0)
				{
					System.out.println(i+"is a even no");
				}
				i++;
			}while(i<=endValue);
		}
	public static void main(String[] args)
	{
		ClassDemo cd=new ClassDemo();
		//cd.getData();
		//cd.putData();
		//cd.printNos();
		//cd.ifDemo();
		//cd.oddNos();
		cd.evenDemo();

	}

}
