package StringApi;

import java.util.function.Function;

public class composeAfterThenBefore {
	public static void main(String[] args) {
		
		//first run compose or opposite of andThen
		
		Function<String,Integer>after=i->i.length();
		
		Function<String,Integer> fun2=after.compose((i)->{
			
			return i.toUpperCase();});
		
		System.out.println(fun2.apply("abcd"));
		
	
}

}
