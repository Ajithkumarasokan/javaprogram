package basics;

 class Animal
{
	void eat()
	{
		System.out.println("eating..........");
	}
}
class Tiger extends Animal
{
	void Run()
	{
		System.out.println("Runing..............");
	}
}
class Cat extends Animal
{
	void Sleep()
	{
		System.out.println("Slepping............");
	}
}
public class HieraricalInheritance
{
	public static void main(String[] args)
	{
		Tiger t=new Tiger();
		Cat c=new Cat();
		t.Run();
		t.eat();
		c.eat();
		c.Sleep();
	}

}
