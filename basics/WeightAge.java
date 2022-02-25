package basics;
import java.util.Scanner;
public class WeightAge
{
    int Weight,Age;
    Scanner sc=new Scanner(System.in);
    void BloodDonation()
    {
    	System.out.println("enter Weight:");
    	Weight=sc.nextInt();
    	System.out.println("enter Age:");
    	Age=sc.nextInt();
    	if(Weight>=45)
    	{
    		if(Age>=18)
    		{
    			System.out.println("eligible for blood donation");
    		}
    		else
    		{
    			System.out.println("not eligible for blood donation");
    		}
    	}
    		else
    		{
    			if(Weight>=45)
    			{
    				System.out.println("not eligible for blood donation");
    		
    			}
    			else
    			{
    				System.out.println("not eligible for blood donation");
    			}
    		}
    }
	public static void main(String[] args)
	{
		WeightAge wa=new WeightAge();
		wa.BloodDonation();
	}

}
