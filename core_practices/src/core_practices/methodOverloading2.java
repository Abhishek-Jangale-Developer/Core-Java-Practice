package core_practices;
//methodOverRiding
public class methodOverloading2 {
	public static void main (String args[])
	{
		Car c = new Bike();  //Polymorphic object
		c.swift();
	}
}
class Car
{
	public void swift()
	{
		System.out.println("Swift is saden");
	}
}
class Bike extends Car
{
	public void swift()
	{
		System.out.println("Swift is Taxiii");
	}
}