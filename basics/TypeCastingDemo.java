package basics;

public class TypeCastingDemo
{
   void WideningCasting()
   {
	   int no=10;
	   double pre=no;
	   System.out.println("no:"+no);
	   System.out.println("per:"+pre);
   }
   void NarrowingCasting()
   {
	   double avg=9.78d;
	   int no=(int)avg;
	   System.out.println("avg:"+avg);
	   System.out.println("no:"+no);
   }
	public static void main(String[] args)
	{
	   TypeCastingDemo mcd=new TypeCastingDemo();
	   mcd.WideningCasting();
	   mcd.NarrowingCasting();
	}
}
