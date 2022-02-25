package basics;
import java.util.Scanner;
public class NextLineDemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:");
		String Str=sc.nextLine();
		System.out.println("you have enterd:"+Str);
        sc.close();
	}

}
