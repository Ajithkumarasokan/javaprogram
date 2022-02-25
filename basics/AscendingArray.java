package basics;
import java.util.Scanner;
public class AscendingArray 
{
	public static void main(String[] args)
	{ 
		int size,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("element of original array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("elements of array sorted in ascending order:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
