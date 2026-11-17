package ExceptionHandeling;

public class superex {
	public static void main (String args[])
	{
		Child p=new Child();
		p.show();
	}

}

class Parent
{
	int i=233;
	void show()
	{
		
		System.out.println("Parent class call");
	}
}

class Child extends Parent
{
	int i=658;
	void show()
	{
		
		System.out.println("child class call");
		super.show();
		
		System.out.println(i);
		System.out.println(super.i);
		
		
	}
	
}