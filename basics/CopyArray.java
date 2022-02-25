package basics;

public class CopyArray
{
	void copy()
	{
		int[]arr1=new int[] {1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("elements of original array:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		CopyArray c=new CopyArray();
		c.copy();
	}

}
