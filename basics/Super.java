package basics;
class sports //parent
{
	int sportsFee=100000; //datamember
	String sportsName="cricket";
	sports()
	{
		System.out.println("sports counstructor");
	}
	void print()
	{
		System.out.println("sports:"+sportsFee);
		System.out.println("sports:"+sportsName);
	}
}
class sketing extends sports
{
	String Name="sketing";
	sketing()
	{
		System.out.println("sketing constructor");
	}
	void disp()
	{
		System.out.println("sportsName:"+Name);
		System.out.println("sportsFee:"+super.sportsFee);
		System.out.println("sportsName:"+super.sportsName);
	}
}
public class Super
{
	public static void main(String[] args)
	{
		sketing s=new sketing();
		s.disp();
	}
}
