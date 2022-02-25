package basics;
import java.util.Scanner;
public class Amstrong {
Scanner sc=new Scanner(System.in);
void armstrong()
{
	
	int num,temp,total=0;
	System.out.println("enter number:");
	num=sc.nextInt();
	while(num!=0)
	{
		temp=num%10;
		total=total+temp*temp*temp;
		num/=10;
	}
	if(total==num)
	{
		System.out.println(num+"is an armstrong number");
	}
		else
		{
			System.out.println(num+"is not an armstrong number");
}
}
	public static void main(String[] args) {
		Amstrong a=new Amstrong();
		a.armstrong();
	}

}
