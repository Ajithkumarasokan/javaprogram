package basics;

public class ConstructorDemo {

	ConstructorDemo()
	{
		System.out.println("its a default constructor");
	}
	ConstructorDemo(String str)
	{
		System.out.println("its a parameterized constructor");
	}
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo("hello");
        
	}

}
