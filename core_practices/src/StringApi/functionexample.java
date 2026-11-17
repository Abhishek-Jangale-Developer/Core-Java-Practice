package StringApi;

import java.util.function.Function;

public class functionexample {
	public static void main(String[] args) {
		/*
		 * R apply(T t)
		 * String apply(String s);
		 * not compulsory to R & T is same 
		 */
		
		Function<String,String> fun=(s)->{return s.toUpperCase();};
		
		//Function<String,String> fun=(s)->s.toUpperCase();
		
		System.out.println(fun.apply("pune"));
	}

}
