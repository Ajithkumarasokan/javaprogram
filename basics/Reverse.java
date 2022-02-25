package basics;
import java.util.Scanner;
public class Reverse
{
      int number;
      Scanner sc=new Scanner(System.in);
      void revnum()
      {
    	  System.out.println("enter number:");
    	  number=sc.nextInt();
    	  int reverse=0;
    	  while(number!=0)
    	  {
    		  int remainder=number%10;
    		  reverse=reverse*10+remainder;
    		  number=number/10;
    	  }
      }
	public static void main(String[] args)
	{
		Reverse r=new Reverse();
		r.revnum();
}
}
