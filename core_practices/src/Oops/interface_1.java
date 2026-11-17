package Oops;

public class interface_1 {
	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.play();
		t.stop();
	}

}
interface Student
{
	void play();
	void stop();
}

class Teacher implements Student
{
	public void play()
	{
		System.out.println("Car Started");
	}
	
	public void stop()
	{
		System.out.println("Car stoped");
	}
}
