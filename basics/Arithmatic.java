package basics;
public class Arithmatic
{
    int no1=30,no2=3,ans;
    void sum()
    {
    	ans=no1+no2;
    	System.out.println("no1="+no1);
    	System.out.println("no2="+no2);
    	System.out.println("Addition="+ans);
    }
    void subans(int num1,int num2)
    {
    	int subans=num1-num2;
    	System.out.println("num1="+num1);
    	System.out.println("num2="+num2);
    	System.out.println("subtraction="+subans);
    }
    int multi()
    {
    	ans=no1*no2;
    	System.out.println("no1="+no1);
    	System.out.println("no2="+no2);
    	System.out.println("multiplication="+ans);
    	return ans;
    }
    double div(double n1,double n2)
    {
    	double divans=n1/n2;
    	System.out.println("n1="+n1);
    	System.out.println("n2="+n2);
    	System.out.println("division="+divans);
    	return divans;
    }
	public static void main(String[] args)
	{
		Arithmatic a=new Arithmatic();
		System.out.println("***********Addition******************");
		a.sum();
		System.out.println("***********Subtraction******************");
		a.subans(30,10);
		System.out.println("***********Multiplication******************");
		a.multi();
		System.out.println("***********Divition******************");
		a.div(20.4,2.0);
	}

}
