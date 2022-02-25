package basics;
import java.util.Scanner;
public class PalindromeDemo
{	
	Scanner sc=new Scanner(System.in);
	void Palin()
	{
		int rem,rev=0,temp,no;
		System.out.println("enter number:");
		no=sc.nextInt();
		temp=no;
		while(no>0)
		{
			rem=no&10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(temp==rev)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number");
	}
	public static void main(String[] args)
	{
	   PalindromeDemo p=new PalindromeDemo();
	   p.Palin();
	}

}
