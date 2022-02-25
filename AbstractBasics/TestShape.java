package AbstractBasics;
class Rectangle1 extends shape1
{

	@Override
	void draw()
	{
		System.out.println("Rectangle.............");
	}
}
class circle1 extends shape1
{

	@Override
	void draw()
	{
		System.out.println("Circle................");		
	}	
}
public class TestShape 
{
	public static void main(String[] args) 
	{
		shape1 s=new Rectangle1();
		s.draw();
		shape1 s1=new circle1();
		s1.draw();
	}

}
