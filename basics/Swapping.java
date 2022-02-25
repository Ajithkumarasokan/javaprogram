package basics;
import java.util.Scanner;
public class Swapping 
{
	int no1,no2,temp=0;
     Scanner sc=new Scanner(System.in);
     void swap()
     {
    	 System.out.println("enter no1:");
    	 no1=sc.nextInt();
    	 System.out.println("enter no2:");
    	 no2=sc.nextInt();
    	 temp=no1;
    	 no1=no2;
    	 no2=temp;
    	 System.out.println("swapping by using third variable");
    	 System.out.println("no1="+no1);
    	 System.out.println("no2="+no2);
     }
	public static void main(String[] args) {
     Swapping s=new Swapping();
     s.swap();
	}

}
