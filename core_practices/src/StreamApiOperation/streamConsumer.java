package StreamApiOperation;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class streamConsumer {
	public static void main(String[] args) {
		
		//Consumer<Integer>cons=(i)->{System.out.println(i);};
		
		//Predicate<Integer> pred=(i)->{return i%2==0;};
		
		List<Integer> list=List.of(11,55,22,47,96,55,87);
		
		//list.stream() .filter(pred)	.forEach(cons);
		
		list.stream()
		.filter((i)->(i%2==0))
		//.filter((i)->{return i%2==0;})
		.forEach((i)->{System.out.println(i);});
	}

}
