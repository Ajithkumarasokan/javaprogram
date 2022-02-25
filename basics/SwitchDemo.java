package basics;
import java.util.Scanner;
public class SwitchDemo 
{
    Scanner sc=new Scanner(System.in);
    void MenuDrive()
    {
    	int ch;
    	System.out.println("enter your choice of month:");
     ch=sc.next().charAt(0);
    	switch(ch)
    	{
    	case 1:
    		System.out.println("jan");
    		break;
    	case 2:
    		System.out.println("feb");
    		break;
    	case 3:
    		System.out.println("march");
    		break;
    	case 4:
    		System.out.println("april");
    		break;
    	case 5:
    		System.out.println("may");
    		break;
    	case 6:
    		System.out.println("june");
    		break;
    	default:
    		  System.out.println("invalid");
    		  break;
    	}
    }
    void charDemo()
    {
    	System.out.println("******************Menus**************************");
    	System.out.println("R.RED");
    	System.out.println("P.PINK");
    	System.out.println("Y.YELLOW");
    	System.out.println("G.GREEN");
    	System.out.println("enter your choice:");
    	char ch=sc.next().charAt(0);
    	switch(ch)
    	{
    	case 'R':
    		System.out.println("its Red");
    		break;
    	case 'P':
    		System.out.println("its pink");
    		break;
    	case 'Y':
    		System.out.println("its yellow");
    		break;
    	case 'G':
    		System.out.println("its green");
    		break;
    		default:
    			System.out.println("its invalid");
    	}
    }
    void Hotal()
    {
    	System.out.println("*******MenuCard***********");
    	System.out.println("1.southIndian");
    	System.out.println("2.maharashtrian");
    	System.out.println("3.punjabi");
    	System.out.println("enter your choice:");
    	char str=sc.next().charAt(0);
    	switch(str)
    	{
    	case 1:
    		System.out.println("Batata Vada");
    		System.out.println("masala vada");
    		break;
    	case 2:
    		System.out.println("onion vada");
    		System.out.println("dosa");
    		break;
    	case 3:
    		System.out.println("biriyani");
    		System.out.println("idaly");
    		break;
    		default:
    			System.out.println("its invalid");
    			break;
    	}
    }
	public static void main(String[] args)
	{
		SwitchDemo md=new SwitchDemo();
		//md.MenuDrive();
		//md.charDemo();
		md.Hotal();
	}

}
