package basics;
class StudentCopy
{
	int id;
	String Name;
	StudentCopy(int i,String n)
	{
		id=i;
		Name=n;
	}
	StudentCopy(StudentCopy S)
	{
		id=S.id;
		Name=S.Name;
	}
	void dispaly()
	{
		System.out.println(id+" "+Name);
	}
}
public class CopyConstructor
{
	
	public static void main(String[] args) 
	{
		StudentCopy stud=new StudentCopy(10,"Ram");
		StudentCopy stud1=new StudentCopy(stud);
		stud.dispaly();
		stud1.dispaly();
	}
}
