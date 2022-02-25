package basics;
class Book
{
	int price;
	String BookName;
	String author;
	Book(int i,String n,String m)
	{
		price=i;
		BookName=n;
		author=m;
	}
	Book(Book s)
	{
		price=s.price;
		BookName=s.BookName;
		author=s.author;
	}
	void dispaly()
	{
		System.out.println(price+" "+BookName+" "+author);
	}
}
public class CopyConstructDemo
{
	
	public static void main(String[] args) 
	{
		Book b=new Book(100,"Ajith","James");
		Book b1=new Book(2000,"Soniy","Martin");
		b.dispaly();
		b1.dispaly();
	}

}
