package basics;
class Demo2
{
	
}
class Test
{
	
}
public class InstanceOfOperatorDemo extends Test
{
	public static void main(String[] args) 
	{
		InstanceOfOperatorDemo demo=new InstanceOfOperatorDemo();
		Demo2 d=new Demo2();
		Test t=new Test();
		System.out.println(demo instanceof InstanceOfOperatorDemo);
		System.out.println(demo instanceof Test);
		System.out.println(d instanceof Demo2);
		System.out.println(t instanceof InstanceOfOperatorDemo);
	}

}
