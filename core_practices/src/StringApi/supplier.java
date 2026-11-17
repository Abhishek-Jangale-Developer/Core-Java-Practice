package StringApi;

import java.util.function.Supplier;

public class supplier {
	public static void main(String[] args) {
	
		// return only one object
		
		Supplier<String> sup=()->{return "abc";};
		
		System.out.println(sup.get());
	}

}
