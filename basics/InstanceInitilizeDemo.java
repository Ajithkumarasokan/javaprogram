package basics;
class A
{
	A()
	{
		System.out.println("its parent class constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("its child class constructor");
	}
	{
		System.out.println("its instace initialize block");
	}
}
public class InstanceInitilizeDemo 
{

	public static void main(String[] args) 
	{	
		B bubj=new B();
	}

}
