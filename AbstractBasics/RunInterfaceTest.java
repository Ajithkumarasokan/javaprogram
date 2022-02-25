package AbstractBasics;
public class RunInterfaceTest implements Runnable 
{
	public void run()
	{
		System.out.println("its run method from runnable interface");
	}
	public static void main(String[] args) 
	{
		RunInterfaceTest test=new RunInterfaceTest();
		test.run();
	}

}
