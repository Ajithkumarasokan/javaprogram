package basics;
class CalculateArea
{
	void area()//method1
	{
		int r=3;
		double a=3.14*r*r;
		System.out.println("area of circle="+a);
	}
	int area(int s) //method2
	{
		return s*s;
	}
	int area(int l,int b)//method3
	{
		System.out.println("area of reactangular="+(l*b));
		return l*b;
	}
}
public class OverLoading 
{
	
	public static void main(String[] args) 
	{
		CalculateArea ca=new CalculateArea();
		ca.area();//method1
		System.out.println("area of square="+ca.area(4));//method2
		ca.area(5, 6);//method3
	}

}
