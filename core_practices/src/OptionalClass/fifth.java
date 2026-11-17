package OptionalClass;

import java.util.Optional;

public class fifth {
	
	public static void main(String[] args) {
		
		 Optional<String>ops = Optional.ofNullable(null);
		 
		 //System.out.println(ops.orElse("mumbai"));
		 
		 System.out.println(ops.orElseGet(()->{return new String("mumbai");})); //Suplier
	}

}
