package core_practices;

public class this_4 {
	public static void main (String args[])
	{
		System.out.println(Aeroplane.age);
		
		Aeroplane aero = new Aeroplane();
		Aeroplane aero2 = new Aeroplane();
		
		System.out.println(aero.name);
	}

}

class Airoplane
{
	static int age;
	String name;
	
	static
	{
		age = 23;
		System.out.println("This is static block...");
	}
	
	
	{
		name = "asdsd";
		System.out.println("This is instance variable");
	}
	
	public Airoplane()
	{
		System.out.println("constructor is called...");
		
	}
}