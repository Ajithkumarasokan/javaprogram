package basics;
class fruit //parent
{
	void eat()
	{
		System.out.println("Eating...............");
	}
}
class mango extends fruit
{
void eat()
{
	System.out.println("Eating mango.........");
}
}
public class MethodOverRiding 
{
	public static void main(String[] args) 
	{
		mango m=new mango();
		m.eat();
	}

}
