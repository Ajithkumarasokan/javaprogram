package basics;

public class MethodDemo 
{
    void put()
    {
    	System.out.println("Its a put method");
    }
    int print()
    {
    	int no=10;
    	return no;
    }
    void disp(double per)
    {
    	System.out.println("per:"+per);
    }
    double avg(double no1,double no2)
    {
    	double average=(no1+no2)/2;
    	return average;
    }
	public static void main(String[] args) 
	{
		MethodDemo md=new MethodDemo();
		md.put();
		System.out.println(md.print());
		md.disp(98.80);
		System.out.println("avg method:"+md.avg(98.90,23.45));
	}
}
