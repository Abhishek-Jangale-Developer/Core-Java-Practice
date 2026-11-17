package collection;

public class Contract {
	
	Book first = new Book(100,"AAAAA");
	System.out.println("gukh");
  //  System.out.println(first.hashCode());

}
class Book
{
	int Price;
	String name;
	
	public Book(int price, String name)
	{
		this.Price = Price;
		this.name = name;
	}
	
	public int hashCode()
	{
		return this.Price+name.length();
		//return Objects.hash(this.Price,this.name);
	}
}