package basics;
class parent1
{
	parent1 get()
	{
		return this;
	}
}
class child1 extends parent1
{
	child1 get()
	{
	    return this;
	}
	void print()
	{
		System.out.println("its a covarent return type");
	}
}
public class CovarentDemo
{
	public static void main(String[] args) 
	{
		child1 c=new child1();
		c.get().print();
		//or
		new child1().get().print();
	}

}
