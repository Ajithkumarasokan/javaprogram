package basics;

public class StudThisDemo 
{
	public StudThisDemo()
	{
		this(10,20);
		System.out.println("its default constructor");
	}
	StudThisDemo(int no1,int no2)
	{
		int ans=no1+no2;
		System.out.println("ans="+ans);
	}
	public static void main(String[] args)
	{
		StudThisDemo sc=new StudThisDemo();
	}

}
