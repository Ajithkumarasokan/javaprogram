package basics;
class Aparent
{
	Aparent()
	{
		System.out.println("its parent class constructor");
	}
}
class InstanceInilaizeTest extends Aparent
{
	InstanceInilaizeTest()
	{
		super();
		System.out.println("its child class constructor invoked");
	}
	InstanceInilaizeTest(int a)
	{
		super();
		System.out.println("its child class constructor invoked"+a);
	}
}
public class IntanceInitilaizeTest
{

	public static void main(String[] args) 
	{
		InstanceInilaizeTest test=new InstanceInilaizeTest();
		InstanceInilaizeTest test1=new InstanceInilaizeTest(10);
	}

}
