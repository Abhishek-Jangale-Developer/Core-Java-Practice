package Reflection_api_example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class third {

	public static void main(String[] args) throws NoSuchFieldException,ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException 
	{
		
		Class<?>cls = Class.forName("Reflection_api_example.Liblarys");
		
		Constructor<?> cons = cls.getDeclaredConstructor(int.class,String.class);
		
    	cons.trySetAccessible();
		
		Object obj = cons.newInstance(123,"Pune");
		
		Method m = cls.getDeclaredMethod("display",String.class);
		m.trySetAccessible();
		m.invoke(obj,"pune");
		
		Field f = cls.getDeclaredField("district");
		f.trySetAccessible();
		System.out.println(f.get(obj));
		f.set(obj,"beed");
		System.out.println(f.get(obj));
		
	}
}

class Liblarys
{
	
	
	private Liblarys(int i,String s)
	{
		System.out.println(i+s.length());
		System.out.println("*****************************");
	}
	
	private void display(String city)
	{
		System.out.println("welcome to:"+city);
	}
	
}