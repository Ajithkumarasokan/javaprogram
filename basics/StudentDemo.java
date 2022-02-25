package basics;

public class StudentDemo
{
    StudentDemo(int StudId,String StudName)
{
	System.out.println("student info");
	System.out.println("StuId:"+StudId);
	System.out.println("StudName:"+StudName);
}
	public static void main(String[] args) 
	{
       StudentDemo s=new StudentDemo(101,"Ajith");
	}

}
