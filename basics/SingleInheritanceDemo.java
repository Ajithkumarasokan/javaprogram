package basics;
class Grandparent
{
	void watch()
	{
		System.out.println("watching..........");
	}
}
	class parent extends Grandparent
	{
		void read()
		{
			System.out.println("reading..........");
		}
	}
		class child extends parent
		{
			void play()
			{
				System.out.println("playing...........");
			}
		}
public class SingleInheritanceDemo
{
	public static void main(String[] args) 
	{
		Grandparent p=new Grandparent();
	    child ch=new child();
	    p.watch();
	    ch.read();
	    ch.read();
	    ch.watch();
	    ch.play();
	    
	    
	}

}
