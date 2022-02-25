package basics;

public class EmployeeDemo
{
	int EmpId;
	String EmpName;
	double salary;
	EmployeeDemo(int Id,String Name)
	{
		EmpId=Id;
		EmpName=Name;
	}
	EmployeeDemo(int Id,String Name,double sal)
	{
		EmpId=Id;
		EmpName=Name;
		salary=sal;
	}
	void dis()
	{
		System.out.println("EmpId="+EmpId);
		System.out.println("EmpName="+EmpName);
	}
	void print()
	{
		System.out.println("EmpId:"+EmpId);
		System.out.println("EmpName:"+EmpName);
		System.out.println("salary:"+salary);
	}
	public static void main(String[] args) 
	{
		EmployeeDemo ed=new EmployeeDemo(101,"ajith");
		EmployeeDemo ed1=new EmployeeDemo(102,"pooja");
		ed.dis();
		ed1.print();

	}

}
