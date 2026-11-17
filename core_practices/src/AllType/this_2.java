package AllType;

public class this_2 {
	public static void main(String[] args) {
		Temp t = new Temp();
		t.display();
		
		
	}

}
class Temp
{
	void run()
	{
		System.out.println("Running run method");
	}
	
	void display()
	{
		this.run();
		System.out.println("run display method");
		//this.run();
	}
}