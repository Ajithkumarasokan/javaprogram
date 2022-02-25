package basics;

public class ParentClass
{
	protected void Parentmethod()
	{
		System.out.println("its a paraent class");
	}
}
class Childclass extends ParentClass
{
	void ChildMethod()
	{
		System.out.println("its a child class");
	}
	public static void main(String[] args) 
	{
		Childclass  ch=new Childclass();
		ch.ChildMethod();
		ch.Parentmethod();
		ParentClass pc=new ParentClass();
		pc.Parentmethod();

	}

}
