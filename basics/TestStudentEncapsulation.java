package basics;

public class TestStudentEncapsulation 
{

	public static void main(String[] args)
	{
		StudentEncaplsulation ce=new StudentEncaplsulation();
		ce.setId(101);
		ce.setName("Ajith");
		ce.setPer(88.90);		
		System.out.println("Id:"+ce.getId());
		System.out.println("Name:"+ce.getName());
		System.out.println("per:"+ce.getPer());
	}

}
