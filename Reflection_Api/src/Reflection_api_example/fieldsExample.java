package Reflection_api_example;
import java.lang.reflect.Field;
public class fieldsExample {
	
	public static void main(String[] args) throws Exception
	{
		Class<?>cls = Class.forName("Reflection_api_example.Students");
		
		Field[] fields = cls.getDeclaredFields();
		
		System.out.println(fields.length);
		
		for(int i=0; i<fields.length;i++)
		{
			
			System.out.println(fields[i]);
		}
	}

}
class Students
{
	public String name; 
	int id;
	static String address;

}