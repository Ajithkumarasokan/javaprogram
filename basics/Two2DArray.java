package basics;
import java.util.Scanner;
public class Two2DArray
{
	Scanner sc=new Scanner(System.in);
	int row,column;
	void TwoDArrarDemo()
	{
		int arr[][]= {{1,2,3},{2,4,5},{4,8,7}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	void Accept()
	{
		System.out.println("enter row size:");
		row=sc.nextInt();
		System.out.println("enter column size:");
		column=sc.nextInt();
		int arr1[][]=new int[row][column];
		int arr2[][]=new int[row][column];
		int sum[][]=new int[row][column];
		System.out.println("enter 1st matrix element");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=sc.nextInt();
				arr2[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("sum of two matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=arr1[i][j]-arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
	}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=arr1[i][j]/arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
		}
		}
	public static void main(String[] args)
	{
		Two2DArray td=new Two2DArray();
		//td.TwoDArrarDemo();
		td.Accept();
	}
}
