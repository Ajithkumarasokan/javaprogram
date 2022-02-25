package basics;
import java.util.Scanner;
public class Factorial
{
     Scanner sc=new Scanner(System.in);
     void factorial()
     {
    	 int num,fact=1,i=1;
    	 System.out.println("enter the number:");
    	 num=sc.nextInt();
    	 while(i<=num)
    	 {
    		 fact=fact*i;
    		 i++;
    	 }
    	 System.out.println("factorial is:"+num+"is:"+fact);
     }
	public static void main(String[] args) 
	{
       Factorial f=new Factorial();
       f.factorial();
	}
	
     
}
