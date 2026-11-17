package StringApi;

import java.util.List;
import java.util.Optional;

public class minExample {
	
	public static void main(String[] args) {
		
		 Optional<Integer>ops = List.of(11,89,78,25,52)
				 
				 .stream()
				 .min((i,j)->{return Integer.compare(i, j);});
		 
		         //.mix((i,j)->{return Integer.compare(i, j);});
		 
		 System.out.println(ops.get());
	}

}
