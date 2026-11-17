package OptionalClass;

import java.util.Optional;

public class sixth {
	
	
	public static void main(String[] args) {
		
		 Optional<String>ops = Optional.ofNullable(null);
		 
		 String s = ops.orElseThrow(()->{return new DemoException();});
		 
		 System.out.println(s);
		
	}

}
class DemoException extends RuntimeException
{
	
}