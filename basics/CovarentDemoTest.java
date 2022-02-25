package basics;
class GrandParent1
{
	GrandParent1 disp()
	{
	return this;
}
void print()
{
	System.out.println("inside the class GrandParent1");
}
}
class Parent2 extends GrandParent1
{
	Parent2 disp()
	{
		return this;
	}
	void print()
	{
		System.out.println("inside the class Parent2");
	}
}
class Child2 extends Parent2
{
	Child2 disp()
	{
		return this;
	}
	void print()
	{
		System.out.println("inside the class Child2");
	}
}
public class CovarentDemoTest
{

	public static void main(String[] args) 
	{
		GrandParent1 gp1=new GrandParent1();
		gp1.disp().print();
		Parent2 p2=new Parent2();
		p2.disp().print();
		Child2 ch2=new Child2();
		((Child2)ch2.disp()).print();
	}

}
