package basics;
import java.util.Scanner;
public class Fibonaci 
{
   Scanner sc=new Scanner(System.in);
   void fibonaci()
   {
	   int no1=0,no2=1,no3;
	   System.out.println(no1);
	   System.out.println(no2);
	   for(int i=0;i<=10;i++)
	   {
		   no3=no1+no2;
		   System.out.println(no3);
		   no1=no2;
		   no2=no3;
	   }
   }
	public static void main(String[] args)
	{
		Fibonaci f=new Fibonaci();
				f.fibonaci();
	}

}
