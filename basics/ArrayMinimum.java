package basics;
import java.util.Scanner;
public class ArrayMinimum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array element:");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array element are:");
		for(int i:arr)
		{
			System.out.println(i);
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("smalest element present in get array:"+min);
		System.out.println("smalest element present in get array:"+max);
	}
}
