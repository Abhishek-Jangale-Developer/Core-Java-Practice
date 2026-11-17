package OptionalClass;

import java.util.Optional;

public class third {
	
	public static void main(String[] args) {
		

		Optional<String>ops = Optional.ofNullable(null);
		
		Optional<String> ops2 = ops.or(()->{return Optional.of("Mumbai");});
		
		System.out.println(ops2);
	}

}
