package basics;

public class BookDemo
{
	int price;
	String bookName;
	Author author;
	BookDemo(int price,String bookName,Author author)
	{
		this.price=price;
		this.bookName=bookName;
		this.author=author;
	}
	void print()
	{
		System.out.println("price:"+price);
		System.out.println("bookName:"+bookName);
		System.out.println("authorName:"+author.authorName);
		System.out.println("age:"+author.age);
		System.out.println("place:"+author.place);
	}
	public static void main(String[] args)
	{
		Author author1=new Author("martin",40,"chennai");
		Author author2=new Author("alexander",50,"southafrica");
		BookDemo bd=new BookDemo(103,"littile women",author1);
		BookDemo bd1=new BookDemo(106,"grate exception",author2);
		bd.print();
		bd1.print();
	}

}
