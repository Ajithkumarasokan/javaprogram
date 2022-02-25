package AbstractBasics;
import java.util.Scanner;
abstract class shape
{
	public abstract void draw();
	Scanner sc=new Scanner(System.in);
}
class Rectangle extends shape
{

	@Override
	public void draw() 
	{
		int l,b;
		System.out.println("enter the l:");
		l=sc.nextInt();
		System.out.println("enter the b:");
		b=sc.nextInt();
		System.out.println("the area of rectange="+(l*b));
}	
}
class circle extends shape
{

	@Override
	public void draw() 
	{
		int c;
		System.out.println("enter the value c:");
		c=sc.nextInt();
		double area=3.14*c*c;
		System.out.println("area of circle="+area);
	}
}
class square extends shape
{

	@Override
	public void draw()
	{
		int s;
		System.out.println("enter value s:");
		s=sc.nextInt();
		s=s*s;
		System.out.println("area of square="+s);
	}
}
public class ShapeDemo
{
	public static void main(String[] args) 
	{
		square sq=new square();
		circle c=new circle();
		Rectangle r=new Rectangle();
		sq.draw();
		c.draw();
		r.draw();
	}

}
