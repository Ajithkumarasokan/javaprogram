package basics;
class Bike1 //parent
{
	int speedlimit=90;
	void run()
	{
		speedlimit=200;
		System.out.println("speedlimit="+speedlimit);
	}
}
class car extends Bike1
{
	void run()
	{
		System.out.println("its form car");
	}
}
public class FinalDemo
{
	public static void main(String[] args) 
	{
		Bike1 b=new Bike1();
		b.run();
		car c=new car();
		c.run();
	}

}
