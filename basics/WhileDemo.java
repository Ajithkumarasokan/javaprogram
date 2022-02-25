package basics;
import java.util.Scanner;
public class WhileDemo 
{
    Scanner sc=new Scanner(System.in);
    void TestWhileloop()
    {
    	int no=1;
    	while(no<=10)
    	{
    		if(no%2!=0)
    		{
    			System.out.println("no");
    		}
    		no++;
    	}
    }
    void table()
    {
    	int no,ans;
    	System.out.println("enter no:");
    	no=sc.nextInt();
    	for(int i=1;i<=10;i++)
    	{
    		ans=no*i;
    		System.out.println(no+"x"+i+"is"+ans);
    	}
    }
	public static void main(String[] args) 
	{
		WhileDemo wd=new WhileDemo();
		wd.TestWhileloop();
		wd.table();
	}
}
