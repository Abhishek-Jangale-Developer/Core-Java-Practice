package OptionalClass;

import java.util.Optional;

public class fourth {
	
	public static void main(String[] args) {
		
//		Optional<String>ops = Optional.ofNullable("Latur");
//		
//		System.out.println(ops.filter((i)->{return i.length()>50;}));   
		
		
        Optional<String>ops = Optional.ofNullable(null);
		
		System.out.println(ops.flatMap((i)->{return Optional.of(i.toUpperCase());}));  
        
          //Suplier
	}

}
