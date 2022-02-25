package basics;
import java.util.Scanner;
public class CalculateSquare {
   Scanner sc=new Scanner(System.in);
   void square()
   {
   int num,square;
   System.out.println("enter the number:");
   num=sc.nextInt();
	   square=num*num;
   System.out.println("calculate:"+num+"is:"+square);
   }
   void cube()
   {
	 int num,cube;
	 System.out.println("enter the number:");
	   num=sc.nextInt();
	   cube=num*num*num;
      System.out.println("Cube of "+ num+ " is "+ cube);
}
   void RectandTri()
   {
	   int length,base,height,Rectangle;
	   double Triangle;
	   System.out.println("enter lenght:");
	   length=sc.nextInt();
	   System.out.println("enter base:");
	   base=sc.nextInt();
	   System.out.println("enter height:");
	   height=sc.nextInt();
	   Rectangle=length*base;
	   System.out.println("Area of a Rectangule="+Rectangle);
	   Triangle=0.5*base*height;
	   System.out.println("Area of a Triangle="+Triangle);
   }
   void AreaofCricleandAreaofPerimeter()
   {
	   int r;
	   double pi=3.14;
	   System.out.println("enter radius:");
	   r=sc.nextInt();
	   double Area,peri;
	   Area=pi*r*r;
	   peri=2*pi*r;
	   System.out.println("Area of a Circle="+Area);
	   System.out.println("Area of a perimeter="+peri);
   }
	public static void main(String[] args) {
	 CalculateSquare cs=new CalculateSquare();
	 //cs.square();
	 //cs.cube();
	 //cs.RectandTri();
	 cs.AreaofCricleandAreaofPerimeter();
	}

}
