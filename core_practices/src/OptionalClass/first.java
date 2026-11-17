package OptionalClass;

import java.util.Optional;

public class first {
	
	static String name;
	
	public static void main(String[] args) {
		
		
		Optional<String>ops = Optional.ofNullable(name);
		
//		if(ops.isEmpty())
//		{
//			System.out.println("No value given");
//		}
//		
//		else
//		{
//			System.out.println(ops.get());
//		}
		
		
		if(ops.isPresent())
		{
			System.out.println(ops.get());
		}
		
		else
		{
			System.out.println("No such value present");
		}
	}

}
