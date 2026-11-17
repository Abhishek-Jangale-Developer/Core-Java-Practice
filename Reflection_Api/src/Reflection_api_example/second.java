package Reflection_api_example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class second {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		
		Class<?>cls = Class.forName("Reflection_api_example.Liblary");
		
		Constructor<?> cons = cls.getDeclaredConstructor(int.class,String.class);
		
		cons.trySetAccessible();
		
		Object obj = cons.newInstance(123,"Pune");
	}
}

class Liblary
{
	private Liblary(int i,String s)
	{
		System.out.println(i+s.length());
		System.out.println("*****************************");
	}
	
	
	
}