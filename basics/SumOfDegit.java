package basics;
import java.util.Scanner;
public class SumOfDegit 
{
    int num;
    Scanner sc=new Scanner(System.in);
    void SumDigit()
    {
    	System.out.println("enter num:");
    	num=sc.nextInt();
    	int sum=0;
    	while(num!=0)
    	{
    		int rem=num%10;
    		sum=sum+rem;
    		num=num/10;
    	}
    	System.out.println();
    	System.out.println("sum of digits="+sum);
    }
	public static void main(String[] args)
	{
       SumOfDegit sod=new SumOfDegit();
       sod.SumDigit();
	}

}
