package basics;

public class Studutent1 
{
	int Rollno=10;
	String Name="Ajith";
	double per=88.90;
void print()
{
 System.out.println("Rollno="+Rollno);
 System.out.println("Name="+Name);
 System.out.println("Percentage="+per);
 System.out.println("------------------------------------------------");
}
void disp(int Rollno,String Name,double per)
{
	System.out.println("---------------------------------------------");
	System.out.println("Rollno="+Rollno);
	System.out.println("Name="+Name);
	System.out.println("percentage="+per);
}
	public static void main(String[] args) 
	{
       Studutent1 S1=new Studutent1();
       Studutent1 S2=new Studutent1();
       Studutent1 S3=new Studutent1();
       S1.print();
       S2.disp(30, "Seema",99.30);
       S3.disp(20,"ram", 88.90);
}
}
