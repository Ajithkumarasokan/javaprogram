package basics;
class Demo
{
	void get(int empId,String empName)
	{
		System.out.println("empId="+empId);
		System.out.println("empName="+empName);
	}
	void get(String empName,int empId)
	{
		System.out.println("empName="+empName);
		System.out.println("empId="+empName);
	}
}
public class OverLoadingTest 
{

	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.get(101, "Ajith");
		d.get("doni",102);
	}

}
