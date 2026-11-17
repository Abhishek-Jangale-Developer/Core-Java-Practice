package collection;

public class CqalityCheck {
	public static void main(String[] args) {
		
		Car c = new Car("Mastang");
		Car c2 = new Car("Mastang");
		
	    System.out.println(c==c2);
	    System.out.println(c.equals(c2));
		
	}

}
class Car extends Object
{
	String name;
	
	public Car(String name)
	{
		this.name=name;
	}
	
	public boolean equals(Object obj)
	{
		Car c = (Car)obj;
		return this.name.equals(c.name);
	}
}