package Oops;

public class first {

	public static void main(String[] args) 
	{
		       //DMD  
		Truck b = new BharatBenz();
            
            b.start("hoihii");
            b.stop(454);
            b.run();
	}
}

abstract class Truck
{
	    //Abstract method
	abstract public void start(String i);
	abstract public void stop(int i);
	
	     //Concrete method
	public void run()
	{
		System.out.println("running the truck");
	}
}

class BharatBenz extends Truck
{
	public void start(String i)
	{
		System.out.println(i.toUpperCase());		
	}
	
	public void stop(int i)
	{
		System.out.println(400+i);
	}
	
	public void run()
	{
		System.out.println("program run......");
	}
	
}