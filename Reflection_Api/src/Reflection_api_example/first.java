package Reflection_api_example;

import java.lang.reflect.Constructor;

public class first {
	
	public static void main(String[] args) throws Exception
	{
		
		Class<?>cls = Class.forName("Reflection_api_example.Employee");
		
		Constructor<?>[] constructor = cls.getDeclaredConstructors();
		
		for(int i=0; i<constructor.length;i++)
		{
			
			System.out.println(constructor[i]);
		}
		
		
	}

}
class Employee
{
	public Employee()
	{
		
	}
	
	public Employee(int i,int j)
	{
		
	}
	
	private Employee(int i)
	{
		
	}
}