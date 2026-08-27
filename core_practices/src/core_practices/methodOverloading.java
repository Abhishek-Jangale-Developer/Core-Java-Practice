package core_practices;

public class methodOverloading {
	public static void main (String args[])
	{
		World w = new World();
		w.state(45);
	}

}

class World
{
	public void state()
	{
		System.out.println("Hello World");
	}
	
	public void state(int i)
	{
		System.out.println("The maharashtra");
	}
}