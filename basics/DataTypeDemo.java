package basics;

public class DataTypeDemo
{
    int Rollno=10;
    char Alph='A';
    float sal=88.90f;
    double per=89.90;
    String Str="Its data type demo";
    void Demo()
    {
      String Str1="Its Demo methed";
      System.out.println("Str1:");
      System.out.println(Str1);
      System.out.println("Str1="+Str1);
      System.out.println("Str="+Str);
      System.out.println("Rollno="+Rollno);
      System.out.println("salary="+sal);
      System.out.println("percentage="+per);
    }
    void print()
    {
    	String Str1="Its print method";
    	System.out.println("Str1="+Str1);
        System.out.println("Str="+Str);
        System.out.println("Rollno="+Rollno);
        System.out.println("salary="+sal);
        System.out.println("percentage="+per);
    }
	public static void main(String[] args) 
	{
		DataTypeDemo dt=new DataTypeDemo();
		dt.Demo();
		dt.print();

	}

}
