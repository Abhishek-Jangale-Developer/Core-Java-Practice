package core_practices;

public class methodOverRiding {

	public static void main(String[] args) {
		
		Students stud = new Teacher();  //Polymorphic object teacher
		stud.child();
	}
}

class Students
{
	public void child()
	{
		System.out.println("child is great");
	}	
}

class Teacher extends Students
{
	public void child()
	{
		System.out.println("bad boys");
	}	
	
}