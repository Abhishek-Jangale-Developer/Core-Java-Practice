package Reflection_api_example;
import java.lang.reflect.Method;
public class methodExample {
	
	public static void main(String[] args) throws Exception
	{
		Class<?>cls = Class.forName("Reflection_api_example.Student");
		
		//Method[] method = cls.getDeclaredMethods();
		Method[] method = cls.getMethods();
		
		
		for(int i=0; i<method.length;i++)
		{
			System.out.println(method[i]);
		}
		
		
		System.out.println("--------------------"); //My code
		
		System.out.println(method.length);
		
		System.out.println("======================");
		
	}

}
