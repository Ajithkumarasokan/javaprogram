package basics;

public class TestCourseEncapsulation {

	public static void main(String[] args)
	{
		CourseEncapsulation ce=new CourseEncapsulation ();
		ce.setCourseId(101);
		ce.setCourseName("Pooja");
		ce.setCoursefee(100000);
		System.out.println(ce.getCourseId());
		System.out.println(ce.getCourseName());
		System.out.println(ce.getCoursefee());

	}

}
