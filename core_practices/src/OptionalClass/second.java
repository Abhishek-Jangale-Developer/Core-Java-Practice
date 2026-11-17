package OptionalClass;

import java.util.Optional;

public class second {
	
	public static void main(String[] args) {
		
		//is Empty()
		//isPresent()
		//isPresent(Consumer Lambda)
		//ifPresentOrElse(consumer Lambda,Runnable Lambda)
		
		Optional<String>ops = Optional.ofNullable("Latur");
		
		ops.ifPresentOrElse((i)->{System.out.println(i.toUpperCase());},()->{System.out.println("Defult value");});
	}

}
