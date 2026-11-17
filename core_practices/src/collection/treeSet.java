package collection;
import java.util.TreeSet;
public class treeSet {
	public static void main(String[] args)
	{
		TreeSet<Flipcart_Items> set = new TreeSet<Flipcart_Items>();

		Flipcart_Items flip = new Flipcart_Items("shoes",4.6,5000);
		Flipcart_Items flip1 = new Flipcart_Items("shirt",4.0,2005);
		Flipcart_Items flip2 = new Flipcart_Items("Bag",4.3,344);
		Flipcart_Items flip3 = new Flipcart_Items("mobile",4.1,34444);

		set.add(flip);
		set.add(flip1);
	    set.add(flip2);
	    set.add(flip3);

	    System.out.println(set);
	}
}

class Flipcart_Items implements Comparable<Flipcart_Items>
{
	String name;
	double ratings;
	int price;
	
	public Flipcart_Items(String name,double ratings,int price)
	{
		super();	

		this.name = name;
		this.ratings =  ratings;
		this.price = price;		
	}
	
	public String toString()
	{
		return this.name+""+this.ratings+""+this.price;
	}

	public int compareTo(Flipcart_Items t) 
	{
		System.out.println("*");
		return Integer.compare(this.price, t.price);

	}

}