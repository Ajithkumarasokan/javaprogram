package basics;

public class Person
{
	int Id;
	String Name;
	Address address;
	Person(int Id,String Name,Address address)
	{
		this.Id=Id;
		this.Name=Name;
		this.address=address;
	}
	void print()
	{
		System.out.println("Id:"+Id);
		System.out.println("Name:"+Name);
		System.out.println("city:"+address.city);
		System.out.println("state:"+address.state);
		System.out.println("country:"+address.country);
	}
	public static void main(String[] args)
	{
		Address address=new Address("pune","MH","IN");
		Address address1=new Address("mumbi","MH","IN");
		Person p=new Person(101,"rohan",address);
		Person p1=new Person(102,"soham",address1);
		p.print();
		p1.print();
		
	}

}
