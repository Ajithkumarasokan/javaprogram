package basics;
class Bank
{
	int getRateOfInterst()
	{
		return 0;
	}
}
	class AXIS extends Bank
	{
		int getRateOfInterst()
		{
			return 8;
		}
	}
		class HDFC extends Bank
		{
			int getRateOfInterst()
			{
				return 9;
			}
		}
			class SBI extends Bank
			{
				int getRateOfInterst()
				{
					return 7;
				}
			}
public class OverRideTest
{
	public static void main(String[] args)
	{
		Bank sbibank=new SBI();
		Bank hdfc=new HDFC();
		Bank axis=new AXIS();
		System.out.println("SBI rate of interst:"+sbibank.getRateOfInterst());
		System.out.println("HDFC rate of interst:"+hdfc.getRateOfInterst());
		System.out.println("AXIS rate of interst:"+axis.getRateOfInterst());		
	}
}
