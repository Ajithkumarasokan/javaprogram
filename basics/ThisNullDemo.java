package basics;

public class ThisNullDemo
{
	int rollNo;
	String Name;
	float per;
	void percentage()
	{
		int sub1=98,sub2=78,sub3=97;
		double per=(sub1+sub2+sub3)/3;
		System.out.println("percentage="+per);
	}
	ThisNullDemo(int rollNo,String Name,float per)
	{
		this.rollNo=rollNo;
		this.Name=Name;
		this.per=per;
		this.percentage();
	}
	void display()
	{
		System.out.println(rollNo+" "+Name+" "+per);
	}
	public static void main(String[] args)
	{
		ThisNullDemo tnd=new ThisNullDemo(11,"Anith",5000f);
		ThisNullDemo tnd1=new ThisNullDemo(105,"Ajith",7000f);
        tnd.display();
        tnd1.display();
	}

}
