package AllType;

public class this_1 {
	public static void main(String[] args) {
		Student s = new Student(101,"Abhishek");
		s.Girls();
		
		
	}

}
class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
		
		System.out.println(id);
		System.out.println(name);
	}
	
	void Girls()
	{
		System.out.println(name);
	}
	
}
