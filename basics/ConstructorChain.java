package basics;

public class ConstructorChain 
{
	ConstructorChain()
	{
		this("Edubridge");
		System.out.println("default constructor called");
	}
	ConstructorChain(String str)
	{
		this(100);
		System.out.println("parameterized constructor called");
	}
	ConstructorChain(int no)
	{
		System.out.println("int constructor called");
	}
	public static void main(String[] args) 
	{
		ConstructorChain cc=new ConstructorChain();
	}

}
