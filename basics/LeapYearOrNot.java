package basics;
import java.util.Scanner;
public class LeapYearOrNot 
{
      Scanner sc=new Scanner(System.in);
      void LeapOrNot()
      {
    	  int year;
    	  System.out.println("enter the year:");
    	  year=sc.nextInt();
    	  if(year%100==0)
    	  {
    		  if(year%400==0)
    		  {
    			  System.out.println("leap year");
    		  }
    		  else
    		  {
    			  System.out.println("not leap year");
    		  }
    	  }
    	  else
    	  {
    		  if(year%4==0)
    		  {
    			  System.out.println("is leap year");
    		  }
    		  else
    		  {
    			  System.out.println("is not leap year");
    		  }
    	  }
      }
	public static void main(String[] args) 
	{
		LeapYearOrNot l=new LeapYearOrNot();
		l.LeapOrNot();
	}

}
