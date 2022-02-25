package basics;

public class StudStaticDemo 
{
	int Rollno;
	String Name;
	static String Institute="Edubridge";
	StudStaticDemo(int r,String n)
	{
		Rollno=r;
		Name=n;
	}
	void put()
	{
		System.out.println("Rollno="+Rollno);
		System.out.println("Name="+Name);
		System.out.println("Institute="+Institute);
	}
	public static void main(String[] args) 
	{
		StudStaticDemo sd=new StudStaticDemo(1,"siya");
		StudStaticDemo sd1=new StudStaticDemo(2,"riya");
		sd.put();
		sd1.put();
	}
}
