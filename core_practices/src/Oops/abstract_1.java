package Oops;

public class abstract_1 {
	public static void main(String[] args) {
		
		Temp t = new Temp();
		t.start();
	}

}

abstract class Vehicle
{
	    //Abstract Method
	abstract public void start();
	
	   //Concrete Method
	void stop()
	{
		System.out.println("This is concreate Mathod");
	}
}

class Temp extends Vehicle
{
	public void start()
	{
		System.out.println("hiuhihn");
	}
	
}