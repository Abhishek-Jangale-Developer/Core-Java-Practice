package core_practices;

public class temp1 {
	public static void main (String args[])
	{
		Vidyarthi first = new Vidyarthi();
		
		first.study();
		first.exam();
		
	}

}

class Vidyarthi
{
	String name;
	int roll_no;
	double marks;
	
	
	public void study() //Method name
	{   
		//Method Implementation
		System.out.println("I am studying..");
	}
	
	public void exam()
	{
		System.out.println("Semister Exam...");
	}
}


